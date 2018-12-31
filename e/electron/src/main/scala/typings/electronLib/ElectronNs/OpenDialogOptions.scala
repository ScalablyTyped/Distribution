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

