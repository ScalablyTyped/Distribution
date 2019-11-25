package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteTopicRequest. */
trait IDeleteTopicRequest extends js.Object {
  /** DeleteTopicRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}

object IDeleteTopicRequest {
  @scala.inline
  def apply(topic: String = null): IDeleteTopicRequest = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteTopicRequest]
  }
}

