package typings.freedom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var channel: String
}

object Channel {
  @scala.inline
  def apply(channel: String): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

