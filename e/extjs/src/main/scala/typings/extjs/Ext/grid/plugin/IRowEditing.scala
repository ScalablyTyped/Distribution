package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowEditing extends IEditing {
  /** [Config Option] (Boolean) */
  var autoCancel: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var clicksToMoveEditor: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var errorSummary: js.UndefOr[Boolean] = js.native
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
    * @param record Ext.data.Model The Store data record which backs the row to be edited.
    * @param columnHeader Ext.data.Model The Column object defining the column to be edited.
    * @returns Boolean true if editing was started, false otherwise.
    */
  @JSName("startEdit")
  var startEdit_IRowEditing: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Boolean]
  ] = js.native
}

object IRowEditing {
  @scala.inline
  def apply(): IRowEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowEditing]
  }
  @scala.inline
  implicit class IRowEditingOps[Self <: IRowEditing] (val x: Self) extends AnyVal {
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
    def setAutoCancel(value: Boolean): Self = this.set("autoCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCancel: Self = this.set("autoCancel", js.undefined)
    @scala.inline
    def setClicksToMoveEditor(value: Double): Self = this.set("clicksToMoveEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClicksToMoveEditor: Self = this.set("clicksToMoveEditor", js.undefined)
    @scala.inline
    def setErrorSummary(value: Boolean): Self = this.set("errorSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorSummary: Self = this.set("errorSummary", js.undefined)
    @scala.inline
    def setStartEdit(value: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Boolean): Self = this.set("startEdit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStartEdit: Self = this.set("startEdit", js.undefined)
  }
  
}

