package typings.electron.Electron

import typings.electron.electronStrings.createDirectory
import typings.electron.electronStrings.dontAddToRecent
import typings.electron.electronStrings.multiSelections
import typings.electron.electronStrings.noResolveAliases
import typings.electron.electronStrings.openDirectory
import typings.electron.electronStrings.openFile
import typings.electron.electronStrings.promptToCreate
import typings.electron.electronStrings.showHiddenFiles
import typings.electron.electronStrings.treatPackageAsDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenDialogSyncOptions extends StObject {
  
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[String] = js.native
  
  var defaultPath: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[js.Array[FileFilter]] = js.native
  
  /**
    * Message to display above input boxes.
    *
    * @platform darwin
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Contains which features the dialog should use. The following values are
    * supported:
    */
  var properties: js.UndefOr[
    js.Array[
      openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent
    ]
  ] = js.native
  
  /**
    * Create security scoped bookmarks when packaged for the Mac App Store.
    *
    * @platform darwin,mas
    */
  var securityScopedBookmarks: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object OpenDialogSyncOptions {
  
  @scala.inline
  def apply(): OpenDialogSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDialogSyncOptions]
  }
  
  @scala.inline
  implicit class OpenDialogSyncOptionsMutableBuilder[Self <: OpenDialogSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
    
    @scala.inline
    def setDefaultPath(value: String): Self = StObject.set(x, "defaultPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPathUndefined: Self = StObject.set(x, "defaultPath", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[FileFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: FileFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProperties(
      value: js.Array[
          openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent
        ]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(
      value: (openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent)*
    ): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setSecurityScopedBookmarks(value: Boolean): Self = StObject.set(x, "securityScopedBookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityScopedBookmarksUndefined: Self = StObject.set(x, "securityScopedBookmarks", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
