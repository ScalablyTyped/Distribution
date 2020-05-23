package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFloatingActionButton.ContextChanging event.
  */
trait ASPxClientFloatingActionButtonContextChangingEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the action related to the event.
    */
  var action: ASPxClientFABAction
}

object ASPxClientFloatingActionButtonContextChangingEventArgs {
  @scala.inline
  def apply(action: ASPxClientFABAction): ASPxClientFloatingActionButtonContextChangingEventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonContextChangingEventArgs]
  }
}

