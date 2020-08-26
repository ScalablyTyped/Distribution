package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerClickEventArgs extends js.Object {
  /** Returns the active sheet index.
    */
  var activeSheet: js.UndefOr[Double] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the new sheet index.
    */
  var gotoSheet: js.UndefOr[Double] = js.native
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns whether new sheet icon is clicked.
    */
  var newSheet: js.UndefOr[Boolean] = js.native
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object PagerClickEventArgs {
  @scala.inline
  def apply(): PagerClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerClickEventArgs]
  }
  @scala.inline
  implicit class PagerClickEventArgsOps[Self <: PagerClickEventArgs] (val x: Self) extends AnyVal {
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
    def setActiveSheet(value: Double): Self = this.set("activeSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveSheet: Self = this.set("activeSheet", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setGotoSheet(value: Double): Self = this.set("gotoSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGotoSheet: Self = this.set("gotoSheet", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNewSheet(value: Boolean): Self = this.set("newSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewSheet: Self = this.set("newSheet", js.undefined)
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

