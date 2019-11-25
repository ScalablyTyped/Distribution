package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PublishResponse. */
trait IPublishResponse extends js.Object {
  /** PublishResponse messageIds */
  var messageIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IPublishResponse {
  @scala.inline
  def apply(messageIds: js.Array[String] = null): IPublishResponse = {
    val __obj = js.Dynamic.literal()
    if (messageIds != null) __obj.updateDynamic("messageIds")(messageIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishResponse]
  }
}

