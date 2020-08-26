package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.button
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.submit
import typings.gestalt.gestaltStrings.transparent
import typings.gestalt.gestaltStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[Boolean] = js.native
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.native
  var accessibilityLabel: js.UndefOr[String] = js.native
  var color: js.UndefOr[blue | gray | red | transparent | white] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var iconEnd: js.UndefOr[Icons] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* args */ Event, Unit]] = js.native
  var size: js.UndefOr[sm | md | lg] = js.native
  var text: String = js.native
  var textColor: js.UndefOr[blue | red | darkGray | white] = js.native
  var `type`: js.UndefOr[submit | button] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(text: String): ButtonProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityExpanded(value: Boolean): Self = this.set("accessibilityExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityExpanded: Self = this.set("accessibilityExpanded", js.undefined)
    @scala.inline
    def setAccessibilityHaspopup(value: Boolean): Self = this.set("accessibilityHaspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityHaspopup: Self = this.set("accessibilityHaspopup", js.undefined)
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setColor(value: blue | gray | red | transparent | white): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIconEnd(value: Icons): Self = this.set("iconEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconEnd: Self = this.set("iconEnd", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnClick(value: /* args */ Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSize(value: sm | md | lg): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTextColor(value: blue | red | darkGray | white): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setType(value: submit | button): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

