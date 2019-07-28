package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContentDetails extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var contentRating: js.UndefOr[ContentRating] = js.undefined
  var countryRestriction: js.UndefOr[AccessPolicy] = js.undefined
  var definition: js.UndefOr[String] = js.undefined
  var dimension: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var hasCustomThumbnail: js.UndefOr[Boolean] = js.undefined
  var licensedContent: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[String] = js.undefined
  var regionRestriction: js.UndefOr[VideoContentDetailsRegionRestriction] = js.undefined
}

object VideoContentDetails {
  @scala.inline
  def apply(
    caption: String = null,
    contentRating: ContentRating = null,
    countryRestriction: AccessPolicy = null,
    definition: String = null,
    dimension: String = null,
    duration: String = null,
    hasCustomThumbnail: js.UndefOr[Boolean] = js.undefined,
    licensedContent: js.UndefOr[Boolean] = js.undefined,
    projection: String = null,
    regionRestriction: VideoContentDetailsRegionRestriction = null
  ): VideoContentDetails = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (contentRating != null) __obj.updateDynamic("contentRating")(contentRating)
    if (countryRestriction != null) __obj.updateDynamic("countryRestriction")(countryRestriction)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (!js.isUndefined(hasCustomThumbnail)) __obj.updateDynamic("hasCustomThumbnail")(hasCustomThumbnail)
    if (!js.isUndefined(licensedContent)) __obj.updateDynamic("licensedContent")(licensedContent)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (regionRestriction != null) __obj.updateDynamic("regionRestriction")(regionRestriction)
    __obj.asInstanceOf[VideoContentDetails]
  }
}

