package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message that is published by publishers and consumed by subscribers. The
  * message must contain either a non-empty data field or at least one
  * attribute. Note that client libraries represent this object differently
  * depending on the language. See the corresponding &lt;a
  * href=&quot;https://cloud.google.com/pubsub/docs/reference/libraries&quot;&gt;client
  * library documentation&lt;/a&gt; for more information. See &lt;a
  * href=&quot;https://cloud.google.com/pubsub/quotas&quot;&gt;Quotas and
  * limits&lt;/a&gt; for more information about message limits.
  */
@js.native
trait Schema$PubsubMessage extends js.Object {
  /**
    * Optional attributes for this message.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The message data field. If this field is empty, the message must contain
    * at least one attribute.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * ID of this message, assigned by the server when the message is published.
    * Guaranteed to be unique within the topic. This value may be read by a
    * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
    * delivery. It must not be populated by the publisher in a `Publish` call.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The time at which the message was published, populated by the server when
    * it receives the `Publish` call. It must not be populated by the publisher
    * in a `Publish` call.
    */
  var publishTime: js.UndefOr[String] = js.native
}

object Schema$PubsubMessage {
  @scala.inline
  def apply(
    attributes: StringDictionary[String] = null,
    data: String = null,
    messageId: String = null,
    publishTime: String = null
  ): Schema$PubsubMessage = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (publishTime != null) __obj.updateDynamic("publishTime")(publishTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PubsubMessage]
  }
}

