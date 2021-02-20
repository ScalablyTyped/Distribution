package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to create a new empty document.
  */
@js.native
trait FileNewCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the FileNewCommand command.
    */
  def execute(): Boolean = js.native
}
object FileNewCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileNewCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileNewCommand]
  }
  
  @scala.inline
  implicit class FileNewCommandMutableBuilder[Self <: FileNewCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
