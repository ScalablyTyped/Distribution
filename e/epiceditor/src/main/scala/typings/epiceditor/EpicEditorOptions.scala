package typings.epiceditor

import typings.epiceditor.anon.AutoSave
import typings.epiceditor.anon.Base
import typings.epiceditor.anon.Fullscreen
import typings.epiceditor.anon.ToggleEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EpicEditorOptions extends js.Object {
  
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
  implicit class EpicEditorOptionsOps[Self <: EpicEditorOptions] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setClientSideStorage(value: Boolean): Self = this.set("clientSideStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSideStorage: Self = this.set("clientSideStorage", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setFile(value: AutoSave): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFocusOnLoad(value: Boolean): Self = this.set("focusOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnLoad: Self = this.set("focusOnLoad", js.undefined)
    
    @scala.inline
    def setLocalStorageName(value: String): Self = this.set("localStorageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalStorageName: Self = this.set("localStorageName", js.undefined)
    
    @scala.inline
    def setParser(value: js.Any): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setShortcut(value: Fullscreen): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcut: Self = this.set("shortcut", js.undefined)
    
    @scala.inline
    def setString(value: ToggleEdit): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    
    @scala.inline
    def setTextarea(value: js.Any): Self = this.set("textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextarea: Self = this.set("textarea", js.undefined)
    
    @scala.inline
    def setTheme(value: Base): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUseNativeFullsreen(value: Boolean): Self = this.set("useNativeFullsreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeFullsreen: Self = this.set("useNativeFullsreen", js.undefined)
  }
}
