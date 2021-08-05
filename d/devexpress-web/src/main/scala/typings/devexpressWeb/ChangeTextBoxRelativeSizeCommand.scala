package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a text box' relative size settings.
  */
trait ChangeTextBoxRelativeSizeCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[TextBoxRelativeSizeSettings]
object ChangeTextBoxRelativeSizeCommand {
  
  inline def apply(
    execute: TextBoxRelativeSizeSettings => Boolean,
    getState: () => CommandState[TextBoxRelativeSizeSettings]
  ): ChangeTextBoxRelativeSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTextBoxRelativeSizeCommand]
  }
}
