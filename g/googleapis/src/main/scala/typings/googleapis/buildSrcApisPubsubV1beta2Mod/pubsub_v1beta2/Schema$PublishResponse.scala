package typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `Publish` method.
  */
@js.native
trait Schema$PublishResponse extends js.Object {
  /**
    * The server-assigned ID of each published message, in the same order as
    * the messages in the request. IDs are guaranteed to be unique within the
    * topic.
    */
  var messageIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PublishResponse {
  @scala.inline
  def apply(messageIds: js.Array[String] = null): Schema$PublishResponse = {
    val __obj = js.Dynamic.literal()
    if (messageIds != null) __obj.updateDynamic("messageIds")(messageIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublishResponse]
  }
}

