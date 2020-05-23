package typings.googleCloudPubsub.srcPubsubMod

import typings.googleCloudPubsub.topicMod.Topic
import typings.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.PageOptions & {  topic ? :string | @google-cloud/pubsub.@google-cloud/pubsub/build/src/topic.Topic} */
trait GetSubscriptionsOptions extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  var gaxOpts: js.UndefOr[CallOptions] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var topic: js.UndefOr[String | Topic] = js.undefined
}

object GetSubscriptionsOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    gaxOpts: CallOptions = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    topic: String | Topic = null
  ): GetSubscriptionsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.get.asInstanceOf[js.Any])
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionsOptions]
  }
}

