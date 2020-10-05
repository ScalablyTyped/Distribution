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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenDialogSyncOptions extends js.Object {
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
  implicit class OpenDialogSyncOptionsOps[Self <: OpenDialogSyncOptions] (val x: Self) extends AnyVal {
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
    def setButtonLabel(value: String): Self = this.set("buttonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLabel: Self = this.set("buttonLabel", js.undefined)
    @scala.inline
    def setDefaultPath(value: String): Self = this.set("defaultPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPath: Self = this.set("defaultPath", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: FileFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[FileFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPropertiesVarargs(
      value: (openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent)*
    ): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(
      value: js.Array[
          openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent
        ]
    ): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setSecurityScopedBookmarks(value: Boolean): Self = this.set("securityScopedBookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityScopedBookmarks: Self = this.set("securityScopedBookmarks", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

