package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

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
  def apply(topic: js.UndefOr[Null | String] = js.undefined): IDeleteTopicRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(topic)) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteTopicRequest]
  }
}

