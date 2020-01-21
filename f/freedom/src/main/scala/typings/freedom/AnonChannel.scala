package typings.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  var channel: String
}

object AnonChannel {
  @scala.inline
  def apply(channel: String): AnonChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChannel]
  }
}

