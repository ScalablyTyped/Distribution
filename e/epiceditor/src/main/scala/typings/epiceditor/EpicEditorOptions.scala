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
  
  var container: js.UndefOr[js.Any] = js.undefined
  
  var file: js.UndefOr[AutoSave] = js.undefined
  
  var focusOnLoad: js.UndefOr[Boolean] = js.undefined
  
  var localStorageName: js.UndefOr[String] = js.undefined
  
  var parser: js.UndefOr[js.Any] = js.undefined
  
  var shortcut: js.UndefOr[Fullscreen] = js.undefined
  
  var string: js.UndefOr[ToggleEdit] = js.undefined
  
  var textarea: js.UndefOr[js.Any] = js.undefined
  
  var theme: js.UndefOr[Base] = js.undefined
  
  var useNativeFullsreen: js.UndefOr[Boolean] = js.undefined
}
object EpicEditorOptions {
  
  @scala.inline
  def apply(): EpicEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EpicEditorOptions]
  }
  
  @scala.inline
  implicit class EpicEditorOptionsMutableBuilder[Self <: EpicEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setClientSideStorage(value: Boolean): Self = StObject.set(x, "clientSideStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSideStorageUndefined: Self = StObject.set(x, "clientSideStorage", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setFile(value: AutoSave): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFocusOnLoad(value: Boolean): Self = StObject.set(x, "focusOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOnLoadUndefined: Self = StObject.set(x, "focusOnLoad", js.undefined)
    
    @scala.inline
    def setLocalStorageName(value: String): Self = StObject.set(x, "localStorageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalStorageNameUndefined: Self = StObject.set(x, "localStorageName", js.undefined)
    
    @scala.inline
    def setParser(value: js.Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    @scala.inline
    def setShortcut(value: Fullscreen): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    
    @scala.inline
    def setString(value: ToggleEdit): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setTextarea(value: js.Any): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    
    @scala.inline
    def setTheme(value: Base): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setUseNativeFullsreen(value: Boolean): Self = StObject.set(x, "useNativeFullsreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeFullsreenUndefined: Self = StObject.set(x, "useNativeFullsreen", js.undefined)
  }
}
