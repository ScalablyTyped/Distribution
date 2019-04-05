package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastContentDetails extends js.Object {
  var boundStreamId: js.UndefOr[java.lang.String] = js.undefined
  var boundStreamLastUpdateTimeMs: js.UndefOr[java.lang.String] = js.undefined
  var closedCaptionsType: js.UndefOr[java.lang.String] = js.undefined
  var enableAutoStart: js.UndefOr[scala.Boolean] = js.undefined
  var enableClosedCaptions: js.UndefOr[scala.Boolean] = js.undefined
  var enableContentEncryption: js.UndefOr[scala.Boolean] = js.undefined
  var enableDvr: js.UndefOr[scala.Boolean] = js.undefined
  var enableEmbed: js.UndefOr[scala.Boolean] = js.undefined
  var enableLowLatency: js.UndefOr[scala.Boolean] = js.undefined
  var latencyPreference: js.UndefOr[java.lang.String] = js.undefined
  var mesh: js.UndefOr[java.lang.String] = js.undefined
  var monitorStream: js.UndefOr[MonitorStreamInfo] = js.undefined
  var projection: js.UndefOr[java.lang.String] = js.undefined
  var recordFromStart: js.UndefOr[scala.Boolean] = js.undefined
  var startWithSlate: js.UndefOr[scala.Boolean] = js.undefined
  var stereoLayout: js.UndefOr[java.lang.String] = js.undefined
}

object LiveBroadcastContentDetails {
  @scala.inline
  def apply(
    boundStreamId: java.lang.String = null,
    boundStreamLastUpdateTimeMs: java.lang.String = null,
    closedCaptionsType: java.lang.String = null,
    enableAutoStart: js.UndefOr[scala.Boolean] = js.undefined,
    enableClosedCaptions: js.UndefOr[scala.Boolean] = js.undefined,
    enableContentEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    enableDvr: js.UndefOr[scala.Boolean] = js.undefined,
    enableEmbed: js.UndefOr[scala.Boolean] = js.undefined,
    enableLowLatency: js.UndefOr[scala.Boolean] = js.undefined,
    latencyPreference: java.lang.String = null,
    mesh: java.lang.String = null,
    monitorStream: MonitorStreamInfo = null,
    projection: java.lang.String = null,
    recordFromStart: js.UndefOr[scala.Boolean] = js.undefined,
    startWithSlate: js.UndefOr[scala.Boolean] = js.undefined,
    stereoLayout: java.lang.String = null
  ): LiveBroadcastContentDetails = {
    val __obj = js.Dynamic.literal()
    if (boundStreamId != null) __obj.updateDynamic("boundStreamId")(boundStreamId)
    if (boundStreamLastUpdateTimeMs != null) __obj.updateDynamic("boundStreamLastUpdateTimeMs")(boundStreamLastUpdateTimeMs)
    if (closedCaptionsType != null) __obj.updateDynamic("closedCaptionsType")(closedCaptionsType)
    if (!js.isUndefined(enableAutoStart)) __obj.updateDynamic("enableAutoStart")(enableAutoStart)
    if (!js.isUndefined(enableClosedCaptions)) __obj.updateDynamic("enableClosedCaptions")(enableClosedCaptions)
    if (!js.isUndefined(enableContentEncryption)) __obj.updateDynamic("enableContentEncryption")(enableContentEncryption)
    if (!js.isUndefined(enableDvr)) __obj.updateDynamic("enableDvr")(enableDvr)
    if (!js.isUndefined(enableEmbed)) __obj.updateDynamic("enableEmbed")(enableEmbed)
    if (!js.isUndefined(enableLowLatency)) __obj.updateDynamic("enableLowLatency")(enableLowLatency)
    if (latencyPreference != null) __obj.updateDynamic("latencyPreference")(latencyPreference)
    if (mesh != null) __obj.updateDynamic("mesh")(mesh)
    if (monitorStream != null) __obj.updateDynamic("monitorStream")(monitorStream)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(recordFromStart)) __obj.updateDynamic("recordFromStart")(recordFromStart)
    if (!js.isUndefined(startWithSlate)) __obj.updateDynamic("startWithSlate")(startWithSlate)
    if (stereoLayout != null) __obj.updateDynamic("stereoLayout")(stereoLayout)
    __obj.asInstanceOf[LiveBroadcastContentDetails]
  }
}

