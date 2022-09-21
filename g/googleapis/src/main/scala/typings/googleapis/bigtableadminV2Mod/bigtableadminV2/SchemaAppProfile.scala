package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppProfile extends StObject {
  
  /**
    * Long form description of the use case for this AppProfile.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Strongly validated etag for optimistic concurrency control. Preserve the value returned from `GetAppProfile` when calling `UpdateAppProfile` to fail the request if there has been a modification in the mean time. The `update_mask` of the request need not include `etag` for this protection to apply. See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more details.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use a multi-cluster routing policy.
    */
  var multiClusterRoutingUseAny: js.UndefOr[SchemaMultiClusterRoutingUseAny] = js.undefined
  
  /**
    * The unique name of the app profile. Values are of the form `projects/{project\}/instances/{instance\}/appProfiles/_a-zA-Z0-9*`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use a single-cluster routing policy.
    */
  var singleClusterRouting: js.UndefOr[SchemaSingleClusterRouting] = js.undefined
}
object SchemaAppProfile {
  
  inline def apply(): SchemaAppProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppProfile]
  }
  
  extension [Self <: SchemaAppProfile](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setMultiClusterRoutingUseAny(value: SchemaMultiClusterRoutingUseAny): Self = StObject.set(x, "multiClusterRoutingUseAny", value.asInstanceOf[js.Any])
    
    inline def setMultiClusterRoutingUseAnyUndefined: Self = StObject.set(x, "multiClusterRoutingUseAny", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSingleClusterRouting(value: SchemaSingleClusterRouting): Self = StObject.set(x, "singleClusterRouting", value.asInstanceOf[js.Any])
    
    inline def setSingleClusterRoutingUndefined: Self = StObject.set(x, "singleClusterRouting", js.undefined)
  }
}
