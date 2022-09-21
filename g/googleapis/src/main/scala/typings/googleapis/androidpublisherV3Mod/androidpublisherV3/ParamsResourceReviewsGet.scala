package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReviewsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for a review.
    */
  var reviewId: js.UndefOr[String] = js.undefined
  
  /**
    * Language localization code.
    */
  var translationLanguage: js.UndefOr[String] = js.undefined
}
object ParamsResourceReviewsGet {
  
  inline def apply(): ParamsResourceReviewsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReviewsGet]
  }
  
  extension [Self <: ParamsResourceReviewsGet](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setReviewId(value: String): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    inline def setReviewIdUndefined: Self = StObject.set(x, "reviewId", js.undefined)
    
    inline def setTranslationLanguage(value: String): Self = StObject.set(x, "translationLanguage", value.asInstanceOf[js.Any])
    
    inline def setTranslationLanguageUndefined: Self = StObject.set(x, "translationLanguage", js.undefined)
  }
}
