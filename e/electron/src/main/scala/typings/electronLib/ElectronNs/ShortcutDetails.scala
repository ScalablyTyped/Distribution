package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutDetails extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/shortcut-details
  /**
    * The Application User Model ID. Default is empty.
    */
  var appUserModelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The arguments to be applied to target when launching from this shortcut. Default
    * is empty.
    */
  var args: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The working directory. Default is empty.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The description of the shortcut. Default is empty.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path to the icon, can be a DLL or EXE. icon and iconIndex have to be set
    * together. Default is empty, which uses the target's icon.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource ID of icon when icon is a DLL or EXE. Default is 0.
    */
  var iconIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The target to launch from this shortcut.
    */
  var target: java.lang.String
}

