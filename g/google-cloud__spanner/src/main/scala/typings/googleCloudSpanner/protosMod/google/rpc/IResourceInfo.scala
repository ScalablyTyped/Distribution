package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ResourceInfo. */
trait IResourceInfo extends StObject {
  
  /** ResourceInfo description */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /** ResourceInfo owner */
  var owner: js.UndefOr[String | Null] = js.undefined
  
  /** ResourceInfo resourceName */
  var resourceName: js.UndefOr[String | Null] = js.undefined
  
  /** ResourceInfo resourceType */
  var resourceType: js.UndefOr[String | Null] = js.undefined
}
object IResourceInfo {
  
  inline def apply(): IResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceInfo]
  }
  
  extension [Self <: IResourceInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
