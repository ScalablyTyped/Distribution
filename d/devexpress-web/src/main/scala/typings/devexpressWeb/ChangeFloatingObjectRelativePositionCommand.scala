package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's relative position.
  */
trait ChangeFloatingObjectRelativePositionCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[FloatingObjectRelativePositionSettings]
object ChangeFloatingObjectRelativePositionCommand {
  
  inline def apply(
    execute: FloatingObjectRelativePositionSettings => Boolean,
    getState: () => CommandState[FloatingObjectRelativePositionSettings]
  ): ChangeFloatingObjectRelativePositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectRelativePositionCommand]
  }
}
