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

