package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (episodeNumber != null) __obj.updateDynamic("episodeNumber")(episodeNumber.asInstanceOf[js.Any])
    if (episodeTitle != null) __obj.updateDynamic("episodeTitle")(episodeTitle.asInstanceOf[js.Any])
    if (seasonNumber != null) __obj.updateDynamic("seasonNumber")(seasonNumber.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowDetails]
  }
}

