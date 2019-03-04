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
    val __obj = js.Dynamic.literal(OCR = OCR, OCRPro = OCRPro, PDF = PDF, Webcam = Webcam)
  
    __obj.asInstanceOf[WebTwainAddon]
  }
}

