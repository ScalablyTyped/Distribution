package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBooksVolumesRecommendedRateResponse extends StObject {
  
  var consistency_token: js.UndefOr[String] = js.undefined
}
object SchemaBooksVolumesRecommendedRateResponse {
  
  inline def apply(): SchemaBooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooksVolumesRecommendedRateResponse]
  }
  
  extension [Self <: SchemaBooksVolumesRecommendedRateResponse](x: Self) {
    
    inline def setConsistency_token(value: String): Self = StObject.set(x, "consistency_token", value.asInstanceOf[js.Any])
    
    inline def setConsistency_tokenUndefined: Self = StObject.set(x, "consistency_token", js.undefined)
  }
}
