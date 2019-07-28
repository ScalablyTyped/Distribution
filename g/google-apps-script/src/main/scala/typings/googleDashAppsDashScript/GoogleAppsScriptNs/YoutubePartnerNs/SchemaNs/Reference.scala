package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var assetId: js.UndefOr[String] = js.undefined
  var audioswapEnabled: js.UndefOr[Boolean] = js.undefined
  var claimId: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var duplicateLeader: js.UndefOr[String] = js.undefined
  var excludedIntervals: js.UndefOr[js.Array[ExcludedInterval]] = js.undefined
  var fpDirect: js.UndefOr[Boolean] = js.undefined
  @JSName("hashCode")
  var hashCode_FReference: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreFpMatch: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var origination: js.UndefOr[Origination] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var statusReason: js.UndefOr[String] = js.undefined
  var urgent: js.UndefOr[Boolean] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object Reference {
  @scala.inline
  def apply(
    assetId: String = null,
    audioswapEnabled: js.UndefOr[Boolean] = js.undefined,
    claimId: String = null,
    contentType: String = null,
    duplicateLeader: String = null,
    excludedIntervals: js.Array[ExcludedInterval] = null,
    fpDirect: js.UndefOr[Boolean] = js.undefined,
    hashCode: String = null,
    id: String = null,
    ignoreFpMatch: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    length: Int | Double = null,
    origination: Origination = null,
    status: String = null,
    statusReason: String = null,
    urgent: js.UndefOr[Boolean] = js.undefined,
    videoId: String = null
  ): Reference = {
    val __obj = js.Dynamic.literal()
    if (assetId != null) __obj.updateDynamic("assetId")(assetId)
    if (!js.isUndefined(audioswapEnabled)) __obj.updateDynamic("audioswapEnabled")(audioswapEnabled)
    if (claimId != null) __obj.updateDynamic("claimId")(claimId)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (duplicateLeader != null) __obj.updateDynamic("duplicateLeader")(duplicateLeader)
    if (excludedIntervals != null) __obj.updateDynamic("excludedIntervals")(excludedIntervals)
    if (!js.isUndefined(fpDirect)) __obj.updateDynamic("fpDirect")(fpDirect)
    if (hashCode != null) __obj.updateDynamic("hashCode")(hashCode)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreFpMatch)) __obj.updateDynamic("ignoreFpMatch")(ignoreFpMatch)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (origination != null) __obj.updateDynamic("origination")(origination)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    if (!js.isUndefined(urgent)) __obj.updateDynamic("urgent")(urgent)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[Reference]
  }
}

