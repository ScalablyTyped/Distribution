package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to lock a floating object's aspect ratio.
  */
trait ChangeFloatingObjectLockAspectRatioCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[Boolean]
object ChangeFloatingObjectLockAspectRatioCommand {
  
  inline def apply(execute: Boolean => Boolean, getState: () => CommandState[Boolean]): ChangeFloatingObjectLockAspectRatioCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectLockAspectRatioCommand]
  }
}
