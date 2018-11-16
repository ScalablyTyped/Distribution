package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PubsubMessage extends js.Object {
  /** Optional attributes for this message. */
  var attributes: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The message payload. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
               * ID of this message, assigned by the server when the message is published.
               * Guaranteed to be unique within the topic. This value may be read by a
               * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
               * delivery. It must not be populated by the publisher in a `Publish` call.
               */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The time at which the message was published, populated by the server when
               * it receives the `Publish` call. It must not be populated by the
               * publisher in a `Publish` call.
               */
  var publishTime: js.UndefOr[java.lang.String] = js.undefined
}

