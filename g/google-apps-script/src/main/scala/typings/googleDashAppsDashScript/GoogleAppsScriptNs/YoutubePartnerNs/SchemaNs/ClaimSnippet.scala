package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

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
    if (assetId != null) __obj.updateDynamic("assetId")(assetId)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isPartnerUploaded)) __obj.updateDynamic("isPartnerUploaded")(isPartnerUploaded)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (status != null) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(thirdPartyClaim)) __obj.updateDynamic("thirdPartyClaim")(thirdPartyClaim)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (timeStatusLastModified != null) __obj.updateDynamic("timeStatusLastModified")(timeStatusLastModified)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (videoTitle != null) __obj.updateDynamic("videoTitle")(videoTitle)
    if (videoViews != null) __obj.updateDynamic("videoViews")(videoViews)
    __obj.asInstanceOf[ClaimSnippet]
  }
}

