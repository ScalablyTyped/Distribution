package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandManager extends js.Object {
  
  /** An object that maps a set of command names with the corresponding command objects
    * @Default {{}}
    */
  var commands: js.UndefOr[CommandManagerCommands] = js.native
}
object CommandManager {
  
  @scala.inline
  def apply(): CommandManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandManager]
  }
  
  @scala.inline
  implicit class CommandManagerOps[Self <: CommandManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommands(value: CommandManagerCommands): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
  }
}
