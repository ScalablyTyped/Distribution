package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchParameters extends js.Object {
  var fileId: String
  var resource: js.UndefOr[WatchResource] = js.undefined
  var revisionId: js.UndefOr[String] = js.undefined
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
}

object WatchParameters {
  @scala.inline
  def apply(
    fileId: String,
    resource: WatchResource = null,
    revisionId: String = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  ): WatchParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchParameters]
  }
}

