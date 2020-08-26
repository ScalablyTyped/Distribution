package typings.ejWebAll.ej.Tab

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemRemoveEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the tab model.
    */
  var model: js.UndefOr[Model] = js.native
  /** returns removed tab header.
    */
  var removedTab: js.UndefOr[HTMLElement] = js.native
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ItemRemoveEventArgs {
  @scala.inline
  def apply(): ItemRemoveEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemRemoveEventArgs]
  }
  @scala.inline
  implicit class ItemRemoveEventArgsOps[Self <: ItemRemoveEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRemovedTab(value: HTMLElement): Self = this.set("removedTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovedTab: Self = this.set("removedTab", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

