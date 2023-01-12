package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to search for a specific text and replace the next match in the document with the specified string.
  */
trait ReplaceNextCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the ReplaceNextCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param text A string value specifying a text to replace.
    * @param replaceText A string value specifying the inserted text.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    */
  def execute(text: String, replaceText: String, matchCase: Boolean): Boolean
}
object ReplaceNextCommand {
  
  inline def apply(execute: (String, String, Boolean) => Boolean, getState: () => SimpleCommandState): ReplaceNextCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ReplaceNextCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceNextCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: (String, String, Boolean) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
  }
}
