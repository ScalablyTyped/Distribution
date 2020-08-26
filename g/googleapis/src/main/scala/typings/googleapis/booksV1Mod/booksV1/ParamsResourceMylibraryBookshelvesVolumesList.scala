package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMylibraryBookshelvesVolumesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ISO-3166-1 code to override the IP-based location.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Restrict information returned to a set of selected fields.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Full-text search query string in this bookshelf.
    */
  var q: js.UndefOr[String] = js.native
  /**
    * The bookshelf ID or name retrieve volumes for.
    */
  var shelf: js.UndefOr[String] = js.native
  /**
    * Set to true to show pre-ordered books. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Index of the first element to return (starts at 0)
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object ParamsResourceMylibraryBookshelvesVolumesList {
  @scala.inline
  def apply(): ParamsResourceMylibraryBookshelvesVolumesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryBookshelvesVolumesList]
  }
  @scala.inline
  implicit class ParamsResourceMylibraryBookshelvesVolumesListOps[Self <: ParamsResourceMylibraryBookshelvesVolumesList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setShelf(value: String): Self = this.set("shelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShelf: Self = this.set("shelf", js.undefined)
    @scala.inline
    def setShowPreorders(value: Boolean): Self = this.set("showPreorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPreorders: Self = this.set("showPreorders", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
  
}

