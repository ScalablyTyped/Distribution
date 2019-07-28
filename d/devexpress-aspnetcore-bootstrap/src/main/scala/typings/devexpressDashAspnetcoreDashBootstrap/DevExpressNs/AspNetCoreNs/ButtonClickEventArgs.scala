package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonClickEventArgs extends ProcessingModeEventArgs {
  val cancelEventAndBubble: Boolean
}

object ButtonClickEventArgs {
  @scala.inline
  def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean, sender: Control): ButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[ButtonClickEventArgs]
  }
}

