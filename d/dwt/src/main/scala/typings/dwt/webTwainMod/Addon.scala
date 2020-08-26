package typings.dwt.webTwainMod

import typings.dwt.addonBarcodeReaderMod.BarcodeReader
import typings.dwt.addonOCRMod.OCR
import typings.dwt.addonOCRProMod.OCRPro
import typings.dwt.addonPDFMod.PDF
import typings.dwt.addonWebcamMod.Webcam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addon extends js.Object {
  var BarcodeReader: typings.dwt.addonBarcodeReaderMod.BarcodeReader = js.native
  var OCR: typings.dwt.addonOCRMod.OCR = js.native
  var OCRPro: typings.dwt.addonOCRProMod.OCRPro = js.native
  var PDF: typings.dwt.addonPDFMod.PDF = js.native
  var Webcam: typings.dwt.addonWebcamMod.Webcam = js.native
}

object Addon {
  @scala.inline
  def apply(BarcodeReader: BarcodeReader, OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): Addon = {
    val __obj = js.Dynamic.literal(BarcodeReader = BarcodeReader.asInstanceOf[js.Any], OCR = OCR.asInstanceOf[js.Any], OCRPro = OCRPro.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], Webcam = Webcam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addon]
  }
  @scala.inline
  implicit class AddonOps[Self <: Addon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBarcodeReader(value: BarcodeReader): Self = this.set("BarcodeReader", value.asInstanceOf[js.Any])
    @scala.inline
    def setOCR(value: OCR): Self = this.set("OCR", value.asInstanceOf[js.Any])
    @scala.inline
    def setOCRPro(value: OCRPro): Self = this.set("OCRPro", value.asInstanceOf[js.Any])
    @scala.inline
    def setPDF(value: PDF): Self = this.set("PDF", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebcam(value: Webcam): Self = this.set("Webcam", value.asInstanceOf[js.Any])
  }
  
}

