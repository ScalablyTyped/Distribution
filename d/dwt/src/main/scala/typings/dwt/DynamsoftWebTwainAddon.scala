package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamsoftWebTwainAddon extends js.Object {
  var OCR: typings.dwt.OCR
  var OCRPro: typings.dwt.OCRPro
  var PDF: typings.dwt.PDF
  var Webcam: typings.dwt.Webcam
}

object DynamsoftWebTwainAddon {
  @scala.inline
  def apply(OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): DynamsoftWebTwainAddon = {
    val __obj = js.Dynamic.literal(OCR = OCR, OCRPro = OCRPro, PDF = PDF, Webcam = Webcam)
  
    __obj.asInstanceOf[DynamsoftWebTwainAddon]
  }
}

