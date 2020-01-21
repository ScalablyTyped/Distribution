package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFloatingActionButton.ActionItemClick event.
  */
@JSGlobal("ASPxClientFloatingActionButtonActionItemClickEventArgs")
@js.native
class ASPxClientFloatingActionButtonActionItemClickEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFloatingActionButtonActionItemClickEventArgs class.
    * @param actionName A string value that specifies the action item's name.
    */
  def this(actionName: String) = this()
  /**
    * Gets the name of the processed action.
    */
  var actionName: String = js.native
}

