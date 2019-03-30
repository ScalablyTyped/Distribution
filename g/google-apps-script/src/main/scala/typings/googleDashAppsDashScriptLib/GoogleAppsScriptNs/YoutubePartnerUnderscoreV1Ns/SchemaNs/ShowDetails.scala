package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowDetails extends js.Object {
  var episodeNumber: js.UndefOr[java.lang.String] = js.undefined
  var episodeTitle: js.UndefOr[java.lang.String] = js.undefined
  var seasonNumber: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ShowDetails {
  @scala.inline
  def apply(
    episodeNumber: java.lang.String = null,
    episodeTitle: java.lang.String = null,
    seasonNumber: java.lang.String = null,
    title: java.lang.String = null
  ): ShowDetails = {
    val __obj = js.Dynamic.literal()
    if (episodeNumber != null) __obj.updateDynamic("episodeNumber")(episodeNumber)
    if (episodeTitle != null) __obj.updateDynamic("episodeTitle")(episodeTitle)
    if (seasonNumber != null) __obj.updateDynamic("seasonNumber")(seasonNumber)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ShowDetails]
  }
}

