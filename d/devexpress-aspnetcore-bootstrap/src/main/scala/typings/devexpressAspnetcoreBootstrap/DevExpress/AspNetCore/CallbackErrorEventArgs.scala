package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackErrorEventArgs extends EventArgs {
  var handled: Boolean
  var message: String
}

object CallbackErrorEventArgs {
  @scala.inline
  def apply(handled: Boolean, message: String, sender: Control): CallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackErrorEventArgs]
  }
}

