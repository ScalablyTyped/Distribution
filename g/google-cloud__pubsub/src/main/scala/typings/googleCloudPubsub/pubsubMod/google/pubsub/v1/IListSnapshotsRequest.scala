package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

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
  def apply(
    pageSize: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined,
    project: js.UndefOr[Null | String] = js.undefined
  ): IListSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(project)) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSnapshotsRequest]
  }
}

