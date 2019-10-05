package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastContentDetails extends js.Object {
  var boundStreamId: js.UndefOr[String] = js.undefined
  var boundStreamLastUpdateTimeMs: js.UndefOr[String] = js.undefined
  var closedCaptionsType: js.UndefOr[String] = js.undefined
  var enableAutoStart: js.UndefOr[Boolean] = js.undefined
  var enableClosedCaptions: js.UndefOr[Boolean] = js.undefined
  var enableContentEncryption: js.UndefOr[Boolean] = js.undefined
  var enableDvr: js.UndefOr[Boolean] = js.undefined
  var enableEmbed: js.UndefOr[Boolean] = js.undefined
  var enableLowLatency: js.UndefOr[Boolean] = js.undefined
  var latencyPreference: js.UndefOr[String] = js.undefined
  var mesh: js.UndefOr[String] = js.undefined
  var monitorStream: js.UndefOr[MonitorStreamInfo] = js.undefined
  var projection: js.UndefOr[String] = js.undefined
  var recordFromStart: js.UndefOr[Boolean] = js.undefined
  var startWithSlate: js.UndefOr[Boolean] = js.undefined
  var stereoLayout: js.UndefOr[String] = js.undefined
}

object LiveBroadcastContentDetails {
  @scala.inline
  def apply(
    boundStreamId: String = null,
    boundStreamLastUpdateTimeMs: String = null,
    closedCaptionsType: String = null,
    enableAutoStart: js.UndefOr[Boolean] = js.undefined,
    enableClosedCaptions: js.UndefOr[Boolean] = js.undefined,
    enableContentEncryption: js.UndefOr[Boolean] = js.undefined,
    enableDvr: js.UndefOr[Boolean] = js.undefined,
    enableEmbed: js.UndefOr[Boolean] = js.undefined,
    enableLowLatency: js.UndefOr[Boolean] = js.undefined,
    latencyPreference: String = null,
    mesh: String = null,
    monitorStream: MonitorStreamInfo = null,
    projection: String = null,
    recordFromStart: js.UndefOr[Boolean] = js.undefined,
    startWithSlate: js.UndefOr[Boolean] = js.undefined,
    stereoLayout: String = null
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

