package typings.diagnosticChannelPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostPort extends js.Object {
  var host: String
  var port: String
}

object AnonHostPort {
  @scala.inline
  def apply(host: String, port: String): AnonHostPort = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHostPort]
  }
}

