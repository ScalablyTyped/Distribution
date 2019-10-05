package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonEditClickEventArgs extends ProcessingModeEventArgs {
  val buttonIndex: Double
}

object ButtonEditClickEventArgs {
  @scala.inline
  def apply(buttonIndex: Double, processOnServer: Boolean, sender: Control): ButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[ButtonEditClickEventArgs]
  }
}

