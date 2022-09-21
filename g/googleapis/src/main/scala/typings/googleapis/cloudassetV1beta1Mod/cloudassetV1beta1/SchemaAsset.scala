package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsset extends StObject {
  
  /**
    * Please also refer to the [access level user guide](https://cloud.google.com/access-context-manager/docs/overview#access-levels).
    */
  var accessLevel: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1AccessLevel] = js.undefined
  
  /**
    * Please also refer to the [access policy user guide](https://cloud.google.com/access-context-manager/docs/overview#access-policies).
    */
  var accessPolicy: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1AccessPolicy] = js.undefined
  
  /**
    * The type of the asset. Example: `compute.googleapis.com/Disk` See [Supported asset types](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for more information.
    */
  var assetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A representation of the Cloud IAM policy set on a Google Cloud resource. There can be a maximum of one Cloud IAM policy set on any given resource. In addition, Cloud IAM policies inherit their granted access scope from any policies set on parent resources in the resource hierarchy. Therefore, the effectively policy is the union of both the policy set on this resource and each policy set on all of the resource's ancestry resource levels in the hierarchy. See [this topic](https://cloud.google.com/iam/help/allow-policies/inheritance) for more information.
    */
  var iamPolicy: js.UndefOr[SchemaPolicy] = js.undefined
  
  /**
    * The full name of the asset. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See [Resource names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A representation of an [organization policy](https://cloud.google.com/resource-manager/docs/organization-policy/overview#organization_policy). There can be more than one organization policy with different constraints set on a given resource.
    */
  var orgPolicy: js.UndefOr[js.Array[SchemaGoogleCloudOrgpolicyV1Policy]] = js.undefined
  
  /**
    * A representation of the resource.
    */
  var resource: js.UndefOr[SchemaResource] = js.undefined
  
  /**
    * Please also refer to the [service perimeter user guide](https://cloud.google.com/vpc-service-controls/docs/overview).
    */
  var servicePerimeter: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeter] = js.undefined
}
object SchemaAsset {
  
  inline def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  
  extension [Self <: SchemaAsset](x: Self) {
    
    inline def setAccessLevel(value: SchemaGoogleIdentityAccesscontextmanagerV1AccessLevel): Self = StObject.set(x, "accessLevel", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelUndefined: Self = StObject.set(x, "accessLevel", js.undefined)
    
    inline def setAccessPolicy(value: SchemaGoogleIdentityAccesscontextmanagerV1AccessPolicy): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyUndefined: Self = StObject.set(x, "accessPolicy", js.undefined)
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeNull: Self = StObject.set(x, "assetType", null)
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setIamPolicy(value: SchemaPolicy): Self = StObject.set(x, "iamPolicy", value.asInstanceOf[js.Any])
    
    inline def setIamPolicyUndefined: Self = StObject.set(x, "iamPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgPolicy(value: js.Array[SchemaGoogleCloudOrgpolicyV1Policy]): Self = StObject.set(x, "orgPolicy", value.asInstanceOf[js.Any])
    
    inline def setOrgPolicyUndefined: Self = StObject.set(x, "orgPolicy", js.undefined)
    
    inline def setOrgPolicyVarargs(value: SchemaGoogleCloudOrgpolicyV1Policy*): Self = StObject.set(x, "orgPolicy", js.Array(value*))
    
    inline def setResource(value: SchemaResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setServicePerimeter(value: SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeter): Self = StObject.set(x, "servicePerimeter", value.asInstanceOf[js.Any])
    
    inline def setServicePerimeterUndefined: Self = StObject.set(x, "servicePerimeter", js.undefined)
  }
}
