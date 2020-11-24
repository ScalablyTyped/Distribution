package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for commands with a simple common command state.
  */
@js.native
trait CommandWithSimpleStateBase extends CommandBase {
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}
object CommandWithSimpleStateBase {
  
  @scala.inline
  def apply(getState: () => SimpleCommandState): CommandWithSimpleStateBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CommandWithSimpleStateBase]
  }
  
  @scala.inline
  implicit class CommandWithSimpleStateBaseOps[Self <: CommandWithSimpleStateBase] (val x: Self) extends AnyVal {
    
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
    def setGetState(value: () => SimpleCommandState): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}
