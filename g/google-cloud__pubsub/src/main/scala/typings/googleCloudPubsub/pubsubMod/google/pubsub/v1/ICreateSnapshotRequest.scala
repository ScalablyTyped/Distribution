package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateSnapshotRequest. */
trait ICreateSnapshotRequest extends js.Object {
  /** CreateSnapshotRequest labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  /** CreateSnapshotRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** CreateSnapshotRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}

object ICreateSnapshotRequest {
  @scala.inline
  def apply(
    labels: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    subscription: js.UndefOr[Null | String] = js.undefined
  ): ICreateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateSnapshotRequest]
  }
}

