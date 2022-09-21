package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1Access extends StObject {
  
  /**
    * The analysis state of this access.
    */
  var analysisState: js.UndefOr[SchemaIamPolicyAnalysisState] = js.undefined
  
  /**
    * The permission.
    */
  var permission: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The role.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1Access {
  
  inline def apply(): SchemaGoogleCloudAssetV1Access = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1Access]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1Access](x: Self) {
    
    inline def setAnalysisState(value: SchemaIamPolicyAnalysisState): Self = StObject.set(x, "analysisState", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStateUndefined: Self = StObject.set(x, "analysisState", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
