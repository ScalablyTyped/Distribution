package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelEventArgs extends EventArgs {
  var cancel: Boolean
}

object CancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, sender: Control): CancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, sender = sender)
  
    __obj.asInstanceOf[CancelEventArgs]
  }
}

