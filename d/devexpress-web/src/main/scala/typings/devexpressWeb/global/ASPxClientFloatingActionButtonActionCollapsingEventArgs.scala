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
  /**
    * Specifies whether the user action or APIs has collapsed the action group.
    */
  /* CompleteClass */
  override var collapseReason: typings.devexpressWeb.ASPxClientFloatingActionButtonCollapseReason = js.native
  /**
    * Specifies the FAB action's context name.
    */
  /* CompleteClass */
  override var contextName: String = js.native
}

