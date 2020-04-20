package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingModeEventArgs extends EventArgs {
  var processOnServer: Boolean
}

object ProcessingModeEventArgs {
  @scala.inline
  def apply(processOnServer: Boolean, sender: Control): ProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingModeEventArgs]
  }
}

