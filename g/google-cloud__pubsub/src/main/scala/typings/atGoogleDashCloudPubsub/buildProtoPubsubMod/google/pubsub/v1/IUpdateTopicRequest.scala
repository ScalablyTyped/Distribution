package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateTopicRequest. */
trait IUpdateTopicRequest extends js.Object {
  /** UpdateTopicRequest topic */
  var topic: js.UndefOr[ITopic | Null] = js.undefined
  /** UpdateTopicRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateTopicRequest {
  @scala.inline
  def apply(topic: ITopic = null, updateMask: IFieldMask = null): IUpdateTopicRequest = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateTopicRequest]
  }
}

