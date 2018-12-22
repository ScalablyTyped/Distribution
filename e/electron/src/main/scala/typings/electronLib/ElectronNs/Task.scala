package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Task extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/task
  /**
       * The command line arguments when program is executed.
       */
  var arguments: java.lang.String
  /**
       * Description of this task.
       */
  var description: java.lang.String
  /**
       * The icon index in the icon file. If an icon file consists of two or more icons,
       * set this value to identify the icon. If an icon file consists of one icon, this
       * value is 0.
       */
  var iconIndex: scala.Double
  /**
       * The absolute path to an icon to be displayed in a JumpList, which can be an
       * arbitrary resource file that contains an icon. You can usually specify
       * process.execPath to show the icon of the program.
       */
  var iconPath: java.lang.String
  /**
       * Path of the program to execute, usually you should specify process.execPath
       * which opens the current program.
       */
  var program: java.lang.String
  /**
       * The string to be displayed in a JumpList.
       */
  var title: java.lang.String
}

