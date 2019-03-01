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

object ShortcutDetails {
  @scala.inline
  def apply(
    target: java.lang.String,
    appUserModelId: java.lang.String = null,
    args: java.lang.String = null,
    cwd: java.lang.String = null,
    description: java.lang.String = null,
    icon: java.lang.String = null,
    iconIndex: scala.Int | scala.Double = null
  ): ShortcutDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target)
    if (appUserModelId != null) __obj.updateDynamic("appUserModelId")(appUserModelId)
    if (args != null) __obj.updateDynamic("args")(args)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (description != null) __obj.updateDynamic("description")(description)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconIndex != null) __obj.updateDynamic("iconIndex")(iconIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutDetails]
  }
}

