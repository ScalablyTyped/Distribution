package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight extends StObject {
  
  /**
    * Output only. Applied insight config to generate the result data rows.
    */
  var appliedConfig: js.UndefOr[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig] = js.undefined
  
  /**
    * Output only. Metadata for the Insight.
    */
  var metadata: js.UndefOr[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadata] = js.undefined
  
  /**
    * Output only. The insight resource name. e.g. `organizations/{organization_id\}/locations/{location_id\}/insights/{insight_id\}` OR `projects/{project_id\}/locations/{location_id\}/insights/{insight_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Result rows returned containing the required value(s).
    */
  var rows: js.UndefOr[js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow]] = js.undefined
}
object SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsight](x: Self) {
    
    inline def setAppliedConfig(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig): Self = StObject.set(x, "appliedConfig", value.asInstanceOf[js.Any])
    
    inline def setAppliedConfigUndefined: Self = StObject.set(x, "appliedConfig", js.undefined)
    
    inline def setMetadata(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaInsightMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRows(value: js.Array[SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaGoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
