package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveDialogOptions extends js.Object {
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Absolute directory path, absolute file path, or file name to use by default.
    */
  var defaultPath: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[js.Array[FileFilter]] = js.undefined
  /**
    * Message to display above text fields.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom label for the text displayed in front of the filename text field.
    */
  var nameFieldLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Create a when packaged for the Mac App Store. If this option is enabled and the
    * file doesn't already exist a blank file will be created at the chosen path.
    */
  var securityScopedBookmarks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show the tags input box, defaults to true.
    */
  var showsTagField: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

