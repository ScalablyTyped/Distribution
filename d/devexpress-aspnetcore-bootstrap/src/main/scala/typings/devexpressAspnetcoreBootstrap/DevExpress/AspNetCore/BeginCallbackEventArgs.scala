package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginCallbackEventArgs extends EventArgs {
  val command: String
}

object BeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, sender: Control): BeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginCallbackEventArgs]
  }
}

