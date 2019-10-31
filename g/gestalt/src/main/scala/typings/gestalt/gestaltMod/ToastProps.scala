package typings.gestalt.gestaltMod

import typings.gestalt.gestaltStrings.`arrow-circle-forward`
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.red
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  var color: js.UndefOr[darkGray | orange | red] = js.undefined
  var icon: js.UndefOr[`arrow-circle-forward`] = js.undefined
  var text: js.UndefOr[String | js.Array[String]] = js.undefined
  var thumbnail: js.UndefOr[ReactElement] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    color: darkGray | orange | red = null,
    icon: `arrow-circle-forward` = null,
    text: String | js.Array[String] = null,
    thumbnail: ReactElement = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[ToastProps]
  }
}

