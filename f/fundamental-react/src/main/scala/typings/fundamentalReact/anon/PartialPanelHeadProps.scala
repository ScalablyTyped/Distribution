package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Panel/Panel.PanelHeadProps> */
@js.native
trait PartialPanelHeadProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.native
  var title: js.UndefOr[String] = js.native
}

object PartialPanelHeadProps {
  @scala.inline
  def apply(): PartialPanelHeadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPanelHeadProps]
  }
  @scala.inline
  implicit class PartialPanelHeadPropsOps[Self <: PartialPanelHeadProps] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHeadingLevel(value: `2` | `3` | `4` | `5` | `6`): Self = this.set("headingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadingLevel: Self = this.set("headingLevel", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

