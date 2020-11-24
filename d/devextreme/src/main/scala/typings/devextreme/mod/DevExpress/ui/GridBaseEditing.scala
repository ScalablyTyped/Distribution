package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.batch
import typings.devextreme.devextremeStrings.cell
import typings.devextreme.devextremeStrings.click
import typings.devextreme.devextremeStrings.dblClick
import typings.devextreme.devextremeStrings.form
import typings.devextreme.devextremeStrings.full
import typings.devextreme.devextremeStrings.popup
import typings.devextreme.devextremeStrings.repaint
import typings.devextreme.devextremeStrings.reshape
import typings.devextreme.devextremeStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridBaseEditing extends js.Object {
  
  /**
    * [descr:GridBase.Options.editing.changes]
    */
  var changes: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:GridBase.Options.editing.confirmDelete]
    */
  var confirmDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.editing.editColumnName]
    */
  var editColumnName: js.UndefOr[String] = js.native
  
  /**
    * [descr:GridBase.Options.editing.editRowKey]
    */
  var editRowKey: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:GridBase.Options.editing.form]
    */
  var form: js.UndefOr[dxFormOptions] = js.native
  
  /**
    * [descr:GridBase.Options.editing.mode]
    */
  var mode: js.UndefOr[batch | cell | row | form | popup] = js.native
  
  /**
    * [descr:GridBase.Options.editing.popup]
    */
  var popup: js.UndefOr[dxPopupOptions[dxPopup]] = js.native
  
  /**
    * [descr:GridBase.Options.editing.refreshMode]
    */
  var refreshMode: js.UndefOr[full | reshape | repaint] = js.native
  
  /**
    * [descr:GridBase.Options.editing.selectTextOnEditStart]
    */
  var selectTextOnEditStart: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.editing.startEditAction]
    */
  var startEditAction: js.UndefOr[click | dblClick] = js.native
  
  /**
    * [descr:GridBase.Options.editing.texts]
    */
  var texts: js.UndefOr[GridBaseEditingTexts] = js.native
  
  /**
    * [descr:GridBase.Options.editing.useIcons]
    */
  var useIcons: js.UndefOr[Boolean] = js.native
}
object GridBaseEditing {
  
  @scala.inline
  def apply(): GridBaseEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseEditing]
  }
  
  @scala.inline
  implicit class GridBaseEditingOps[Self <: GridBaseEditing] (val x: Self) extends AnyVal {
    
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
    def setChangesVarargs(value: js.Any*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[_]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
    
    @scala.inline
    def setConfirmDelete(value: Boolean): Self = this.set("confirmDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmDelete: Self = this.set("confirmDelete", js.undefined)
    
    @scala.inline
    def setEditColumnName(value: String): Self = this.set("editColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditColumnName: Self = this.set("editColumnName", js.undefined)
    
    @scala.inline
    def setEditRowKey(value: js.Any): Self = this.set("editRowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditRowKey: Self = this.set("editRowKey", js.undefined)
    
    @scala.inline
    def setForm(value: dxFormOptions): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setMode(value: batch | cell | row | form | popup): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPopup(value: dxPopupOptions[dxPopup]): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setRefreshMode(value: full | reshape | repaint): Self = this.set("refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshMode: Self = this.set("refreshMode", js.undefined)
    
    @scala.inline
    def setSelectTextOnEditStart(value: Boolean): Self = this.set("selectTextOnEditStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectTextOnEditStart: Self = this.set("selectTextOnEditStart", js.undefined)
    
    @scala.inline
    def setStartEditAction(value: click | dblClick): Self = this.set("startEditAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartEditAction: Self = this.set("startEditAction", js.undefined)
    
    @scala.inline
    def setTexts(value: GridBaseEditingTexts): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    
    @scala.inline
    def setUseIcons(value: Boolean): Self = this.set("useIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseIcons: Self = this.set("useIcons", js.undefined)
  }
}
