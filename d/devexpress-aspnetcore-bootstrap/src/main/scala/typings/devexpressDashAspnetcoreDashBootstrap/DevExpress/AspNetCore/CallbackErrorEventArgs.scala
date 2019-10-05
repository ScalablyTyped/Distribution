package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(handled = handled, message = message, sender = sender)
  
    __obj.asInstanceOf[CallbackErrorEventArgs]
  }
}

