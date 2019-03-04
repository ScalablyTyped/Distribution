package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrashParameters extends js.Object {
  var fileId: java.lang.String
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
}

object TrashParameters {
  @scala.inline
  def apply(fileId: java.lang.String, supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined): TrashParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    __obj.asInstanceOf[TrashParameters]
  }
}

