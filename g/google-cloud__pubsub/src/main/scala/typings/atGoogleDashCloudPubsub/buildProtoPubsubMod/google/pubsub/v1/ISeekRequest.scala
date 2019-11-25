package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.ITimestamp
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
  def apply(snapshot: String = null, subscription: String = null, time: ITimestamp = null): ISeekRequest = {
    val __obj = js.Dynamic.literal()
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeekRequest]
  }
}

