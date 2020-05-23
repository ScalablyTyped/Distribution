package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.GroupRowExpanding and ASPxClientCardView.GroupRowCollapsing events.
  */
trait ASPxClientCardViewGroupCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed group row's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewGroupCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientCardViewGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewGroupCancelEventArgs]
  }
}

