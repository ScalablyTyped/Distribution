package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCRProAddon extends js.Object {
  def NewOCRError(): OCRError
  def NewOCRReadPara(): OCRReadPara
  def NewOCRZone(): OCRZone
  def NewSettings(): Settings
}

object OCRProAddon {
  @scala.inline
  def apply(
    NewOCRError: js.Function0[OCRError],
    NewOCRReadPara: js.Function0[OCRReadPara],
    NewOCRZone: js.Function0[OCRZone],
    NewSettings: js.Function0[Settings]
  ): OCRProAddon = {
    val __obj = js.Dynamic.literal(NewOCRError = NewOCRError, NewOCRReadPara = NewOCRReadPara, NewOCRZone = NewOCRZone, NewSettings = NewSettings)
  
    __obj.asInstanceOf[OCRProAddon]
  }
}

