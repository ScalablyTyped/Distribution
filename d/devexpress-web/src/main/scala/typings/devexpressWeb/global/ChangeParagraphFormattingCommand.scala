package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the formatting of paragraphs in a selected range.
  */
@JSGlobal("ChangeParagraphFormattingCommand")
@js.native
class ChangeParagraphFormattingCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeParagraphFormattingCommand {
  
  /**
    * Executes the ChangeParagraphFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A ParagraphFormattingSettings object specifying paragraph formatting settings.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.ParagraphFormattingSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.ParagraphFormattingSettings] = js.native
}
