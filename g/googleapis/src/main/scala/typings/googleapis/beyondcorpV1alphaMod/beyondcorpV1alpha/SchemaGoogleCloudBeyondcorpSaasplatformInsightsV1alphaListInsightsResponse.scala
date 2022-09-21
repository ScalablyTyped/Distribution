package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse extends StObject {
  
  /**
    * Output only. List of all insights.
    */
  var insights: js.UndefOr[js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight]] = js.undefined
  
  /**
    * Output only. Next page token to be fetched. Set to empty or NULL if there are no more pages available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaListInsightsResponse](x: Self) {
    
    inline def setInsights(value: js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight]): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    inline def setInsightsVarargs(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight*): Self = StObject.set(x, "insights", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
