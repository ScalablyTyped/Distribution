package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamContentDetails extends js.Object {
  var closedCaptionsIngestionUrl: js.UndefOr[String] = js.undefined
  var isReusable: js.UndefOr[Boolean] = js.undefined
}

object LiveStreamContentDetails {
  @scala.inline
  def apply(closedCaptionsIngestionUrl: String = null, isReusable: js.UndefOr[Boolean] = js.undefined): LiveStreamContentDetails = {
    val __obj = js.Dynamic.literal()
    if (closedCaptionsIngestionUrl != null) __obj.updateDynamic("closedCaptionsIngestionUrl")(closedCaptionsIngestionUrl)
    if (!js.isUndefined(isReusable)) __obj.updateDynamic("isReusable")(isReusable)
    __obj.asInstanceOf[LiveStreamContentDetails]
  }
}

