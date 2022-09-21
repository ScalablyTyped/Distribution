package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** See Electron docs for explanations. https://www.electronjs.org/docs/api/dialog */
trait ShowSaveDialogOptions extends StObject {
  
  var buttonLabel: js.UndefOr[String] = js.undefined
  
  var defaultPath: js.UndefOr[String] = js.undefined
  
  var filters: js.UndefOr[js.Array[FileFilter]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var nameFieldLabel: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object ShowSaveDialogOptions {
  
  inline def apply(): ShowSaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowSaveDialogOptions]
  }
  
  extension [Self <: ShowSaveDialogOptions](x: Self) {
    
    inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
    
    inline def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
    
    inline def setDefaultPath(value: String): Self = StObject.set(x, "defaultPath", value.asInstanceOf[js.Any])
    
    inline def setDefaultPathUndefined: Self = StObject.set(x, "defaultPath", js.undefined)
    
    inline def setFilters(value: js.Array[FileFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: FileFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNameFieldLabel(value: String): Self = StObject.set(x, "nameFieldLabel", value.asInstanceOf[js.Any])
    
    inline def setNameFieldLabelUndefined: Self = StObject.set(x, "nameFieldLabel", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
