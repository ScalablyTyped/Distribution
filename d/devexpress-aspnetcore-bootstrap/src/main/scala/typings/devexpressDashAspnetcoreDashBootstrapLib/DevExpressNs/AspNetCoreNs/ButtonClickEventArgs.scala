package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonClickEventArgs extends ProcessingModeEventArgs {
  val cancelEventAndBubble: scala.Boolean
}

object ButtonClickEventArgs {
  @scala.inline
  def apply(cancelEventAndBubble: scala.Boolean, processOnServer: scala.Boolean, sender: Control): ButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[ButtonClickEventArgs]
  }
}

