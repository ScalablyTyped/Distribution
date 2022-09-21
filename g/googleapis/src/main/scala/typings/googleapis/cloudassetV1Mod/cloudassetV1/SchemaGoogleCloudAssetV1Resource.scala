package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1Resource extends StObject {
  
  /**
    * The analysis state of this resource.
    */
  var analysisState: js.UndefOr[SchemaIamPolicyAnalysisState] = js.undefined
  
  /**
    * The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format)
    */
  var fullResourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1Resource {
  
  inline def apply(): SchemaGoogleCloudAssetV1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1Resource]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1Resource](x: Self) {
    
    inline def setAnalysisState(value: SchemaIamPolicyAnalysisState): Self = StObject.set(x, "analysisState", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStateUndefined: Self = StObject.set(x, "analysisState", js.undefined)
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
