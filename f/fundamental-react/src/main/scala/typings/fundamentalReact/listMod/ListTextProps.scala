package typings.fundamentalReact.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTextProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var noWrap: js.UndefOr[Boolean] = js.native
  var secondary: js.UndefOr[Boolean] = js.native
}

object ListTextProps {
  @scala.inline
  def apply(): ListTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTextProps]
  }
  @scala.inline
  implicit class ListTextPropsOps[Self <: ListTextProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
  
}

