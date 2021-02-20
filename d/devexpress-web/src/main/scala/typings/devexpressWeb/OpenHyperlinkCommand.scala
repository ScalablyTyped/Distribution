package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the document bookmark or URI (uniform resource identifier) specified for the hyperlink.
  */
@js.native
trait OpenHyperlinkCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenHyperlinkCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenHyperlinkCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenHyperlinkCommand]
  }
  
  @scala.inline
  implicit class OpenHyperlinkCommandMutableBuilder[Self <: OpenHyperlinkCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
