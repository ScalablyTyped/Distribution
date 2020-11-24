package typings.extjs.Ext.grid.plugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellEditing extends IEditing {
  
  /** [Method] Starts editing by position row column
    * @param position Object A position with keys of row and column.
    */
  var startEditByPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
    * @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record.
    * @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
    * @returns Boolean true if editing was started, false otherwise.
    */
  @JSName("startEdit")
  var startEdit_ICellEditing: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any], Boolean]
  ] = js.native
}
object ICellEditing {
  
  @scala.inline
  def apply(): ICellEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellEditing]
  }
  
  @scala.inline
  implicit class ICellEditingOps[Self <: ICellEditing] (val x: Self) extends AnyVal {
    
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
    def setStartEdit(value: (/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any]) => Boolean): Self = this.set("startEdit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStartEdit: Self = this.set("startEdit", js.undefined)
    
    @scala.inline
    def setStartEditByPosition(value: /* position */ js.UndefOr[js.Any] => Unit): Self = this.set("startEditByPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStartEditByPosition: Self = this.set("startEditByPosition", js.undefined)
  }
}
