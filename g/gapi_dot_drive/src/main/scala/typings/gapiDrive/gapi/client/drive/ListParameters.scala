package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListParameters extends js.Object {
  var corpora: js.UndefOr[String] = js.native
  var corpus: js.UndefOr[String] = js.native
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var orderBy: js.UndefOr[String] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var projection: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var spaces: js.UndefOr[String] = js.native
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  var teamDriveId: js.UndefOr[String] = js.native
}

object ListParameters {
  @scala.inline
  def apply(): ListParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListParameters]
  }
  @scala.inline
  implicit class ListParametersOps[Self <: ListParameters] (val x: Self) extends AnyVal {
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
    def setCorpora(value: String): Self = this.set("corpora", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorpora: Self = this.set("corpora", js.undefined)
    @scala.inline
    def setCorpus(value: String): Self = this.set("corpus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorpus: Self = this.set("corpus", js.undefined)
    @scala.inline
    def setIncludeTeamDriveItems(value: Boolean): Self = this.set("includeTeamDriveItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTeamDriveItems: Self = this.set("includeTeamDriveItems", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setSpaces(value: String): Self = this.set("spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    @scala.inline
    def setTeamDriveId(value: String): Self = this.set("teamDriveId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDriveId: Self = this.set("teamDriveId", js.undefined)
  }
  
}

