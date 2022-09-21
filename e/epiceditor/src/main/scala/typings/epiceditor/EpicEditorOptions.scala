package typings.epiceditor

import typings.epiceditor.anon.AutoSave
import typings.epiceditor.anon.Base
import typings.epiceditor.anon.Fullscreen
import typings.epiceditor.anon.ToggleEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpicEditorOptions extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var clientSideStorage: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[Any] = js.undefined
  
  var file: js.UndefOr[AutoSave] = js.undefined
  
  var focusOnLoad: js.UndefOr[Boolean] = js.undefined
  
  var localStorageName: js.UndefOr[String] = js.undefined
  
  var parser: js.UndefOr[Any] = js.undefined
  
  var shortcut: js.UndefOr[Fullscreen] = js.undefined
  
  var string: js.UndefOr[ToggleEdit] = js.undefined
  
  var textarea: js.UndefOr[Any] = js.undefined
  
  var theme: js.UndefOr[Base] = js.undefined
  
  var useNativeFullsreen: js.UndefOr[Boolean] = js.undefined
}
object EpicEditorOptions {
  
  inline def apply(): EpicEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EpicEditorOptions]
  }
  
  extension [Self <: EpicEditorOptions](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setClientSideStorage(value: Boolean): Self = StObject.set(x, "clientSideStorage", value.asInstanceOf[js.Any])
    
    inline def setClientSideStorageUndefined: Self = StObject.set(x, "clientSideStorage", js.undefined)
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setFile(value: AutoSave): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFocusOnLoad(value: Boolean): Self = StObject.set(x, "focusOnLoad", value.asInstanceOf[js.Any])
    
    inline def setFocusOnLoadUndefined: Self = StObject.set(x, "focusOnLoad", js.undefined)
    
    inline def setLocalStorageName(value: String): Self = StObject.set(x, "localStorageName", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageNameUndefined: Self = StObject.set(x, "localStorageName", js.undefined)
    
    inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setShortcut(value: Fullscreen): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    
    inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    
    inline def setString(value: ToggleEdit): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setTextarea(value: Any): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    
    inline def setTheme(value: Base): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUseNativeFullsreen(value: Boolean): Self = StObject.set(x, "useNativeFullsreen", value.asInstanceOf[js.Any])
    
    inline def setUseNativeFullsreenUndefined: Self = StObject.set(x, "useNativeFullsreen", js.undefined)
  }
}
