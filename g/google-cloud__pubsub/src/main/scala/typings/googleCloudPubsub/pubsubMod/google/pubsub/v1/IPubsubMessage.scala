package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.pubsubMod.google.protobuf.ITimestamp
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PubsubMessage. */
trait IPubsubMessage extends js.Object {
  /** PubsubMessage attributes */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  /** PubsubMessage data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
  /** PubsubMessage messageId */
  var messageId: js.UndefOr[String | Null] = js.undefined
  /** PubsubMessage orderingKey */
  var orderingKey: js.UndefOr[String | Null] = js.undefined
  /** PubsubMessage publishTime */
  var publishTime: js.UndefOr[ITimestamp | Null] = js.undefined
}

object IPubsubMessage {
  @scala.inline
  def apply(
    attributes: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    data: js.UndefOr[Null | Uint8Array] = js.undefined,
    messageId: js.UndefOr[Null | String] = js.undefined,
    orderingKey: js.UndefOr[Null | String] = js.undefined,
    publishTime: js.UndefOr[Null | ITimestamp] = js.undefined
  ): IPubsubMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (!js.isUndefined(orderingKey)) __obj.updateDynamic("orderingKey")(orderingKey.asInstanceOf[js.Any])
    if (!js.isUndefined(publishTime)) __obj.updateDynamic("publishTime")(publishTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubsubMessage]
  }
}

