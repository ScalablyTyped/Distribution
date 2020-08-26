package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns current filtering object field name.
    */
  var currentFilteringobject: js.UndefOr[js.Any] = js.native
  /** Returns the card object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.native
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the current action event type.
    */
  var originalEventType: js.UndefOr[String] = js.native
  /** Returns primary key value.
    */
  var primaryKeyValue: js.UndefOr[String] = js.native
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.native
  /** Returns the edited row index.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
  @scala.inline
  implicit class ActionBeginEventArgsOps[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
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
    def setCurrentFilteringobject(value: js.Any): Self = this.set("currentFilteringobject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentFilteringobject: Self = this.set("currentFilteringobject", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFilterCollection(value: js.Any): Self = this.set("filterCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterCollection: Self = this.set("filterCollection", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOriginalEventType(value: String): Self = this.set("originalEventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEventType: Self = this.set("originalEventType", js.undefined)
    @scala.inline
    def setPrimaryKeyValue(value: String): Self = this.set("primaryKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKeyValue: Self = this.set("primaryKeyValue", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

