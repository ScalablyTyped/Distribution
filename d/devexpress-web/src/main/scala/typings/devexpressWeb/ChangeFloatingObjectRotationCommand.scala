package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to rotate a floating object.
  */
trait ChangeFloatingObjectRotationCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[Double]
object ChangeFloatingObjectRotationCommand {
  
  inline def apply(execute: Double => Boolean, getState: () => CommandState[Double]): ChangeFloatingObjectRotationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectRotationCommand]
  }
}
