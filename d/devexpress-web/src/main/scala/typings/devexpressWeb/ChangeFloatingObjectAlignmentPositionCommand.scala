package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's alignment position.
  */
trait ChangeFloatingObjectAlignmentPositionCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[FloatingObjectAlignmentPositionSettings]
object ChangeFloatingObjectAlignmentPositionCommand {
  
  @scala.inline
  def apply(
    execute: FloatingObjectAlignmentPositionSettings => Boolean,
    getState: () => CommandState[FloatingObjectAlignmentPositionSettings]
  ): ChangeFloatingObjectAlignmentPositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectAlignmentPositionCommand]
  }
}
