package typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message and its corresponding acknowledgment ID.
  */
@js.native
trait Schema$ReceivedMessage extends js.Object {
  /**
    * This ID can be used to acknowledge the received message.
    */
  var ackId: js.UndefOr[String] = js.native
  /**
    * The message.
    */
  var message: js.UndefOr[Schema$PubsubMessage] = js.native
}

object Schema$ReceivedMessage {
  @scala.inline
  def apply(ackId: String = null, message: Schema$PubsubMessage = null): Schema$ReceivedMessage = {
    val __obj = js.Dynamic.literal()
    if (ackId != null) __obj.updateDynamic("ackId")(ackId.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReceivedMessage]
  }
}

