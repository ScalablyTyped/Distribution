package typings.epiceditor

import typings.epiceditor.anon.AutoSave
import typings.epiceditor.anon.Base
import typings.epiceditor.anon.Fullscreen
import typings.epiceditor.anon.ToggleEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EpicEditorOptions extends StObject {
  
  var basePath: js.UndefOr[String] = js.native
  
  var clientSideStorage: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[js.Any] = js.native
  
  var file: js.UndefOr[AutoSave] = js.native
  
  var focusOnLoad: js.UndefOr[Boolean] = js.native
  
  var localStorageName: js.UndefOr[String] = js.native
  
  var parser: js.UndefOr[js.Any] = js.native
  
  var shortcut: js.UndefOr[Fullscreen] = js.native
  
  var string: js.UndefOr[ToggleEdit] = js.native
  
  var textarea: js.UndefOr[js.Any] = js.native
  
  var theme: js.UndefOr[Base] = js.native
  
  var useNativeFullsreen: js.UndefOr[Boolean] = js.native
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
