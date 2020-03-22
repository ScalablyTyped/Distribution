package typings.diagnosticChannelPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPort extends js.Object {
  var host: String
  var port: String
}

object AnonPort {
  @scala.inline
  def apply(host: String, port: String): AnonPort = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPort]
  }
}

