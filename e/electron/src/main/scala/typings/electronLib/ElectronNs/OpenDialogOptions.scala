package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDialogOptions extends js.Object {
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[java.lang.String] = js.undefined
  var defaultPath: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[js.Array[FileFilter]] = js.undefined
  /**
    * Message to display above input boxes.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains which features the dialog should use. The following values are
    * supported:
    */
  var properties: js.UndefOr[
    js.Array[
      electronLib.electronLibStrings.openFile | electronLib.electronLibStrings.openDirectory | electronLib.electronLibStrings.multiSelections | electronLib.electronLibStrings.showHiddenFiles | electronLib.electronLibStrings.createDirectory | electronLib.electronLibStrings.promptToCreate | electronLib.electronLibStrings.noResolveAliases | electronLib.electronLibStrings.treatPackageAsDirectory
    ]
  ] = js.undefined
  /**
    * Create when packaged for the Mac App Store.
    */
  var securityScopedBookmarks: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object OpenDialogOptions {
  @scala.inline
  def apply(
    buttonLabel: java.lang.String = null,
    defaultPath: java.lang.String = null,
    filters: js.Array[FileFilter] = null,
    message: java.lang.String = null,
    properties: js.Array[
      electronLib.electronLibStrings.openFile | electronLib.electronLibStrings.openDirectory | electronLib.electronLibStrings.multiSelections | electronLib.electronLibStrings.showHiddenFiles | electronLib.electronLibStrings.createDirectory | electronLib.electronLibStrings.promptToCreate | electronLib.electronLibStrings.noResolveAliases | electronLib.electronLibStrings.treatPackageAsDirectory
    ] = null,
    securityScopedBookmarks: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): OpenDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel)
    if (defaultPath != null) __obj.updateDynamic("defaultPath")(defaultPath)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (message != null) __obj.updateDynamic("message")(message)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(securityScopedBookmarks)) __obj.updateDynamic("securityScopedBookmarks")(securityScopedBookmarks)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[OpenDialogOptions]
  }
}

