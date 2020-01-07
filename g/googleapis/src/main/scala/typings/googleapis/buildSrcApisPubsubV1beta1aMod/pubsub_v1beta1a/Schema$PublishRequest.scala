package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Publish method.
  */
@js.native
trait Schema$PublishRequest extends js.Object {
  /**
    * The message to publish.
    */
  var message: js.UndefOr[Schema$PubsubMessage] = js.native
  /**
    * The message in the request will be published on this topic.
    */
  var topic: js.UndefOr[String] = js.native
}

object Schema$PublishRequest {
  @scala.inline
  def apply(message: Schema$PubsubMessage = null, topic: String = null): Schema$PublishRequest = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublishRequest]
  }
}

