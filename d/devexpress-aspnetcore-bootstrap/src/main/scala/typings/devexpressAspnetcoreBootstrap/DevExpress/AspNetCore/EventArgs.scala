package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventArgs extends js.Object {
  val sender: Control
}

object EventArgs {
  @scala.inline
  def apply(sender: Control): EventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventArgs]
  }
}

