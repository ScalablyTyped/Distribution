package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `ServicePerimeterConfig` specifies a set of GCP resources that describe
  * specific Service Perimeter configuration.
  */
@js.native
trait SchemaServicePerimeterConfig extends StObject {
  
  /**
    * A list of `AccessLevel` resource names that allow resources within the
    * `ServicePerimeter` to be accessed from the internet. `AccessLevels`
    * listed must be in the same policy as this `ServicePerimeter`. Referencing
    * a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names
    * are listed, resources within the perimeter can only be accessed via GCP
    * calls with request origins within the perimeter. Example:
    * `&quot;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&quot;`. For Service
    * Perimeter Bridge, must be empty.
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of GCP resources that are inside of the service perimeter.
    * Currently only projects are allowed. Format: `projects/{project_number}`
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * GCP services that are subject to the Service Perimeter restrictions. For
    * example, if `storage.googleapis.com` is specified, access to the storage
    * buckets inside the perimeter must meet the perimeter&#39;s access
    * restrictions.
    */
  var restrictedServices: js.UndefOr[js.Array[String]] = js.native
}
object SchemaServicePerimeterConfig {
  
  @scala.inline
  def apply(): SchemaServicePerimeterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServicePerimeterConfig]
  }
  
  @scala.inline
  implicit class SchemaServicePerimeterConfigMutableBuilder[Self <: SchemaServicePerimeterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLevels(value: js.Array[String]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    @scala.inline
    def setAccessLevelsVarargs(value: String*): Self = StObject.set(x, "accessLevels", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedServices(value: js.Array[String]): Self = StObject.set(x, "restrictedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedServicesUndefined: Self = StObject.set(x, "restrictedServices", js.undefined)
    
    @scala.inline
    def setRestrictedServicesVarargs(value: String*): Self = StObject.set(x, "restrictedServices", js.Array(value :_*))
  }
}
