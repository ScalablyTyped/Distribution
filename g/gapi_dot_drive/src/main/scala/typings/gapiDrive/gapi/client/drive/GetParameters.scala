package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameters extends js.Object {
  var acknowledgeAbuse: js.UndefOr[Boolean] = js.undefined
  var fileId: String
  var projection: js.UndefOr[String] = js.undefined
  var revisionId: js.UndefOr[String] = js.undefined
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  var updateViewedDate: js.UndefOr[Boolean] = js.undefined
}

object GetParameters {
  @scala.inline
  def apply(
    fileId: String,
    acknowledgeAbuse: js.UndefOr[Boolean] = js.undefined,
    projection: String = null,
    revisionId: String = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    updateViewedDate: js.UndefOr[Boolean] = js.undefined
  ): GetParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (!js.isUndefined(acknowledgeAbuse)) __obj.updateDynamic("acknowledgeAbuse")(acknowledgeAbuse.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    if (!js.isUndefined(updateViewedDate)) __obj.updateDynamic("updateViewedDate")(updateViewedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters]
  }
}

