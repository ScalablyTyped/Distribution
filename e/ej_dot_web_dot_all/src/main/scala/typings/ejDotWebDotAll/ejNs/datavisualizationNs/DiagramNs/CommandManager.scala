package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandManager extends js.Object {
  /** An object that maps a set of command names with the corresponding command objects
    * @Default {{}}
    */
  var commands: js.UndefOr[CommandManagerCommands] = js.undefined
}

object CommandManager {
  @scala.inline
  def apply(commands: CommandManagerCommands = null): CommandManager = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands)
    __obj.asInstanceOf[CommandManager]
  }
}

