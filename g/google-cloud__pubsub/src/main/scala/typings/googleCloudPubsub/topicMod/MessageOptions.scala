package typings.googleCloudPubsub.topicMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.pubsubMod.google.protobuf.ITimestamp
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/publisher.PubsubMessage & {  json ? :any} */
trait MessageOptions extends js.Object {
  /** PubsubMessage attributes */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  /** PubsubMessage data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
  var json: js.UndefOr[js.Any] = js.undefined
  /** PubsubMessage messageId */
  var messageId: js.UndefOr[String | Null] = js.undefined
  /** PubsubMessage orderingKey */
  var orderingKey: js.UndefOr[String | Null] = js.undefined
  /** PubsubMessage publishTime */
  var publishTime: js.UndefOr[ITimestamp | Null] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(
    attributes: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    data: js.UndefOr[Null | Uint8Array] = js.undefined,
    json: js.Any = null,
    messageId: js.UndefOr[Null | String] = js.undefined,
    orderingKey: js.UndefOr[Null | String] = js.undefined,
    publishTime: js.UndefOr[Null | ITimestamp] = js.undefined
  ): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (!js.isUndefined(orderingKey)) __obj.updateDynamic("orderingKey")(orderingKey.asInstanceOf[js.Any])
    if (!js.isUndefined(publishTime)) __obj.updateDynamic("publishTime")(publishTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
}

