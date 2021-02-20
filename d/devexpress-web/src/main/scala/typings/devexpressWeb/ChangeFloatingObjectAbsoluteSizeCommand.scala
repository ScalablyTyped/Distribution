package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change a floating object's absolute size.
  */
@js.native
trait ChangeFloatingObjectAbsoluteSizeCommand extends ChangeFloatingObjectPropertyCommandBase[FloatingObjectAbsoluteSizeSettings]
object ChangeFloatingObjectAbsoluteSizeCommand {
  
  @scala.inline
  def apply(
    execute: FloatingObjectAbsoluteSizeSettings => Boolean,
    getState: () => CommandState[FloatingObjectAbsoluteSizeSettings]
  ): ChangeFloatingObjectAbsoluteSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectAbsoluteSizeCommand]
  }
}
