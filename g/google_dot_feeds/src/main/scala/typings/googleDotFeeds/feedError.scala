package typings.googleDotFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait feedError extends js.Object {
  var code: String
  var message: String
}

object feedError {
  @scala.inline
  def apply(code: String, message: String): feedError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[feedError]
  }
}

