package typings.gestalt.mod

import typings.gestalt.gestaltStrings.`check-circle`
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.pintrest
import typings.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarProps extends js.Object {
  var icon: js.UndefOr[`check-circle` | pintrest] = js.native
  var name: String = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[sm | md | lg] = js.native
  var src: js.UndefOr[String] = js.native
  var verified: js.UndefOr[Boolean] = js.native
}

object AvatarProps {
  @scala.inline
  def apply(name: String): AvatarProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
  @scala.inline
  implicit class AvatarPropsOps[Self <: AvatarProps] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: `check-circle` | pintrest): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setSize(value: sm | md | lg): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
  }
  
}

