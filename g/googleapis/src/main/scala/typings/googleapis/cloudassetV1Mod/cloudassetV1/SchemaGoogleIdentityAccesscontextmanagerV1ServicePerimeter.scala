package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeter extends StObject {
  
  /**
    * Description of the `ServicePerimeter` and its use. Does not affect behavior.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy\}/servicePerimeters/{service_perimeter\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
    */
  var perimeterType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only allowed to be set when the "use_explicit_dry_run_spec" flag is set.
    */
  var spec: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig] = js.undefined
  
  /**
    * Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries.
    */
  var status: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig] = js.undefined
  
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration ("spec") to use in a dry-run version of the Service Perimeter. This allows the user to test changes to the enforced config ("status") without actually enforcing them. This testing is done through analyzing the differences between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
    */
  var useExplicitDryRunSpec: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeter {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeter]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeter](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPerimeterType(value: String): Self = StObject.set(x, "perimeterType", value.asInstanceOf[js.Any])
    
    inline def setPerimeterTypeNull: Self = StObject.set(x, "perimeterType", null)
    
    inline def setPerimeterTypeUndefined: Self = StObject.set(x, "perimeterType", js.undefined)
    
    inline def setSpec(value: SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setStatus(value: SchemaGoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUseExplicitDryRunSpec(value: Boolean): Self = StObject.set(x, "useExplicitDryRunSpec", value.asInstanceOf[js.Any])
    
    inline def setUseExplicitDryRunSpecNull: Self = StObject.set(x, "useExplicitDryRunSpec", null)
    
    inline def setUseExplicitDryRunSpecUndefined: Self = StObject.set(x, "useExplicitDryRunSpec", js.undefined)
  }
}
