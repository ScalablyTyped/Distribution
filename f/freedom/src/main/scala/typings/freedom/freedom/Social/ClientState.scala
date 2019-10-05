package typings.freedom.freedom.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Status of a client connected to a social network.
trait ClientState extends js.Object {
  var clientId: String
  var status: String
    // Either ONLINE, OFFLINE, or ONLINE_WITH_OTHER_APP
  var timestamp: Double
  var userId: String
}

object ClientState {
  @scala.inline
  def apply(clientId: String, status: String, timestamp: Double, userId: String): ClientState = {
    val __obj = js.Dynamic.literal(clientId = clientId, status = status, timestamp = timestamp, userId = userId)
  
    __obj.asInstanceOf[ClientState]
  }
}

