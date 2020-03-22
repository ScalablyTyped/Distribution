package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/task
  /**
    * The command line arguments when `program` is executed.
    */
  var arguments: String
  /**
    * Description of this task.
    */
  var description: String
  /**
    * The icon index in the icon file. If an icon file consists of two or more icons,
    * set this value to identify the icon. If an icon file consists of one icon, this
    * value is 0.
    */
  var iconIndex: Double
  /**
    * The absolute path to an icon to be displayed in a JumpList, which can be an
    * arbitrary resource file that contains an icon. You can usually specify
    * `process.execPath` to show the icon of the program.
    */
  var iconPath: String
  /**
    * Path of the program to execute, usually you should specify `process.execPath`
    * which opens the current program.
    */
  var program: String
  /**
    * The string to be displayed in a JumpList.
    */
  var title: String
  /**
    * The working directory. Default is empty.
    */
  var workingDirectory: js.UndefOr[String] = js.undefined
}

object Task {
  @scala.inline
  def apply(
    arguments: String,
    description: String,
    iconIndex: Double,
    iconPath: String,
    program: String,
    title: String,
    workingDirectory: String = null
  ): Task = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconIndex = iconIndex.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

