package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackErrorEventArgs extends EventArgs {
  var handled: scala.Boolean
  var message: java.lang.String
}

object CallbackErrorEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, message: java.lang.String, sender: Control): CallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, message = message, sender = sender)
  
    __obj.asInstanceOf[CallbackErrorEventArgs]
  }
}

