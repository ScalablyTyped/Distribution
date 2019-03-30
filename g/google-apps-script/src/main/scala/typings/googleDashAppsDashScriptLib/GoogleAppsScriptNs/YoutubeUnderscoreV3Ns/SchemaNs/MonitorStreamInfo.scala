package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorStreamInfo extends js.Object {
  var broadcastStreamDelayMs: js.UndefOr[scala.Double] = js.undefined
  var embedHtml: js.UndefOr[java.lang.String] = js.undefined
  var enableMonitorStream: js.UndefOr[scala.Boolean] = js.undefined
}

object MonitorStreamInfo {
  @scala.inline
  def apply(
    broadcastStreamDelayMs: scala.Int | scala.Double = null,
    embedHtml: java.lang.String = null,
    enableMonitorStream: js.UndefOr[scala.Boolean] = js.undefined
  ): MonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    if (broadcastStreamDelayMs != null) __obj.updateDynamic("broadcastStreamDelayMs")(broadcastStreamDelayMs.asInstanceOf[js.Any])
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml)
    if (!js.isUndefined(enableMonitorStream)) __obj.updateDynamic("enableMonitorStream")(enableMonitorStream)
    __obj.asInstanceOf[MonitorStreamInfo]
  }
}

