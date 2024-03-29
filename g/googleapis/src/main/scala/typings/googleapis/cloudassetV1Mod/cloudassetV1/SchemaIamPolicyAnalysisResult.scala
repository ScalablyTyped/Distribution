package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIamPolicyAnalysisResult extends StObject {
  
  /**
    * The access control lists derived from the iam_binding that match or potentially match resource and access selectors specified in the request.
    */
  var accessControlLists: js.UndefOr[js.Array[SchemaGoogleCloudAssetV1AccessControlList]] = js.undefined
  
  /**
    * The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) of the resource to which the iam_binding policy attaches.
    */
  var attachedResourceFullName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents whether all analyses on the iam_binding have successfully finished.
    */
  var fullyExplored: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The Cloud IAM policy binding under analysis.
    */
  var iamBinding: js.UndefOr[SchemaBinding] = js.undefined
  
  /**
    * The identity list derived from members of the iam_binding that match or potentially match identity selector specified in the request.
    */
  var identityList: js.UndefOr[SchemaGoogleCloudAssetV1IdentityList] = js.undefined
}
object SchemaIamPolicyAnalysisResult {
  
  inline def apply(): SchemaIamPolicyAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicyAnalysisResult]
  }
  
  extension [Self <: SchemaIamPolicyAnalysisResult](x: Self) {
    
    inline def setAccessControlLists(value: js.Array[SchemaGoogleCloudAssetV1AccessControlList]): Self = StObject.set(x, "accessControlLists", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListsUndefined: Self = StObject.set(x, "accessControlLists", js.undefined)
    
    inline def setAccessControlListsVarargs(value: SchemaGoogleCloudAssetV1AccessControlList*): Self = StObject.set(x, "accessControlLists", js.Array(value*))
    
    inline def setAttachedResourceFullName(value: String): Self = StObject.set(x, "attachedResourceFullName", value.asInstanceOf[js.Any])
    
    inline def setAttachedResourceFullNameNull: Self = StObject.set(x, "attachedResourceFullName", null)
    
    inline def setAttachedResourceFullNameUndefined: Self = StObject.set(x, "attachedResourceFullName", js.undefined)
    
    inline def setFullyExplored(value: Boolean): Self = StObject.set(x, "fullyExplored", value.asInstanceOf[js.Any])
    
    inline def setFullyExploredNull: Self = StObject.set(x, "fullyExplored", null)
    
    inline def setFullyExploredUndefined: Self = StObject.set(x, "fullyExplored", js.undefined)
    
    inline def setIamBinding(value: SchemaBinding): Self = StObject.set(x, "iamBinding", value.asInstanceOf[js.Any])
    
    inline def setIamBindingUndefined: Self = StObject.set(x, "iamBinding", js.undefined)
    
    inline def setIdentityList(value: SchemaGoogleCloudAssetV1IdentityList): Self = StObject.set(x, "identityList", value.asInstanceOf[js.Any])
    
    inline def setIdentityListUndefined: Self = StObject.set(x, "identityList", js.undefined)
  }
}
