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
    NewOCRError: () => OCRError,
    NewOCRReadPara: () => OCRReadPara,
    NewOCRZone: () => OCRZone,
    NewSettings: () => Settings
  ): OCRProAddon = {
    val __obj = js.Dynamic.literal(NewOCRError = js.Any.fromFunction0(NewOCRError), NewOCRReadPara = js.Any.fromFunction0(NewOCRReadPara), NewOCRZone = js.Any.fromFunction0(NewOCRZone), NewSettings = js.Any.fromFunction0(NewSettings))
  
    __obj.asInstanceOf[OCRProAddon]
  }
}

