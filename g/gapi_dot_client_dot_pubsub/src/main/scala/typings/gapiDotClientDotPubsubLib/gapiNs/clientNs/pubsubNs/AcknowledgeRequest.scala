package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AcknowledgeRequest extends js.Object {
  /**
               * The acknowledgment ID for the messages being acknowledged that was returned
               * by the Pub/Sub system in the `Pull` response. Must not be empty.
               */
  var ackIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

