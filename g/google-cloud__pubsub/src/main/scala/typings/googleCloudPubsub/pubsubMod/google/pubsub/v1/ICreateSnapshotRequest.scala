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
  def apply(labels: StringDictionary[String] = null, name: String = null, subscription: String = null): ICreateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateSnapshotRequest]
  }
}

