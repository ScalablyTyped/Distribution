package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PublishResponse extends js.Object {
  /**
               * The server-assigned ID of each published message, in the same order as
               * the messages in the request. IDs are guaranteed to be unique within
               * the topic.
               */
  var messageIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

