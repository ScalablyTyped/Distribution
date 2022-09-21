package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVolumesList
  extends StObject
     with StandardParameters {
  
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
    * The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out.
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
  
  inline def apply(): ParamsResourceVolumesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVolumesList]
  }
  
  extension [Self <: ParamsResourceVolumesList](x: Self) {
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLangRestrict(value: String): Self = StObject.set(x, "langRestrict", value.asInstanceOf[js.Any])
    
    inline def setLangRestrictUndefined: Self = StObject.set(x, "langRestrict", js.undefined)
    
    inline def setLibraryRestrict(value: String): Self = StObject.set(x, "libraryRestrict", value.asInstanceOf[js.Any])
    
    inline def setLibraryRestrictUndefined: Self = StObject.set(x, "libraryRestrict", js.undefined)
    
    inline def setMaxAllowedMaturityRating(value: String): Self = StObject.set(x, "maxAllowedMaturityRating", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowedMaturityRatingUndefined: Self = StObject.set(x, "maxAllowedMaturityRating", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    inline def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    inline def setPrintType(value: String): Self = StObject.set(x, "printType", value.asInstanceOf[js.Any])
    
    inline def setPrintTypeUndefined: Self = StObject.set(x, "printType", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setShowPreorders(value: Boolean): Self = StObject.set(x, "showPreorders", value.asInstanceOf[js.Any])
    
    inline def setShowPreordersUndefined: Self = StObject.set(x, "showPreorders", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
