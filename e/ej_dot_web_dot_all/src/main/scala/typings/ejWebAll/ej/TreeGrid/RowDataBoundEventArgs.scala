package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDataBoundEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the data of rendering row record.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Returns the row element of rendering row.
    */
  var rowElement: js.UndefOr[js.Any] = js.native
}
object RowDataBoundEventArgs {
  
  @scala.inline
  def apply(): RowDataBoundEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDataBoundEventArgs]
  }
  
  @scala.inline
  implicit class RowDataBoundEventArgsOps[Self <: RowDataBoundEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRowElement(value: js.Any): Self = this.set("rowElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowElement: Self = this.set("rowElement", js.undefined)
  }
}
