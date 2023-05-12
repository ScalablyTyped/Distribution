package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditingTextsBase extends StObject {
  
  /**
    * Specifies text for a hint that appears when a user pauses on the global &apos;Add&apos; button. Applies only if editing.allowAdding is true.
    */
  var addRow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for a hint that appears when a user pauses on the &apos;Discard&apos; button. Applies only if editing.mode is &apos;batch&apos;.
    */
  var cancelAllChanges: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for a button that cancels changes in a row. Applies only if editing.allowUpdating is true and editing.mode is &apos;row&apos;.
    */
  var cancelRowChanges: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a message that prompts a user to confirm deletion.
    */
  var confirmDeleteMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a title for the window that asks a user to confirm deletion.
    */
  var confirmDeleteTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for buttons that delete rows. Applies only if allowDeleting is true.
    */
  var deleteRow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for buttons that switch rows into the editing state. Applies only if allowUpdating is true.
    */
  var editRow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for a hint that appears when a user pauses on the global &apos;Save&apos; button. Applies only if editing.mode is &apos;batch&apos;.
    */
  var saveAllChanges: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for a button that saves changes made in a row. Applies only if allowUpdating is true.
    */
  var saveRowChanges: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for buttons that recover deleted rows. Applies only if allowDeleting is true and editing.mode is &apos;batch&apos;.
    */
  var undeleteRow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for a hint appearing when a user pauses on the button that cancels changes in a cell. Applies only if editing.mode is &apos;cell&apos; and data validation is enabled.
    */
  var validationCancelChanges: js.UndefOr[String] = js.undefined
}
object EditingTextsBase {
  
  inline def apply(): EditingTextsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditingTextsBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditingTextsBase] (val x: Self) extends AnyVal {
    
    inline def setAddRow(value: String): Self = StObject.set(x, "addRow", value.asInstanceOf[js.Any])
    
    inline def setAddRowUndefined: Self = StObject.set(x, "addRow", js.undefined)
    
    inline def setCancelAllChanges(value: String): Self = StObject.set(x, "cancelAllChanges", value.asInstanceOf[js.Any])
    
    inline def setCancelAllChangesUndefined: Self = StObject.set(x, "cancelAllChanges", js.undefined)
    
    inline def setCancelRowChanges(value: String): Self = StObject.set(x, "cancelRowChanges", value.asInstanceOf[js.Any])
    
    inline def setCancelRowChangesUndefined: Self = StObject.set(x, "cancelRowChanges", js.undefined)
    
    inline def setConfirmDeleteMessage(value: String): Self = StObject.set(x, "confirmDeleteMessage", value.asInstanceOf[js.Any])
    
    inline def setConfirmDeleteMessageUndefined: Self = StObject.set(x, "confirmDeleteMessage", js.undefined)
    
    inline def setConfirmDeleteTitle(value: String): Self = StObject.set(x, "confirmDeleteTitle", value.asInstanceOf[js.Any])
    
    inline def setConfirmDeleteTitleUndefined: Self = StObject.set(x, "confirmDeleteTitle", js.undefined)
    
    inline def setDeleteRow(value: String): Self = StObject.set(x, "deleteRow", value.asInstanceOf[js.Any])
    
    inline def setDeleteRowUndefined: Self = StObject.set(x, "deleteRow", js.undefined)
    
    inline def setEditRow(value: String): Self = StObject.set(x, "editRow", value.asInstanceOf[js.Any])
    
    inline def setEditRowUndefined: Self = StObject.set(x, "editRow", js.undefined)
    
    inline def setSaveAllChanges(value: String): Self = StObject.set(x, "saveAllChanges", value.asInstanceOf[js.Any])
    
    inline def setSaveAllChangesUndefined: Self = StObject.set(x, "saveAllChanges", js.undefined)
    
    inline def setSaveRowChanges(value: String): Self = StObject.set(x, "saveRowChanges", value.asInstanceOf[js.Any])
    
    inline def setSaveRowChangesUndefined: Self = StObject.set(x, "saveRowChanges", js.undefined)
    
    inline def setUndeleteRow(value: String): Self = StObject.set(x, "undeleteRow", value.asInstanceOf[js.Any])
    
    inline def setUndeleteRowUndefined: Self = StObject.set(x, "undeleteRow", js.undefined)
    
    inline def setValidationCancelChanges(value: String): Self = StObject.set(x, "validationCancelChanges", value.asInstanceOf[js.Any])
    
    inline def setValidationCancelChangesUndefined: Self = StObject.set(x, "validationCancelChanges", js.undefined)
  }
}
