package typings.gapiDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntrashParameters extends js.Object {
  var fileId: String
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
}

object UntrashParameters {
  @scala.inline
  def apply(fileId: String, supportsTeamDrives: js.UndefOr[Boolean] = js.undefined): UntrashParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    __obj.asInstanceOf[UntrashParameters]
  }
}

