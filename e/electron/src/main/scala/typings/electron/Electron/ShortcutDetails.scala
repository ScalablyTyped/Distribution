package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutDetails extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/shortcut-details
  /**
    * The Application User Model ID. Default is empty.
    */
  var appUserModelId: js.UndefOr[String] = js.undefined
  /**
    * The arguments to be applied to target when launching from this shortcut. Default
    * is empty.
    */
  var args: js.UndefOr[String] = js.undefined
  /**
    * The working directory. Default is empty.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * The description of the shortcut. Default is empty.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The path to the icon, can be a DLL or EXE. icon and iconIndex have to be set
    * together. Default is empty, which uses the target's icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * The resource ID of icon when icon is a DLL or EXE. Default is 0.
    */
  var iconIndex: js.UndefOr[Double] = js.undefined
  /**
    * The target to launch from this shortcut.
    */
  var target: String
}

object ShortcutDetails {
  @scala.inline
  def apply(
    target: String,
    appUserModelId: String = null,
    args: String = null,
    cwd: String = null,
    description: String = null,
    icon: String = null,
    iconIndex: Int | Double = null
  ): ShortcutDetails = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (appUserModelId != null) __obj.updateDynamic("appUserModelId")(appUserModelId.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconIndex != null) __obj.updateDynamic("iconIndex")(iconIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutDetails]
  }
}

