package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSection extends js.Object {
  var contentDetails: js.UndefOr[ChannelSectionContentDetails] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var localizations: js.UndefOr[js.Object] = js.undefined
  var snippet: js.UndefOr[ChannelSectionSnippet] = js.undefined
  var targeting: js.UndefOr[ChannelSectionTargeting] = js.undefined
}

object ChannelSection {
  @scala.inline
  def apply(
    contentDetails: ChannelSectionContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    localizations: js.Object = null,
    snippet: ChannelSectionSnippet = null,
    targeting: ChannelSectionTargeting = null
  ): ChannelSection = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (targeting != null) __obj.updateDynamic("targeting")(targeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSection]
  }
}

