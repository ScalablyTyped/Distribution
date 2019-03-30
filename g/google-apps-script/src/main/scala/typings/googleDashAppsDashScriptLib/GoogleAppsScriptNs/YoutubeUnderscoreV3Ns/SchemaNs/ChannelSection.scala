package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSection extends js.Object {
  var contentDetails: js.UndefOr[ChannelSectionContentDetails] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var localizations: js.UndefOr[js.Object] = js.undefined
  var snippet: js.UndefOr[ChannelSectionSnippet] = js.undefined
  var targeting: js.UndefOr[ChannelSectionTargeting] = js.undefined
}

object ChannelSection {
  @scala.inline
  def apply(
    contentDetails: ChannelSectionContentDetails = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    localizations: js.Object = null,
    snippet: ChannelSectionSnippet = null,
    targeting: ChannelSectionTargeting = null
  ): ChannelSection = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localizations != null) __obj.updateDynamic("localizations")(localizations)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (targeting != null) __obj.updateDynamic("targeting")(targeting)
    __obj.asInstanceOf[ChannelSection]
  }
}

