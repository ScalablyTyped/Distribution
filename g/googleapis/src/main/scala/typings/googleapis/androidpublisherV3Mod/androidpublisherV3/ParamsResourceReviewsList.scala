package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReviewsList
  extends StObject
     with StandardParameters {
  
  /**
    * How many results the list operation should return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The index of the first element to return.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Pagination token. If empty, list starts at the first review.
    */
  var token: js.UndefOr[String] = js.undefined
  
  /**
    * Language localization code.
    */
  var translationLanguage: js.UndefOr[String] = js.undefined
}
object ParamsResourceReviewsList {
  
  inline def apply(): ParamsResourceReviewsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReviewsList]
  }
  
  extension [Self <: ParamsResourceReviewsList](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setTranslationLanguage(value: String): Self = StObject.set(x, "translationLanguage", value.asInstanceOf[js.Any])
    
    inline def setTranslationLanguageUndefined: Self = StObject.set(x, "translationLanguage", js.undefined)
  }
}
