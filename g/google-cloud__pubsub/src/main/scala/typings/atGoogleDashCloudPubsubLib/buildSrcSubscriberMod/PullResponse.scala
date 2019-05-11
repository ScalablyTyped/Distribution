package typings
package atGoogleDashCloudPubsubLib.buildSrcSubscriberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullResponse extends js.Object {
  var receivedMessages: js.Array[ReceivedMessage]
}

object PullResponse {
  @scala.inline
  def apply(receivedMessages: js.Array[ReceivedMessage]): PullResponse = {
    val __obj = js.Dynamic.literal(receivedMessages = receivedMessages)
  
    __obj.asInstanceOf[PullResponse]
  }
}

