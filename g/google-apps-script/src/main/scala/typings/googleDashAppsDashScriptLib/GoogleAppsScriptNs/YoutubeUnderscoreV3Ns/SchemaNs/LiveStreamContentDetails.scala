package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamContentDetails extends js.Object {
  var closedCaptionsIngestionUrl: js.UndefOr[java.lang.String] = js.undefined
  var isReusable: js.UndefOr[scala.Boolean] = js.undefined
}

object LiveStreamContentDetails {
  @scala.inline
  def apply(
    closedCaptionsIngestionUrl: java.lang.String = null,
    isReusable: js.UndefOr[scala.Boolean] = js.undefined
  ): LiveStreamContentDetails = {
    val __obj = js.Dynamic.literal()
    if (closedCaptionsIngestionUrl != null) __obj.updateDynamic("closedCaptionsIngestionUrl")(closedCaptionsIngestionUrl)
    if (!js.isUndefined(isReusable)) __obj.updateDynamic("isReusable")(isReusable)
    __obj.asInstanceOf[LiveStreamContentDetails]
  }
}

