package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSnapshotsRequest. */
trait IListSnapshotsRequest extends js.Object {
  /** ListSnapshotsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListSnapshotsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListSnapshotsRequest project */
  var project: js.UndefOr[String | Null] = js.undefined
}

object IListSnapshotsRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null, project: String = null): IListSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSnapshotsRequest]
  }
}

