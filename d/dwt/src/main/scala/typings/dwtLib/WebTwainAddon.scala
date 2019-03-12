package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTwainAddon extends js.Object {
  var OCR: dwtLib.OCR
  var OCRPro: dwtLib.OCRPro
  var PDF: dwtLib.PDF
  var Webcam: dwtLib.Webcam
}

object WebTwainAddon {
  @scala.inline
  def apply(OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): WebTwainAddon = {
    val __obj = js.Dynamic.literal(OCR = OCR, OCRPro = OCRPro, PDF = PDF, Webcam = Webcam)
  
    __obj.asInstanceOf[WebTwainAddon]
  }
}

