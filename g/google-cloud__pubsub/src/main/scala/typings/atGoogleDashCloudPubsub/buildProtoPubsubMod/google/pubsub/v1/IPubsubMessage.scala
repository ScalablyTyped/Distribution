package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.ITimestamp
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
    attributes: StringDictionary[String] = null,
    data: Uint8Array = null,
    messageId: String = null,
    orderingKey: String = null,
    publishTime: ITimestamp = null
  ): IPubsubMessage = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (orderingKey != null) __obj.updateDynamic("orderingKey")(orderingKey.asInstanceOf[js.Any])
    if (publishTime != null) __obj.updateDynamic("publishTime")(publishTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubsubMessage]
  }
}

