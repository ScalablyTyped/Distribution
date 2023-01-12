package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a table of contents.
  */
trait InsertTableOfContentsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableOfContentsCommand command.
    */
  def execute(): Boolean
}
object InsertTableOfContentsCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfContentsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfContentsCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertTableOfContentsCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
