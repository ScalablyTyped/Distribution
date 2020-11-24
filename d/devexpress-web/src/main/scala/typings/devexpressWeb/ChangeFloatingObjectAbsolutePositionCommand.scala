package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change a floating object's absolute position.
  */
@js.native
trait ChangeFloatingObjectAbsolutePositionCommand extends ChangeFloatingObjectPropertyCommandBase[FloatingObjectAbsolutePositionSettings]
object ChangeFloatingObjectAbsolutePositionCommand {
  
  @scala.inline
  def apply(
    execute: FloatingObjectAbsolutePositionSettings => Boolean,
    getState: () => CommandState[FloatingObjectAbsolutePositionSettings]
  ): ChangeFloatingObjectAbsolutePositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectAbsolutePositionCommand]
  }
}
