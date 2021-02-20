package typings.electron.Electron

import typings.electron.electronStrings.createDirectory
import typings.electron.electronStrings.dontAddToRecent
import typings.electron.electronStrings.showHiddenFiles
import typings.electron.electronStrings.showOverwriteConfirmation
import typings.electron.electronStrings.treatPackageAsDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveDialogOptions extends StObject {
  
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[String] = js.native
  
  /**
    * Absolute directory path, absolute file path, or file name to use by default.
    */
  var defaultPath: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[js.Array[FileFilter]] = js.native
  
  /**
    * Message to display above text fields.
    *
    * @platform darwin
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Custom label for the text displayed in front of the filename text field.
    *
    * @platform darwin
    */
  var nameFieldLabel: js.UndefOr[String] = js.native
  
  var properties: js.UndefOr[
    js.Array[
      showHiddenFiles | createDirectory | treatPackageAsDirectory | showOverwriteConfirmation | dontAddToRecent
    ]
  ] = js.native
  
  /**
    * Create a security scoped bookmark when packaged for the Mac App Store. If this
    * option is enabled and the file doesn't already exist a blank file will be
    * created at the chosen path.
    *
    * @platform darwin,mas
    */
  var securityScopedBookmarks: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the tags input box, defaults to `true`.
    *
    * @platform darwin
    */
  var showsTagField: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SaveDialogOptions {
  
  @scala.inline
  def apply(): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveDialogOptions]
  }
  
  @scala.inline
  implicit class SaveDialogOptionsMutableBuilder[Self <: SaveDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setNameFieldLabel(value: String): Self = StObject.set(x, "nameFieldLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFieldLabelUndefined: Self = StObject.set(x, "nameFieldLabel", js.undefined)
    
    @scala.inline
    def setProperties(
      value: js.Array[
          showHiddenFiles | createDirectory | treatPackageAsDirectory | showOverwriteConfirmation | dontAddToRecent
        ]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(
      value: (showHiddenFiles | createDirectory | treatPackageAsDirectory | showOverwriteConfirmation | dontAddToRecent)*
    ): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setSecurityScopedBookmarks(value: Boolean): Self = StObject.set(x, "securityScopedBookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityScopedBookmarksUndefined: Self = StObject.set(x, "securityScopedBookmarks", js.undefined)
    
    @scala.inline
    def setShowsTagField(value: Boolean): Self = StObject.set(x, "showsTagField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsTagFieldUndefined: Self = StObject.set(x, "showsTagField", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
