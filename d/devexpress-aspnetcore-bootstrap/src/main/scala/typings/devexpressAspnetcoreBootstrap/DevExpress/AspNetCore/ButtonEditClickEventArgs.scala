package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonEditClickEventArgs extends ProcessingModeEventArgs {
  val buttonIndex: Double
}

object ButtonEditClickEventArgs {
  @scala.inline
  def apply(buttonIndex: Double, processOnServer: Boolean, sender: Control): ButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ButtonEditClickEventArgs]
  }
}

