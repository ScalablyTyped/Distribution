package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingModeEventArgs extends EventArgs {
  var processOnServer: Boolean
}

object ProcessingModeEventArgs {
  @scala.inline
  def apply(processOnServer: Boolean, sender: Control): ProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[ProcessingModeEventArgs]
  }
}

