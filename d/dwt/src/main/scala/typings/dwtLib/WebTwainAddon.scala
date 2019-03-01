package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTwainAddon extends js.Object {
  var OCR: OCR
  var OCRPro: OCRPro
  var PDF: PDF
  var Webcam: Webcam
}

object WebTwainAddon {
  @scala.inline
  def apply(OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): WebTwainAddon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OCR")(OCR)
    __obj.updateDynamic("OCRPro")(OCRPro)
    __obj.updateDynamic("PDF")(PDF)
    __obj.updateDynamic("Webcam")(Webcam)
    __obj.asInstanceOf[WebTwainAddon]
  }
}

