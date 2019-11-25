package typings.gapiDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParameters extends js.Object {
  var fileId: String
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
}

object DeleteParameters {
  @scala.inline
  def apply(fileId: String, supportsTeamDrives: js.UndefOr[Boolean] = js.undefined): DeleteParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters]
  }
}

