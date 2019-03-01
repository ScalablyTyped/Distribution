package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameters extends js.Object {
  var acknowledgeAbuse: js.UndefOr[scala.Boolean] = js.undefined
  var fileId: java.lang.String
  var projection: js.UndefOr[java.lang.String] = js.undefined
  var revisionId: js.UndefOr[java.lang.String] = js.undefined
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
  var updateViewedDate: js.UndefOr[scala.Boolean] = js.undefined
}

object GetParameters {
  @scala.inline
  def apply(
    fileId: java.lang.String,
    acknowledgeAbuse: js.UndefOr[scala.Boolean] = js.undefined,
    projection: java.lang.String = null,
    revisionId: java.lang.String = null,
    supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined,
    updateViewedDate: js.UndefOr[scala.Boolean] = js.undefined
  ): GetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileId")(fileId)
    if (!js.isUndefined(acknowledgeAbuse)) __obj.updateDynamic("acknowledgeAbuse")(acknowledgeAbuse)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    if (!js.isUndefined(updateViewedDate)) __obj.updateDynamic("updateViewedDate")(updateViewedDate)
    __obj.asInstanceOf[GetParameters]
  }
}

