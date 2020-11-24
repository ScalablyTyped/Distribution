package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDataGridEditing extends GridBaseEditing {
  
  /**
    * [descr:dxDataGrid.Options.editing.allowAdding]
    */
  var allowAdding: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxDataGrid.Options.editing.allowDeleting]
    */
  var allowDeleting: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentRow, Boolean])] = js.native
  
  /**
    * [descr:dxDataGrid.Options.editing.allowUpdating]
    */
  var allowUpdating: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentRow, Boolean])] = js.native
  
  /**
    * [descr:dxDataGrid.Options.editing.texts]
    */
  @JSName("texts")
  var texts_dxDataGridEditing: js.UndefOr[js.Any] = js.native
}
object dxDataGridEditing {
  
  @scala.inline
  def apply(): dxDataGridEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridEditing]
  }
  
  @scala.inline
  implicit class dxDataGridEditingOps[Self <: dxDataGridEditing] (val x: Self) extends AnyVal {
    
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
    def setAllowAdding(value: Boolean): Self = this.set("allowAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAdding: Self = this.set("allowAdding", js.undefined)
    
    @scala.inline
    def setAllowDeletingFunction1(value: /* options */ ComponentRow => Boolean): Self = this.set("allowDeleting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllowDeleting(value: Boolean | (js.Function1[/* options */ ComponentRow, Boolean])): Self = this.set("allowDeleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleting: Self = this.set("allowDeleting", js.undefined)
    
    @scala.inline
    def setAllowUpdatingFunction1(value: /* options */ ComponentRow => Boolean): Self = this.set("allowUpdating", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllowUpdating(value: Boolean | (js.Function1[/* options */ ComponentRow, Boolean])): Self = this.set("allowUpdating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUpdating: Self = this.set("allowUpdating", js.undefined)
    
    @scala.inline
    def setTexts(value: js.Any): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
  }
}
