package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVolumesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Restrict to volumes by download availability.
    */
  var download: js.UndefOr[String] = js.undefined
  
  /**
    * Filter search results.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict results to books with this language code.
    */
  var langRestrict: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict search to this user's library.
    */
  var libraryRestrict: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum allowed maturity rating of returned recommendations. Books
    * with a higher maturity rating are filtered out.
    */
  var maxAllowedMaturityRating: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Sort search results.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict and brand results for partner ID.
    */
  var partner: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict to books or magazines.
    */
  var printType: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict information returned to a set of selected fields.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Full-text search query string.
    */
  var q: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to show books available for preorder. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the first result to return (starts at 0)
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object ParamsResourceVolumesList {
  
  @scala.inline
  def apply(): ParamsResourceVolumesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVolumesList]
  }
  
  @scala.inline
  implicit class ParamsResourceVolumesListMutableBuilder[Self <: ParamsResourceVolumesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setLangRestrict(value: String): Self = StObject.set(x, "langRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangRestrictUndefined: Self = StObject.set(x, "langRestrict", js.undefined)
    
    @scala.inline
    def setLibraryRestrict(value: String): Self = StObject.set(x, "libraryRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryRestrictUndefined: Self = StObject.set(x, "libraryRestrict", js.undefined)
    
    @scala.inline
    def setMaxAllowedMaturityRating(value: String): Self = StObject.set(x, "maxAllowedMaturityRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllowedMaturityRatingUndefined: Self = StObject.set(x, "maxAllowedMaturityRating", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    @scala.inline
    def setPrintType(value: String): Self = StObject.set(x, "printType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintTypeUndefined: Self = StObject.set(x, "printType", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setShowPreorders(value: Boolean): Self = StObject.set(x, "showPreorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPreordersUndefined: Self = StObject.set(x, "showPreorders", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
