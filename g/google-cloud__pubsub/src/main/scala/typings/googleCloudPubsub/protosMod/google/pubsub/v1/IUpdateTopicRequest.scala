package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldMask
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
  def apply(
    topic: js.UndefOr[Null | ITopic] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IUpdateTopicRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(topic)) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateTopicRequest]
  }
}

