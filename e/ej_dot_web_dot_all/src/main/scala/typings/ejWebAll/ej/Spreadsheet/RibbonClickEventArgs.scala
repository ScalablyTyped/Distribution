package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RibbonClickEventArgs extends js.Object {
  /** Returns element Id.
    */
  var Id: js.UndefOr[String] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns isChecked in boolean.
    */
  var isChecked: js.UndefOr[Boolean] = js.native
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns target information.
    */
  var prop: js.UndefOr[js.Any] = js.native
  /** Returns status.
    */
  var status: js.UndefOr[Boolean] = js.native
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RibbonClickEventArgs {
  @scala.inline
  def apply(): RibbonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RibbonClickEventArgs]
  }
  @scala.inline
  implicit class RibbonClickEventArgsOps[Self <: RibbonClickEventArgs] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setProp(value: js.Any): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProp: Self = this.set("prop", js.undefined)
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

