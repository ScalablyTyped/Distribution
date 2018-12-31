package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullResponse extends js.Object {
  /**
    * Received Pub/Sub messages. The Pub/Sub system will return zero messages if
    * there are no more available in the backlog. The Pub/Sub system may return
    * fewer than the `maxMessages` requested even if there are more messages
    * available in the backlog.
    */
  var receivedMessages: js.UndefOr[js.Array[ReceivedMessage]] = js.undefined
}

