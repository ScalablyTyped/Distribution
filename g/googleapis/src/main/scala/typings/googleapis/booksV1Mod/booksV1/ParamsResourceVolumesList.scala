package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceVolumesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Restrict to volumes by download availability.
    */
  var download: js.UndefOr[String] = js.native
  
  /**
    * Filter search results.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Restrict results to books with this language code.
    */
  var langRestrict: js.UndefOr[String] = js.native
  
  /**
    * Restrict search to this user's library.
    */
  var libraryRestrict: js.UndefOr[String] = js.native
  
  /**
    * The maximum allowed maturity rating of returned recommendations. Books
    * with a higher maturity rating are filtered out.
    */
  var maxAllowedMaturityRating: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Sort search results.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Restrict and brand results for partner ID.
    */
  var partner: js.UndefOr[String] = js.native
  
  /**
    * Restrict to books or magazines.
    */
  var printType: js.UndefOr[String] = js.native
  
  /**
    * Restrict information returned to a set of selected fields.
    */
  var projection: js.UndefOr[String] = js.native
  
  /**
    * Full-text search query string.
    */
  var q: js.UndefOr[String] = js.native
  
  /**
    * Set to true to show books available for preorder. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.native
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Index of the first result to return (starts at 0)
    */
  var startIndex: js.UndefOr[Double] = js.native
}
object ParamsResourceVolumesList {
  
  @scala.inline
  def apply(): ParamsResourceVolumesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVolumesList]
  }
  
  @scala.inline
  implicit class ParamsResourceVolumesListOps[Self <: ParamsResourceVolumesList] (val x: Self) extends AnyVal {
    
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
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLangRestrict(value: String): Self = this.set("langRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLangRestrict: Self = this.set("langRestrict", js.undefined)
    
    @scala.inline
    def setLibraryRestrict(value: String): Self = this.set("libraryRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryRestrict: Self = this.set("libraryRestrict", js.undefined)
    
    @scala.inline
    def setMaxAllowedMaturityRating(value: String): Self = this.set("maxAllowedMaturityRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAllowedMaturityRating: Self = this.set("maxAllowedMaturityRating", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPartner(value: String): Self = this.set("partner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartner: Self = this.set("partner", js.undefined)
    
    @scala.inline
    def setPrintType(value: String): Self = this.set("printType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintType: Self = this.set("printType", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
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
