package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginCallbackEventArgs extends EventArgs {
  val command: String
}

object BeginCallbackEventArgs {
  @scala.inline
  def apply(command: String, sender: Control): BeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command, sender = sender)
  
    __obj.asInstanceOf[BeginCallbackEventArgs]
  }
}

