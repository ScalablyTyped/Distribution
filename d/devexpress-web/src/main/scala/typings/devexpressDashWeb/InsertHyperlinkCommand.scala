package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a hyperlink at the current position in the document.
  */
trait InsertHyperlinkCommand extends CommandBase {
  /**
    * Executes the InsertHyperlinkCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A HyperlinkSettings object specifying hyperlink settings.
    */
  def execute(settings: HyperlinkSettings): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object InsertHyperlinkCommand {
  @scala.inline
  def apply(execute: HyperlinkSettings => Boolean, getState: () => js.Any): InsertHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[InsertHyperlinkCommand]
  }
}

