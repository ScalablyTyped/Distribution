package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichText extends js.Object {
  var font: js.UndefOr[Font] = js.undefined
  var text: java.lang.String
}

object RichText {
  @scala.inline
  def apply(text: java.lang.String, font: Font = null): RichText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[RichText]
  }
}

