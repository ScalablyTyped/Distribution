package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Claim extends js.Object {
  var appliedPolicy: js.UndefOr[Policy] = js.undefined
  var assetId: js.UndefOr[String] = js.undefined
  var blockOutsideOwnership: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isPartnerUploaded: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var matchInfo: js.UndefOr[ClaimMatchInfo] = js.undefined
  var origin: js.UndefOr[ClaimOrigin] = js.undefined
  var policy: js.UndefOr[Policy] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object Claim {
  @scala.inline
  def apply(
    appliedPolicy: Policy = null,
    assetId: String = null,
    blockOutsideOwnership: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    id: String = null,
    isPartnerUploaded: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    matchInfo: ClaimMatchInfo = null,
    origin: ClaimOrigin = null,
    policy: Policy = null,
    status: String = null,
    timeCreated: String = null,
    videoId: String = null
  ): Claim = {
    val __obj = js.Dynamic.literal()
    if (appliedPolicy != null) __obj.updateDynamic("appliedPolicy")(appliedPolicy)
    if (assetId != null) __obj.updateDynamic("assetId")(assetId)
    if (!js.isUndefined(blockOutsideOwnership)) __obj.updateDynamic("blockOutsideOwnership")(blockOutsideOwnership)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isPartnerUploaded)) __obj.updateDynamic("isPartnerUploaded")(isPartnerUploaded)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (matchInfo != null) __obj.updateDynamic("matchInfo")(matchInfo)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[Claim]
  }
}

