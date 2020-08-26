package typings.focusTrapReact.mod

import typings.focusTrap.mod.Options
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends AllHTMLAttributes[js.Any] {
  var active: js.UndefOr[Boolean] = js.native
  @JSName("children")
  var children_Props: ReactElement = js.native
  var focusTrapOptions: js.UndefOr[Options] = js.native
  var paused: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply(children: ReactElement): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setFocusTrapOptions(value: Options): Self = this.set("focusTrapOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusTrapOptions: Self = this.set("focusTrapOptions", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
  }
  
}

