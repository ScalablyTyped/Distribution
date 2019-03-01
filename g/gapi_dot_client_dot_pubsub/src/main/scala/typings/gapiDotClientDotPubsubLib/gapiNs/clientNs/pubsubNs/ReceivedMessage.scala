package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedMessage extends js.Object {
  /** This ID can be used to acknowledge the received message. */
  var ackId: js.UndefOr[java.lang.String] = js.undefined
  /** The message. */
  var message: js.UndefOr[PubsubMessage] = js.undefined
}

object ReceivedMessage {
  @scala.inline
  def apply(ackId: java.lang.String = null, message: PubsubMessage = null): ReceivedMessage = {
    val __obj = js.Dynamic.literal()
    if (ackId != null) __obj.updateDynamic("ackId")(ackId)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ReceivedMessage]
  }
}

