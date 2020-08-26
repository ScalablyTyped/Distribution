package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current grouped column field name.
    */
  var columnName: js.UndefOr[String] = js.native
  /** Returns the direction of sorting ascending or descending
    */
  var columnSortDirection: js.UndefOr[String] = js.native
  /** Returns the data of deleting element.
    */
  var data: js.UndefOr[String] = js.native
  /** Returns the edit dialog element.
    */
  var element: js.UndefOr[String] = js.native
  /** Returns the value of searching element.
    */
  var keyValue: js.UndefOr[String] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns selected record index
    */
  var recordIndex: js.UndefOr[Double] = js.native
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.native
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
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    @scala.inline
    def setColumnSortDirection(value: String): Self = this.set("columnSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSortDirection: Self = this.set("columnSortDirection", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setKeyValue(value: String): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRecordIndex(value: Double): Self = this.set("recordIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordIndex: Self = this.set("recordIndex", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

