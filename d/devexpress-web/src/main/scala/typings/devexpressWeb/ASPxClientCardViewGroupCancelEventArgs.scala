package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.GroupRowExpanding and ASPxClientCardView.GroupRowCollapsing events.
  */
@JSGlobal("ASPxClientCardViewGroupCancelEventArgs")
@js.native
class ASPxClientCardViewGroupCancelEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewGroupCancelEventArgs class.
    * @param visibleIndex An integer value that specifies the group's visible index.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets the processed group row's visible index.
    */
  var visibleIndex: Double = js.native
}

