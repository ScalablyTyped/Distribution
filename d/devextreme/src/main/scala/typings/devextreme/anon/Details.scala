package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFileManager.FileManagerItemViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  /**
    * Configures the &apos;Details&apos; file system representation mode.
    */
  var details: js.UndefOr[Columns] = js.undefined
  
  /**
    * Specifies the file system representation mode.
    */
  var mode: js.UndefOr[FileManagerItemViewMode] = js.undefined
  
  /**
    * Specifies whether to display folders in the view. When this property is false, folders are displayed in the navigation pane only.
    */
  var showFolders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the parent directory in the view.
    */
  var showParentFolder: js.UndefOr[Boolean] = js.undefined
}
object Details {
  
  inline def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: Columns): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setMode(value: FileManagerItemViewMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setShowFolders(value: Boolean): Self = StObject.set(x, "showFolders", value.asInstanceOf[js.Any])
    
    inline def setShowFoldersUndefined: Self = StObject.set(x, "showFolders", js.undefined)
    
    inline def setShowParentFolder(value: Boolean): Self = StObject.set(x, "showParentFolder", value.asInstanceOf[js.Any])
    
    inline def setShowParentFolderUndefined: Self = StObject.set(x, "showParentFolder", js.undefined)
  }
}
