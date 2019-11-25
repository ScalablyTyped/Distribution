package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonClickEventArgs extends ProcessingModeEventArgs {
  val cancelEventAndBubble: Boolean
}

object ButtonClickEventArgs {
  @scala.inline
  def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean, sender: Control): ButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ButtonClickEventArgs]
  }
}

