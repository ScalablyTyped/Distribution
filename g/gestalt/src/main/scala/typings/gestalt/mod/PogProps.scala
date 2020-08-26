package typings.gestalt.mod

import typings.gestalt.anon.PathString
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
trait PogProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var bgColor: js.UndefOr[transparent | lightGray | white | gray | blue | transparentDarkGray] = js.native
  var dangerouslySetSvgPath: js.UndefOr[PathString] = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var hovered: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Icons] = js.native
  var iconColor: js.UndefOr[blue | darkGray | gray | red | white | orange] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.native
}

object PogProps {
  @scala.inline
  def apply(): PogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PogProps]
  }
  @scala.inline
  implicit class PogPropsOps[Self <: PogProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setBgColor(value: transparent | lightGray | white | gray | blue | transparentDarkGray): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setDangerouslySetSvgPath(value: PathString): Self = this.set("dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetSvgPath: Self = this.set("dangerouslySetSvgPath", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setHovered(value: Boolean): Self = this.set("hovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHovered: Self = this.set("hovered", js.undefined)
    @scala.inline
    def setIcon(value: Icons): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconColor(value: blue | darkGray | gray | red | white | orange): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
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

