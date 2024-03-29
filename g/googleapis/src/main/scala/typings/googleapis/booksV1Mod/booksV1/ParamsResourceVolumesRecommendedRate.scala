package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVolumesRecommendedRate
  extends StObject
     with StandardParameters {
  
  /**
    * ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Rating to be given to the volume.
    */
  var rating: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the source volume.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceVolumesRecommendedRate {
  
  inline def apply(): ParamsResourceVolumesRecommendedRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVolumesRecommendedRate]
  }
  
  extension [Self <: ParamsResourceVolumesRecommendedRate](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
