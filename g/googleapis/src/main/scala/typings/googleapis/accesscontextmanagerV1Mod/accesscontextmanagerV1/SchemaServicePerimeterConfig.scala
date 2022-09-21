package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServicePerimeterConfig extends StObject {
  
  /**
    * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be empty.
    */
  var accessLevels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of EgressPolicies to apply to the perimeter. A perimeter may have multiple EgressPolicies, each of which is evaluated separately. Access is granted if any EgressPolicy grants it. Must be empty for a perimeter bridge.
    */
  var egressPolicies: js.UndefOr[js.Array[SchemaEgressPolicy]] = js.undefined
  
  /**
    * List of IngressPolicies to apply to the perimeter. A perimeter may have multiple IngressPolicies, each of which is evaluated separately. Access is granted if any Ingress Policy grants it. Must be empty for a perimeter bridge.
    */
  var ingressPolicies: js.UndefOr[js.Array[SchemaIngressPolicy]] = js.undefined
  
  /**
    * A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number\}`
    */
  var resources: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter's access restrictions.
    */
  var restrictedServices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Configuration for APIs allowed within Perimeter.
    */
  var vpcAccessibleServices: js.UndefOr[SchemaVpcAccessibleServices] = js.undefined
}
object SchemaServicePerimeterConfig {
  
  inline def apply(): SchemaServicePerimeterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServicePerimeterConfig]
  }
  
  extension [Self <: SchemaServicePerimeterConfig](x: Self) {
    
    inline def setAccessLevels(value: js.Array[String]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsNull: Self = StObject.set(x, "accessLevels", null)
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: String*): Self = StObject.set(x, "accessLevels", js.Array(value*))
    
    inline def setEgressPolicies(value: js.Array[SchemaEgressPolicy]): Self = StObject.set(x, "egressPolicies", value.asInstanceOf[js.Any])
    
    inline def setEgressPoliciesUndefined: Self = StObject.set(x, "egressPolicies", js.undefined)
    
    inline def setEgressPoliciesVarargs(value: SchemaEgressPolicy*): Self = StObject.set(x, "egressPolicies", js.Array(value*))
    
    inline def setIngressPolicies(value: js.Array[SchemaIngressPolicy]): Self = StObject.set(x, "ingressPolicies", value.asInstanceOf[js.Any])
    
    inline def setIngressPoliciesUndefined: Self = StObject.set(x, "ingressPolicies", js.undefined)
    
    inline def setIngressPoliciesVarargs(value: SchemaIngressPolicy*): Self = StObject.set(x, "ingressPolicies", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setRestrictedServices(value: js.Array[String]): Self = StObject.set(x, "restrictedServices", value.asInstanceOf[js.Any])
    
    inline def setRestrictedServicesNull: Self = StObject.set(x, "restrictedServices", null)
    
    inline def setRestrictedServicesUndefined: Self = StObject.set(x, "restrictedServices", js.undefined)
    
    inline def setRestrictedServicesVarargs(value: String*): Self = StObject.set(x, "restrictedServices", js.Array(value*))
    
    inline def setVpcAccessibleServices(value: SchemaVpcAccessibleServices): Self = StObject.set(x, "vpcAccessibleServices", value.asInstanceOf[js.Any])
    
    inline def setVpcAccessibleServicesUndefined: Self = StObject.set(x, "vpcAccessibleServices", js.undefined)
  }
}
