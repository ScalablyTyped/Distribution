package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimSnippet extends js.Object {
  var assetId: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isPartnerUploaded: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[ClaimSnippetOrigin] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var thirdPartyClaim: js.UndefOr[Boolean] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
  var timeStatusLastModified: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
  var videoTitle: js.UndefOr[String] = js.undefined
  var videoViews: js.UndefOr[String] = js.undefined
}

object ClaimSnippet {
  @scala.inline
  def apply(
    assetId: String = null,
    contentType: String = null,
    id: String = null,
    isPartnerUploaded: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    origin: ClaimSnippetOrigin = null,
    status: String = null,
    thirdPartyClaim: js.UndefOr[Boolean] = js.undefined,
    timeCreated: String = null,
    timeStatusLastModified: String = null,
    videoId: String = null,
    videoTitle: String = null,
    videoViews: String = null
  ): ClaimSnippet = {
    val __obj = js.Dynamic.literal()
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isPartnerUploaded)) __obj.updateDynamic("isPartnerUploaded")(isPartnerUploaded.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(thirdPartyClaim)) __obj.updateDynamic("thirdPartyClaim")(thirdPartyClaim.get.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (timeStatusLastModified != null) __obj.updateDynamic("timeStatusLastModified")(timeStatusLastModified.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (videoTitle != null) __obj.updateDynamic("videoTitle")(videoTitle.asInstanceOf[js.Any])
    if (videoViews != null) __obj.updateDynamic("videoViews")(videoViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimSnippet]
  }
}

