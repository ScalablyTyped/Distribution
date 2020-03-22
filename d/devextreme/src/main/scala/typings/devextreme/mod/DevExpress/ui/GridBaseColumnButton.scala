package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseColumnButton extends js.Object {
  /** Specifies a CSS class to be applied to the button. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the text for the hint that appears when the button is hovered over or long-pressed. */
  var hint: js.UndefOr[String] = js.undefined
  /** Specifies the button's icon. */
  var icon: js.UndefOr[String] = js.undefined
  /** Specifies the button's text. Applies only if the button's icon is not specified. */
  var text: js.UndefOr[String] = js.undefined
}

object GridBaseColumnButton {
  @scala.inline
  def apply(cssClass: String = null, hint: String = null, icon: String = null, text: String = null): GridBaseColumnButton = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseColumnButton]
  }
}

