package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  var color: js.UndefOr[gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.orange] = js.undefined
  var icon: js.UndefOr[gestaltLib.gestaltLibStrings.`arrow-circle-forward`] = js.undefined
  var text: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var thumbnail: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    color: gestaltLib.gestaltLibStrings.darkGray | gestaltLib.gestaltLibStrings.orange = null,
    icon: gestaltLib.gestaltLibStrings.`arrow-circle-forward` = null,
    text: java.lang.String | js.Array[java.lang.String] = null,
    thumbnail: reactLib.reactMod.ReactElement = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[ToastProps]
  }
}

