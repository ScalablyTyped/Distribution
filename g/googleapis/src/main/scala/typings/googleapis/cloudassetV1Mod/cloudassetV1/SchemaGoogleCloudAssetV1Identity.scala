package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1Identity extends StObject {
  
  /**
    * The analysis state of this identity.
    */
  var analysisState: js.UndefOr[SchemaIamPolicyAnalysisState] = js.undefined
  
  /**
    * The identity name in any form of members appear in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding), such as: - user:foo@google.com - group:group1@google.com - serviceAccount:s1@prj1.iam.gserviceaccount.com - projectOwner:some_project_id - domain:google.com - allUsers - etc.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1Identity {
  
  inline def apply(): SchemaGoogleCloudAssetV1Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1Identity]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1Identity](x: Self) {
    
    inline def setAnalysisState(value: SchemaIamPolicyAnalysisState): Self = StObject.set(x, "analysisState", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStateUndefined: Self = StObject.set(x, "analysisState", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
