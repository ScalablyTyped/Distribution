package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
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
  implicit class CommandStateMutableBuilder[Self <: CommandState[_], T] (val x: Self with CommandState[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
