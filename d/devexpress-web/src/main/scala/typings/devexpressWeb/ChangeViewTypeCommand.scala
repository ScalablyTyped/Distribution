package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the Rich Edit's document view type.
  */
@JSGlobal("ChangeViewTypeCommand")
@js.native
class ChangeViewTypeCommand () extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeViewTypeCommand command with the specified parameter. A Boolean value identifying whether method execution was successful or failed.
    * @param viewType A string value specifying the Rich Edit's document view type.
    */
  def execute(viewType: ViewType): Boolean = js.native
}

