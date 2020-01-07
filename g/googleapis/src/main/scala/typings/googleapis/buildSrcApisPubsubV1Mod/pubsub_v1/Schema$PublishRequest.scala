package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Publish method.
  */
@js.native
trait Schema$PublishRequest extends js.Object {
  /**
    * The messages to publish.
    */
  var messages: js.UndefOr[js.Array[Schema$PubsubMessage]] = js.native
}

object Schema$PublishRequest {
  @scala.inline
  def apply(messages: js.Array[Schema$PubsubMessage] = null): Schema$PublishRequest = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublishRequest]
  }
}

