package typings.gapiClientPubsub.gapi.client.pubsub

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubsubMessage extends js.Object {
  /** Optional attributes for this message. */
  var attributes: js.UndefOr[Record[String, String]] = js.undefined
  /** The message payload. */
  var data: js.UndefOr[String] = js.undefined
  /**
    * ID of this message, assigned by the server when the message is published.
    * Guaranteed to be unique within the topic. This value may be read by a
    * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
    * delivery. It must not be populated by the publisher in a `Publish` call.
    */
  var messageId: js.UndefOr[String] = js.undefined
  /**
    * The time at which the message was published, populated by the server when
    * it receives the `Publish` call. It must not be populated by the
    * publisher in a `Publish` call.
    */
  var publishTime: js.UndefOr[String] = js.undefined
}

object PubsubMessage {
  @scala.inline
  def apply(
    attributes: Record[String, String] = null,
    data: String = null,
    messageId: String = null,
    publishTime: String = null
  ): PubsubMessage = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (publishTime != null) __obj.updateDynamic("publishTime")(publishTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubsubMessage]
  }
}

