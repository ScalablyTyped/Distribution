package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseDateEventArgs extends EventArgs {
  val date: Date
  val handled: Boolean
  val value: String
}

object ParseDateEventArgs {
  @scala.inline
  def apply(date: Date, handled: Boolean, sender: Control, value: String): ParseDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseDateEventArgs]
  }
}

