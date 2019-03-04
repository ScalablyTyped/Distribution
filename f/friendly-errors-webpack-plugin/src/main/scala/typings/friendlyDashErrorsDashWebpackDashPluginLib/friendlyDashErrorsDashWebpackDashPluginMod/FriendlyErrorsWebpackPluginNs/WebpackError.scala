package typings
package friendlyDashErrorsDashWebpackDashPluginLib.friendlyDashErrorsDashWebpackDashPluginMod.FriendlyErrorsWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackError extends js.Object {
  var file: java.lang.String
  var message: java.lang.String
  var name: java.lang.String
  var origin: java.lang.String
  var severity: Severity
  var webpackError: js.Any
}

object WebpackError {
  @scala.inline
  def apply(
    file: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    origin: java.lang.String,
    severity: Severity,
    webpackError: js.Any
  ): WebpackError = {
    val __obj = js.Dynamic.literal(file = file, message = message, name = name, origin = origin, severity = severity, webpackError = webpackError)
  
    __obj.asInstanceOf[WebpackError]
  }
}

