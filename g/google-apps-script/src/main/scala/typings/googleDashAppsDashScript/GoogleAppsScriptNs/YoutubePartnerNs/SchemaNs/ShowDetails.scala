package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowDetails extends js.Object {
  var episodeNumber: js.UndefOr[String] = js.undefined
  var episodeTitle: js.UndefOr[String] = js.undefined
  var seasonNumber: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ShowDetails {
  @scala.inline
  def apply(
    episodeNumber: String = null,
    episodeTitle: String = null,
    seasonNumber: String = null,
    title: String = null
  ): ShowDetails = {
    val __obj = js.Dynamic.literal()
    if (episodeNumber != null) __obj.updateDynamic("episodeNumber")(episodeNumber)
    if (episodeTitle != null) __obj.updateDynamic("episodeTitle")(episodeTitle)
    if (seasonNumber != null) __obj.updateDynamic("seasonNumber")(seasonNumber)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ShowDetails]
  }
}

