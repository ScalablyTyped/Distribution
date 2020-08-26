package typings.ejWebAll.ej.Rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventArgs extends js.Object {
  /** returns the current slide index.
    */
  var activeItemIndex: js.UndefOr[Double] = js.native
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** the current rotator id.
    */
  var itemId: js.UndefOr[String] = js.native
  /** returns the rotator model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object ChangeEventArgs {
  @scala.inline
  def apply(): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeEventArgs]
  }
  @scala.inline
  implicit class ChangeEventArgsOps[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setActiveItemIndex(value: Double): Self = this.set("activeItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveItemIndex: Self = this.set("activeItemIndex", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

