package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditFlags extends StObject {
  
  /**
    * Whether the renderer believes it can copy.
    */
  var canCopy: Boolean
  
  /**
    * Whether the renderer believes it can cut.
    */
  var canCut: Boolean
  
  /**
    * Whether the renderer believes it can delete.
    */
  var canDelete: Boolean
  
  /**
    * Whether the renderer believes it can edit text richly.
    */
  var canEditRichly: Boolean
  
  /**
    * Whether the renderer believes it can paste.
    */
  var canPaste: Boolean
  
  /**
    * Whether the renderer believes it can redo.
    */
  var canRedo: Boolean
  
  /**
    * Whether the renderer believes it can select all.
    */
  var canSelectAll: Boolean
  
  /**
    * Whether the renderer believes it can undo.
    */
  var canUndo: Boolean
}
object EditFlags {
  
  inline def apply(
    canCopy: Boolean,
    canCut: Boolean,
    canDelete: Boolean,
    canEditRichly: Boolean,
    canPaste: Boolean,
    canRedo: Boolean,
    canSelectAll: Boolean,
    canUndo: Boolean
  ): EditFlags = {
    val __obj = js.Dynamic.literal(canCopy = canCopy.asInstanceOf[js.Any], canCut = canCut.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canEditRichly = canEditRichly.asInstanceOf[js.Any], canPaste = canPaste.asInstanceOf[js.Any], canRedo = canRedo.asInstanceOf[js.Any], canSelectAll = canSelectAll.asInstanceOf[js.Any], canUndo = canUndo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditFlags]
  }
  
  extension [Self <: EditFlags](x: Self) {
    
    inline def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
    
    inline def setCanCut(value: Boolean): Self = StObject.set(x, "canCut", value.asInstanceOf[js.Any])
    
    inline def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    inline def setCanEditRichly(value: Boolean): Self = StObject.set(x, "canEditRichly", value.asInstanceOf[js.Any])
    
    inline def setCanPaste(value: Boolean): Self = StObject.set(x, "canPaste", value.asInstanceOf[js.Any])
    
    inline def setCanRedo(value: Boolean): Self = StObject.set(x, "canRedo", value.asInstanceOf[js.Any])
    
    inline def setCanSelectAll(value: Boolean): Self = StObject.set(x, "canSelectAll", value.asInstanceOf[js.Any])
    
    inline def setCanUndo(value: Boolean): Self = StObject.set(x, "canUndo", value.asInstanceOf[js.Any])
  }
}
