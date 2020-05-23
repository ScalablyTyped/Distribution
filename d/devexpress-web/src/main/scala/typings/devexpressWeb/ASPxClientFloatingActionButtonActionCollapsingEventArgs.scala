package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActionCollapsing event.
  */
trait ASPxClientFloatingActionButtonActionCollapsingEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether the user action or APIs has collapsed the action group.
    */
  var collapseReason: ASPxClientFloatingActionButtonCollapseReason
  /**
    * Specifies the FAB action's context name.
    */
  var contextName: String
}

object ASPxClientFloatingActionButtonActionCollapsingEventArgs {
  @scala.inline
  def apply(collapseReason: ASPxClientFloatingActionButtonCollapseReason, contextName: String): ASPxClientFloatingActionButtonActionCollapsingEventArgs = {
    val __obj = js.Dynamic.literal(collapseReason = collapseReason.asInstanceOf[js.Any], contextName = contextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionCollapsingEventArgs]
  }
}

