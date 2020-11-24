package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the state of a command.
  */
@js.native
trait CommandState[T] extends SimpleCommandState {
  
  /**
    * Specifies a command value.
    */
  var value: T = js.native
}
object CommandState {
  
  @scala.inline
  def apply[T](enabled: Boolean, value: T, visible: Boolean): CommandState[T] = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandState[T]]
  }
  
  @scala.inline
  implicit class CommandStateOps[Self <: CommandState[_], T] (val x: Self with CommandState[T]) extends AnyVal {
    
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
