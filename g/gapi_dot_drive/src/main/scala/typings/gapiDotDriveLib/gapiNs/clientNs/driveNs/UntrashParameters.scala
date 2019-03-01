package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntrashParameters extends js.Object {
  var fileId: java.lang.String
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
}

object UntrashParameters {
  @scala.inline
  def apply(fileId: java.lang.String, supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined): UntrashParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileId")(fileId)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    __obj.asInstanceOf[UntrashParameters]
  }
}

