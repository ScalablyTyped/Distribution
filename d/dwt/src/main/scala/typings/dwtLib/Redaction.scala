package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redaction extends js.Object {
  var FindText: java.lang.String
  var FindTextAction: EnumDWT_OCRFindTextAction
  var FindTextFlags: EnumDWT_OCRFindTextFlags
}

object Redaction {
  @scala.inline
  def apply(
    FindText: java.lang.String,
    FindTextAction: EnumDWT_OCRFindTextAction,
    FindTextFlags: EnumDWT_OCRFindTextFlags
  ): Redaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FindText")(FindText)
    __obj.updateDynamic("FindTextAction")(FindTextAction)
    __obj.updateDynamic("FindTextFlags")(FindTextFlags)
    __obj.asInstanceOf[Redaction]
  }
}

