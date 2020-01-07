package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the PublishBatch method.
  */
@js.native
trait Schema$PublishBatchRequest extends js.Object {
  /**
    * The messages to publish.
    */
  var messages: js.UndefOr[js.Array[Schema$PubsubMessage]] = js.native
  /**
    * The messages in the request will be published on this topic.
    */
  var topic: js.UndefOr[String] = js.native
}

object Schema$PublishBatchRequest {
  @scala.inline
  def apply(messages: js.Array[Schema$PubsubMessage] = null, topic: String = null): Schema$PublishBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublishBatchRequest]
  }
}

