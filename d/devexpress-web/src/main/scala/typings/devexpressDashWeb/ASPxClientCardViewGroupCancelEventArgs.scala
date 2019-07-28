package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCardViewGroupCancelEventArgs extends ASPxClientCancelEventArgs {
  var visibleIndex: Double
}

object ASPxClientCardViewGroupCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientCardViewGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewGroupCancelEventArgs]
  }
}

