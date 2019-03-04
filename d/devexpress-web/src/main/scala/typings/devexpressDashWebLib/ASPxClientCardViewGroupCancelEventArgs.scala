package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCardViewGroupCancelEventArgs extends ASPxClientCancelEventArgs {
  var visibleIndex: scala.Double
}

object ASPxClientCardViewGroupCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, visibleIndex: scala.Double): ASPxClientCardViewGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewGroupCancelEventArgs]
  }
}

