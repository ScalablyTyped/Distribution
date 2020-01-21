package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorStreamInfo extends js.Object {
  var broadcastStreamDelayMs: js.UndefOr[Double] = js.undefined
  var embedHtml: js.UndefOr[String] = js.undefined
  var enableMonitorStream: js.UndefOr[Boolean] = js.undefined
}

object MonitorStreamInfo {
  @scala.inline
  def apply(
    broadcastStreamDelayMs: Int | Double = null,
    embedHtml: String = null,
    enableMonitorStream: js.UndefOr[Boolean] = js.undefined
  ): MonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    if (broadcastStreamDelayMs != null) __obj.updateDynamic("broadcastStreamDelayMs")(broadcastStreamDelayMs.asInstanceOf[js.Any])
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMonitorStream)) __obj.updateDynamic("enableMonitorStream")(enableMonitorStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorStreamInfo]
  }
}

