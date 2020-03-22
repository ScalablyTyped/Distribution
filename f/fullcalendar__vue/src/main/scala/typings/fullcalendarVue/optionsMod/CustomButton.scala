package typings.fullcalendarVue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomButton extends js.Object {
  var bootstrapFontAwesome: js.UndefOr[js.Any] = js.undefined
  var click: js.UndefOr[js.Function0[_]] = js.undefined
  var icon: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object CustomButton {
  @scala.inline
  def apply(
    bootstrapFontAwesome: js.Any = null,
    click: () => _ = null,
    icon: js.Any = null,
    text: String = null
  ): CustomButton = {
    val __obj = js.Dynamic.literal()
    if (bootstrapFontAwesome != null) __obj.updateDynamic("bootstrapFontAwesome")(bootstrapFontAwesome.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction0(click))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomButton]
  }
}

