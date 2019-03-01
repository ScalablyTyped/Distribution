package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpListItem extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/jump-list-item
  /**
    * The command line arguments when program is executed. Should only be set if type
    * is task.
    */
  var args: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Description of the task (displayed in a tooltip). Should only be set if type is
    * task.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index of the icon in the resource file. If a resource file contains multiple
    * icons this value can be used to specify the zero-based index of the icon that
    * should be displayed for this task. If a resource file contains only one icon,
    * this property should be set to zero.
    */
  var iconIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The absolute path to an icon to be displayed in a Jump List, which can be an
    * arbitrary resource file that contains an icon (e.g. .ico, .exe, .dll). You can
    * usually specify process.execPath to show the program icon.
    */
  var iconPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path of the file to open, should only be set if type is file.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path of the program to execute, usually you should specify process.execPath
    * which opens the current program. Should only be set if type is task.
    */
  var program: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to be displayed for the item in the Jump List. Should only be set if
    * type is task.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * One of the following:
    */
  var `type`: js.UndefOr[
    electronLib.electronLibStrings.task | electronLib.electronLibStrings.separator | electronLib.electronLibStrings.file
  ] = js.undefined
}

object JumpListItem {
  @scala.inline
  def apply(
    args: java.lang.String = null,
    description: java.lang.String = null,
    iconIndex: scala.Int | scala.Double = null,
    iconPath: java.lang.String = null,
    path: java.lang.String = null,
    program: java.lang.String = null,
    title: java.lang.String = null,
    `type`: electronLib.electronLibStrings.task | electronLib.electronLibStrings.separator | electronLib.electronLibStrings.file = null
  ): JumpListItem = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (description != null) __obj.updateDynamic("description")(description)
    if (iconIndex != null) __obj.updateDynamic("iconIndex")(iconIndex.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath)
    if (path != null) __obj.updateDynamic("path")(path)
    if (program != null) __obj.updateDynamic("program")(program)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpListItem]
  }
}

