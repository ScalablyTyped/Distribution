package typings.friendlyErrorsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackError extends js.Object {
  var file: String
  var message: String
  var name: String
  var origin: String
  var severity: Severity
  var webpackError: js.Any
}

object WebpackError {
  @scala.inline
  def apply(
    file: String,
    message: String,
    name: String,
    origin: String,
    severity: Severity,
    webpackError: js.Any
  ): WebpackError = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], webpackError = webpackError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebpackError]
  }
}

