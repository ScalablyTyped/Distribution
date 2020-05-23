package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a hyperlink at the current position in the document.
  */
@JSGlobal("InsertHyperlinkCommand")
@js.native
class InsertHyperlinkCommand ()
  extends typings.devexpressWeb.InsertHyperlinkCommand {
  /**
    * Executes the InsertHyperlinkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A HyperlinkSettings object specifying hyperlink settings.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.HyperlinkSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.HyperlinkSettings] = js.native
}

