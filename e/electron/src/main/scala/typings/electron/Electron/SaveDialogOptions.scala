package typings.electron.Electron

import typings.electron.electronStrings.createDirectory
import typings.electron.electronStrings.dontAddToRecent
import typings.electron.electronStrings.showHiddenFiles
import typings.electron.electronStrings.showOverwriteConfirmation
import typings.electron.electronStrings.treatPackageAsDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveDialogOptions extends js.Object {
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[String] = js.undefined
  /**
    * Absolute directory path, absolute file path, or file name to use by default.
    */
  var defaultPath: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[js.Array[FileFilter]] = js.undefined
  /**
    * Message to display above text fields.
    *
    * @platform darwin
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Custom label for the text displayed in front of the filename text field.
    *
    * @platform darwin
    */
  var nameFieldLabel: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[
    js.Array[
      showHiddenFiles | createDirectory | treatPackageAsDirectory | showOverwriteConfirmation | dontAddToRecent
    ]
  ] = js.undefined
  /**
    * Create a security scoped bookmark when packaged for the Mac App Store. If this
    * option is enabled and the file doesn't already exist a blank file will be
    * created at the chosen path.
    *
    * @platform darwin,mas
    */
  var securityScopedBookmarks: js.UndefOr[Boolean] = js.undefined
  /**
    * Show the tags input box, defaults to `true`.
    *
    * @platform darwin
    */
  var showsTagField: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SaveDialogOptions {
  @scala.inline
  def apply(
    buttonLabel: String = null,
    defaultPath: String = null,
    filters: js.Array[FileFilter] = null,
    message: String = null,
    nameFieldLabel: String = null,
    properties: js.Array[
      showHiddenFiles | createDirectory | treatPackageAsDirectory | showOverwriteConfirmation | dontAddToRecent
    ] = null,
    securityScopedBookmarks: js.UndefOr[Boolean] = js.undefined,
    showsTagField: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel.asInstanceOf[js.Any])
    if (defaultPath != null) __obj.updateDynamic("defaultPath")(defaultPath.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (nameFieldLabel != null) __obj.updateDynamic("nameFieldLabel")(nameFieldLabel.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(securityScopedBookmarks)) __obj.updateDynamic("securityScopedBookmarks")(securityScopedBookmarks.asInstanceOf[js.Any])
    if (!js.isUndefined(showsTagField)) __obj.updateDynamic("showsTagField")(showsTagField.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveDialogOptions]
  }
}

