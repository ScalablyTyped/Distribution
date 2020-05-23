package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SeekRequest. */
trait ISeekRequest extends js.Object {
  /** SeekRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.undefined
  /** SeekRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
  /** SeekRequest time */
  var time: js.UndefOr[ITimestamp | Null] = js.undefined
}

object ISeekRequest {
  @scala.inline
  def apply(
    snapshot: js.UndefOr[Null | String] = js.undefined,
    subscription: js.UndefOr[Null | String] = js.undefined,
    time: js.UndefOr[Null | ITimestamp] = js.undefined
  ): ISeekRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeekRequest]
  }
}

