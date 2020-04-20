package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelEventArgs extends EventArgs {
  var cancel: Boolean
}

object CancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, sender: Control): CancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEventArgs]
  }
}

