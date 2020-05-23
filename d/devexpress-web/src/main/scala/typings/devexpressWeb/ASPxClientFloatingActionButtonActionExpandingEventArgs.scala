package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActionExpanding event.
  */
trait ASPxClientFloatingActionButtonActionExpandingEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the FAB action's context name.
    */
  var contextName: String
}

object ASPxClientFloatingActionButtonActionExpandingEventArgs {
  @scala.inline
  def apply(contextName: String): ASPxClientFloatingActionButtonActionExpandingEventArgs = {
    val __obj = js.Dynamic.literal(contextName = contextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionExpandingEventArgs]
  }
}

