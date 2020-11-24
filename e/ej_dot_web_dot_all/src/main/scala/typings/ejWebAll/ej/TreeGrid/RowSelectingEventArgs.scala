package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowSelectingEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the data selecting record.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Returns the previous selected data.
    */
  var previousData: js.UndefOr[js.Any] = js.native
  
  /** Returns the previous selected row index.
    */
  var previousIndex: js.UndefOr[String] = js.native
  
  /** Returns the previous selected row element.
    */
  var previousTreeGridRow: js.UndefOr[js.Any] = js.native
  
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[String] = js.native
  
  /** Returns the selecting row element.
    */
  var targetRow: js.UndefOr[js.Any] = js.native
}
object RowSelectingEventArgs {
  
  @scala.inline
  def apply(): RowSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectingEventArgs]
  }
  
  @scala.inline
  implicit class RowSelectingEventArgsOps[Self <: RowSelectingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setPreviousData(value: js.Any): Self = this.set("previousData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousData: Self = this.set("previousData", js.undefined)
    
    @scala.inline
    def setPreviousIndex(value: String): Self = this.set("previousIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousIndex: Self = this.set("previousIndex", js.undefined)
    
    @scala.inline
    def setPreviousTreeGridRow(value: js.Any): Self = this.set("previousTreeGridRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousTreeGridRow: Self = this.set("previousTreeGridRow", js.undefined)
    
    @scala.inline
    def setRecordIndex(value: String): Self = this.set("recordIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordIndex: Self = this.set("recordIndex", js.undefined)
    
    @scala.inline
    def setTargetRow(value: js.Any): Self = this.set("targetRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRow: Self = this.set("targetRow", js.undefined)
  }
}
