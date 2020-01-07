package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message data and its labels.
  */
@js.native
trait Schema$PubsubMessage extends js.Object {
  /**
    * The message payload.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Optional list of labels for this message. Keys in this collection must be
    * unique.
    */
  var label: js.UndefOr[js.Array[Schema$Label]] = js.native
  /**
    * ID of this message assigned by the server at publication time. Guaranteed
    * to be unique within the topic. This value may be read by a subscriber
    * that receives a PubsubMessage via a Pull call or a push delivery. It must
    * not be populated by a publisher in a Publish call.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The time at which the message was published. The time is milliseconds
    * since the UNIX epoch.
    */
  var publishTime: js.UndefOr[String] = js.native
}

object Schema$PubsubMessage {
  @scala.inline
  def apply(
    data: String = null,
    label: js.Array[Schema$Label] = null,
    messageId: String = null,
    publishTime: String = null
  ): Schema$PubsubMessage = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (publishTime != null) __obj.updateDynamic("publishTime")(publishTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PubsubMessage]
  }
}

