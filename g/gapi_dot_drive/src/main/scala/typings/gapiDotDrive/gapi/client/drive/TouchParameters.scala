package typings.gapiDotDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchParameters extends js.Object {
  var fileId: String
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
}

object TouchParameters {
  @scala.inline
  def apply(fileId: String, supportsTeamDrives: js.UndefOr[Boolean] = js.undefined): TouchParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    __obj.asInstanceOf[TouchParameters]
  }
}

