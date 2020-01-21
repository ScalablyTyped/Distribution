package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (!js.isUndefined(audioswapEnabled)) __obj.updateDynamic("audioswapEnabled")(audioswapEnabled.asInstanceOf[js.Any])
    if (claimId != null) __obj.updateDynamic("claimId")(claimId.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (duplicateLeader != null) __obj.updateDynamic("duplicateLeader")(duplicateLeader.asInstanceOf[js.Any])
    if (excludedIntervals != null) __obj.updateDynamic("excludedIntervals")(excludedIntervals.asInstanceOf[js.Any])
    if (!js.isUndefined(fpDirect)) __obj.updateDynamic("fpDirect")(fpDirect.asInstanceOf[js.Any])
    if (hashCode != null) __obj.updateDynamic("hashCode")(hashCode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreFpMatch)) __obj.updateDynamic("ignoreFpMatch")(ignoreFpMatch.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (origination != null) __obj.updateDynamic("origination")(origination.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (!js.isUndefined(urgent)) __obj.updateDynamic("urgent")(urgent.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

