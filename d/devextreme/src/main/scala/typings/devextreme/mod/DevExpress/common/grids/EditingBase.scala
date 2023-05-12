package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.ui.dxForm.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditingBase[TRowData, TKey] extends StObject {
  
  /**
    * An array of pending row changes.
    */
  var changes: js.UndefOr[js.Array[DataChange[TRowData, TKey]]] = js.undefined
  
  /**
    * Specifies if confirmation is required when a user deletes a row.
    */
  var confirmDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of a column being edited. Applies only if editing.mode is &apos;cell&apos; or &apos;batch&apos;.
    */
  var editColumnName: js.UndefOr[String] = js.undefined
  
  /**
    * The key(s) of a row being edited.
    */
  var editRowKey: js.UndefOr[TKey] = js.undefined
  
  /**
    * Configures the form. Used only if editing.mode is &apos;form&apos; or &apos;popup&apos;.
    */
  var form: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies how a user edits data.
    */
  var mode: js.UndefOr[GridsEditMode] = js.undefined
  
  /**
    * Configures the popup. Used only if editing.mode is &apos;popup&apos;.
    */
  var popup: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxPopup.Properties] = js.undefined
  
  /**
    * Specifies operations that are performed after saving changes.
    */
  var refreshMode: js.UndefOr[GridsEditRefreshMode] = js.undefined
  
  /**
    * Specifies whether to select text in a cell when a user starts editing.
    */
  var selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a single or double click should switch a cell to the editing state. Applies if editing.mode is &apos;cell&apos; or &apos;batch&apos;.
    */
  var startEditAction: js.UndefOr[StartEditAction] = js.undefined
  
  /**
    * Contains properties that specify texts for editing-related UI elements.
    */
  var texts: js.UndefOr[EditingTextsBase] = js.undefined
  
  /**
    * Specifies whether the edit column uses icons instead of links.
    */
  var useIcons: js.UndefOr[Boolean] = js.undefined
}
object EditingBase {
  
  inline def apply[TRowData, TKey](): EditingBase[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditingBase[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditingBase[?, ?], TRowData, TKey] (val x: Self & (EditingBase[TRowData, TKey])) extends AnyVal {
    
    inline def setChanges(value: js.Array[DataChange[TRowData, TKey]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: (DataChange[TRowData, TKey])*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setConfirmDelete(value: Boolean): Self = StObject.set(x, "confirmDelete", value.asInstanceOf[js.Any])
    
    inline def setConfirmDeleteUndefined: Self = StObject.set(x, "confirmDelete", js.undefined)
    
    inline def setEditColumnName(value: String): Self = StObject.set(x, "editColumnName", value.asInstanceOf[js.Any])
    
    inline def setEditColumnNameUndefined: Self = StObject.set(x, "editColumnName", js.undefined)
    
    inline def setEditRowKey(value: TKey): Self = StObject.set(x, "editRowKey", value.asInstanceOf[js.Any])
    
    inline def setEditRowKeyUndefined: Self = StObject.set(x, "editRowKey", js.undefined)
    
    inline def setForm(value: Properties): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setMode(value: GridsEditMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPopup(value: typings.devextreme.mod.DevExpress.ui.dxPopup.Properties): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setRefreshMode(value: GridsEditRefreshMode): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
    
    inline def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
    
    inline def setSelectTextOnEditStart(value: Boolean): Self = StObject.set(x, "selectTextOnEditStart", value.asInstanceOf[js.Any])
    
    inline def setSelectTextOnEditStartUndefined: Self = StObject.set(x, "selectTextOnEditStart", js.undefined)
    
    inline def setStartEditAction(value: StartEditAction): Self = StObject.set(x, "startEditAction", value.asInstanceOf[js.Any])
    
    inline def setStartEditActionUndefined: Self = StObject.set(x, "startEditAction", js.undefined)
    
    inline def setTexts(value: EditingTextsBase): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setUseIcons(value: Boolean): Self = StObject.set(x, "useIcons", value.asInstanceOf[js.Any])
    
    inline def setUseIconsUndefined: Self = StObject.set(x, "useIcons", js.undefined)
  }
}
