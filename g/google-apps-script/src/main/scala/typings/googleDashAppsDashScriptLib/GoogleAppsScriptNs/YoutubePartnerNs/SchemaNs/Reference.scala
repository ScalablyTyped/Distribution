package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var assetId: js.UndefOr[java.lang.String] = js.undefined
  var audioswapEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var claimId: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var duplicateLeader: js.UndefOr[java.lang.String] = js.undefined
  var excludedIntervals: js.UndefOr[js.Array[ExcludedInterval]] = js.undefined
  var fpDirect: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("hashCode")
  var hashCode_FReference: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var ignoreFpMatch: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var origination: js.UndefOr[Origination] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var statusReason: js.UndefOr[java.lang.String] = js.undefined
  var urgent: js.UndefOr[scala.Boolean] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object Reference {
  @scala.inline
  def apply(
    assetId: java.lang.String = null,
    audioswapEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    claimId: java.lang.String = null,
    contentType: java.lang.String = null,
    duplicateLeader: java.lang.String = null,
    excludedIntervals: js.Array[ExcludedInterval] = null,
    fpDirect: js.UndefOr[scala.Boolean] = js.undefined,
    hashCode: java.lang.String = null,
    id: java.lang.String = null,
    ignoreFpMatch: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    origination: Origination = null,
    status: java.lang.String = null,
    statusReason: java.lang.String = null,
    urgent: js.UndefOr[scala.Boolean] = js.undefined,
    videoId: java.lang.String = null
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

