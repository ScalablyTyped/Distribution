package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `ServicePerimeter` describes a set of GCP resources which can freely import
  * and export data amongst themselves, but not export outside of the
  * `ServicePerimeter`. If a request with a source within this
  * `ServicePerimeter` has a target outside of the `ServicePerimeter`, the
  * request will be blocked. Otherwise the request is allowed. There are two
  * types of Service Perimeter - Regular and Bridge. Regular Service Perimeters
  * cannot overlap, a single GCP project can only belong to a single regular
  * Service Perimeter. Service Perimeter Bridges can contain only GCP projects
  * as members, a single GCP project may belong to multiple Service Perimeter
  * Bridges.
  */
trait SchemaServicePerimeter extends StObject {
  
  /**
    * Output only. Time the `ServicePerimeter` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the `ServicePerimeter` and its use. Does not affect
    * behavior.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name for the ServicePerimeter.  The `short_name`
    * component must begin with a letter and only include alphanumeric and
    * &#39;_&#39;. Format:
    * `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Perimeter type indicator. A single project is allowed to be a member of
    * single regular perimeter, but multiple service perimeter bridges. A
    * project cannot be a included in a perimeter bridge without being included
    * in regular perimeter. For perimeter bridges, the restricted service list
    * as well as access level lists must be empty.
    */
  var perimeterType: js.UndefOr[String] = js.undefined
  
  /**
    * Current ServicePerimeter configuration. Specifies sets of resources,
    * restricted services and access levels that determine perimeter content
    * and boundaries.
    */
  var status: js.UndefOr[SchemaServicePerimeterConfig] = js.undefined
  
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time the `ServicePerimeter` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaServicePerimeter {
  
  inline def apply(): SchemaServicePerimeter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServicePerimeter]
  }
  
  extension [Self <: SchemaServicePerimeter](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPerimeterType(value: String): Self = StObject.set(x, "perimeterType", value.asInstanceOf[js.Any])
    
    inline def setPerimeterTypeUndefined: Self = StObject.set(x, "perimeterType", js.undefined)
    
    inline def setStatus(value: SchemaServicePerimeterConfig): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
