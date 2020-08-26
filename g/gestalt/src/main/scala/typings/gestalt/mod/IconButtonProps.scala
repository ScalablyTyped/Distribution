package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.anon.Path
import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.lightGray
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.transparent
import typings.gestalt.gestaltStrings.transparentDarkGray
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconButtonProps extends js.Object {
  var accessibilityExpanded: js.UndefOr[Boolean] = js.native
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.native
  var accessibilityLabel: String = js.native
  var bgColor: js.UndefOr[transparent | transparentDarkGray | gray | lightGray | white | blue] = js.native
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Icons] = js.native
  var iconColor: js.UndefOr[blue | darkGray | gray | red | white | orange] = js.native
  var onClick: js.UndefOr[js.Function1[/* args */ Event, Unit]] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.native
}

object IconButtonProps {
  @scala.inline
  def apply(accessibilityLabel: String): IconButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
  @scala.inline
  implicit class IconButtonPropsOps[Self <: IconButtonProps] (val x: Self) extends AnyVal {
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityExpanded(value: Boolean): Self = this.set("accessibilityExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityExpanded: Self = this.set("accessibilityExpanded", js.undefined)
    @scala.inline
    def setAccessibilityHaspopup(value: Boolean): Self = this.set("accessibilityHaspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityHaspopup: Self = this.set("accessibilityHaspopup", js.undefined)
    @scala.inline
    def setBgColor(value: transparent | transparentDarkGray | gray | lightGray | white | blue): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setDangerouslySetSvgPath(value: Path): Self = this.set("dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetSvgPath: Self = this.set("dangerouslySetSvgPath", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: Icons): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconColor(value: blue | darkGray | gray | red | white | orange): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    @scala.inline
    def setOnClick(value: /* args */ Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSize(value: xs | sm | md | lg | xl): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

