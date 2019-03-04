package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchParameters extends js.Object {
  var fileId: java.lang.String
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
}

object TouchParameters {
  @scala.inline
  def apply(fileId: java.lang.String, supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined): TouchParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    __obj.asInstanceOf[TouchParameters]
  }
}

