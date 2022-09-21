package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIamPolicyAnalysisOutputConfig extends StObject {
  
  /**
    * Destination on BigQuery.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudAssetV1BigQueryDestination] = js.undefined
  
  /**
    * Destination on Cloud Storage.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudAssetV1GcsDestination] = js.undefined
}
object SchemaIamPolicyAnalysisOutputConfig {
  
  inline def apply(): SchemaIamPolicyAnalysisOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicyAnalysisOutputConfig]
  }
  
  extension [Self <: SchemaIamPolicyAnalysisOutputConfig](x: Self) {
    
    inline def setBigqueryDestination(value: SchemaGoogleCloudAssetV1BigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setGcsDestination(value: SchemaGoogleCloudAssetV1GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
