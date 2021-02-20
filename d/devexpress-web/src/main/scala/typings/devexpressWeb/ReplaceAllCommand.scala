package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to search for a specific text and replace all matches in the document with the specified string.
  */
@js.native
trait ReplaceAllCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the ReplaceAllCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param text A string value specifying a text to replace.
    * @param replaceText A string value specifying the inserted text.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    */
  def execute(text: String, replaceText: String, matchCase: Boolean): Boolean = js.native
}
object ReplaceAllCommand {
  
  @scala.inline
  def apply(execute: (String, String, Boolean) => Boolean, getState: () => SimpleCommandState): ReplaceAllCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ReplaceAllCommand]
  }
  
  @scala.inline
  implicit class ReplaceAllCommandMutableBuilder[Self <: ReplaceAllCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (String, String, Boolean) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
  }
}
