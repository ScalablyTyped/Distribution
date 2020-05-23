package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFloatingActionButton.ActionItemClick event.
  */
trait ASPxClientFloatingActionButtonActionItemClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed action.
    */
  var actionName: String
}

object ASPxClientFloatingActionButtonActionItemClickEventArgs {
  @scala.inline
  def apply(actionName: String): ASPxClientFloatingActionButtonActionItemClickEventArgs = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionItemClickEventArgs]
  }
}

