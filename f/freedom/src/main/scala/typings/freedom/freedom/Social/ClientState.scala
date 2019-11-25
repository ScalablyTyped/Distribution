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
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientState]
  }
}

