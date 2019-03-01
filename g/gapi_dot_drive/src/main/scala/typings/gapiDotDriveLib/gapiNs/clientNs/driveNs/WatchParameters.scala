package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchParameters extends js.Object {
  var fileId: java.lang.String
  var resource: js.UndefOr[WatchResource] = js.undefined
  var revisionId: js.UndefOr[java.lang.String] = js.undefined
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
}

object WatchParameters {
  @scala.inline
  def apply(
    fileId: java.lang.String,
    resource: WatchResource = null,
    revisionId: java.lang.String = null,
    supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
  ): WatchParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileId")(fileId)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    __obj.asInstanceOf[WatchParameters]
  }
}

