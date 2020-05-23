package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the Rich Edit's document view type.
  */
@JSGlobal("ChangeViewTypeCommand")
@js.native
class ChangeViewTypeCommand ()
  extends typings.devexpressWeb.ChangeViewTypeCommand {
  /**
    * Executes the ChangeViewTypeCommand command with the specified parameter. A Boolean value identifying whether method execution was successful or failed.
    * @param viewType A string value specifying the Rich Edit's document view type.
    */
  /* CompleteClass */
  override def execute(viewType: typings.devexpressWeb.ViewType): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

