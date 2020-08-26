package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActionCollapsing event.
  */
@JSGlobal("ASPxClientFloatingActionButtonActionCollapsingEventArgs")
@js.native
class ASPxClientFloatingActionButtonActionCollapsingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFloatingActionButtonActionCollapsingEventArgs {
  /**
    * Initializes a new object of the ASPxClientFloatingActionButtonActionCollapsingEventArgs type with the specified settings.
    * @param contextName Specifies the FAB action's context name.
    * @param collapseReason Specifies
    */
  def this(
    contextName: String,
    collapseReason: typings.devexpressWeb.ASPxClientFloatingActionButtonCollapseReason
  ) = this()
}

