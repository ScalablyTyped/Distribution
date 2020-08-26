package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolBarItemClickEventArgs extends js.Object {
  /** returns the Toolbar item rendered index
    */
  var Index: js.UndefOr[String] = js.native
  /** returns the CSS class name specified for the toolbar item
    */
  var cssClass: js.UndefOr[String] = js.native
  /** returns the Toolbar item rendered group index
    */
  var groupIndex: js.UndefOr[String] = js.native
  /** returns the toolbar clicked item name .
    */
  var target: js.UndefOr[String] = js.native
  /** returns the Toolbar item value.
    */
  var value: js.UndefOr[String] = js.native
}

object ToolBarItemClickEventArgs {
  @scala.inline
  def apply(): ToolBarItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarItemClickEventArgs]
  }
  @scala.inline
  implicit class ToolBarItemClickEventArgsOps[Self <: ToolBarItemClickEventArgs] (val x: Self) extends AnyVal {
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
    def setIndex(value: String): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("Index", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setGroupIndex(value: String): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

