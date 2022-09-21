package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse extends StObject {
  
  /**
    * Output only. Applied insight config to generate the result data rows.
    */
  var appliedConfig: js.UndefOr[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig] = js.undefined
  
  /**
    * Output only. Next page token to be fetched. Set to empty or NULL if there are no more pages available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Result rows returned containing the required value(s) for configured insight.
    */
  var rows: js.UndefOr[js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow]] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse](x: Self) {
    
    inline def setAppliedConfig(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig): Self = StObject.set(x, "appliedConfig", value.asInstanceOf[js.Any])
    
    inline def setAppliedConfigUndefined: Self = StObject.set(x, "appliedConfig", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRows(value: js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
