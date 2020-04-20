package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefix extends js.Object {
  var prefix: String
  var url: String
}

object AnonPrefix {
  @scala.inline
  def apply(prefix: String, url: String): AnonPrefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefix]
  }
}

