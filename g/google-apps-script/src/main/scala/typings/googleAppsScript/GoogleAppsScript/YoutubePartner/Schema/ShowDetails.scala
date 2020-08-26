package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowDetails extends js.Object {
  var episodeNumber: js.UndefOr[String] = js.native
  var episodeTitle: js.UndefOr[String] = js.native
  var seasonNumber: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object ShowDetails {
  @scala.inline
  def apply(): ShowDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowDetails]
  }
  @scala.inline
  implicit class ShowDetailsOps[Self <: ShowDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEpisodeNumber(value: String): Self = this.set("episodeNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpisodeNumber: Self = this.set("episodeNumber", js.undefined)
    @scala.inline
    def setEpisodeTitle(value: String): Self = this.set("episodeTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpisodeTitle: Self = this.set("episodeTitle", js.undefined)
    @scala.inline
    def setSeasonNumber(value: String): Self = this.set("seasonNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeasonNumber: Self = this.set("seasonNumber", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

