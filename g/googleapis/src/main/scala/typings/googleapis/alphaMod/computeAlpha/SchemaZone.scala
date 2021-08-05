package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Zone resource. (== resource_for beta.zones ==) (== resource_for v1.zones
  * ==)
  */
trait SchemaZone extends StObject {
  
  /**
    * [Output Only] Available cpu/platform selections for the zone.
    */
  var availableCpuPlatforms: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The deprecation status associated with this zone.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.undefined
  
  /**
    * [Output Only] Textual description of the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#zone for zones.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Full URL reference to the region which hosts the zone.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Status of the zone, either UP or DOWN.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaZone {
  
  inline def apply(): SchemaZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZone]
  }
  
  extension [Self <: SchemaZone](x: Self) {
    
    inline def setAvailableCpuPlatforms(value: js.Array[String]): Self = StObject.set(x, "availableCpuPlatforms", value.asInstanceOf[js.Any])
    
    inline def setAvailableCpuPlatformsUndefined: Self = StObject.set(x, "availableCpuPlatforms", js.undefined)
    
    inline def setAvailableCpuPlatformsVarargs(value: String*): Self = StObject.set(x, "availableCpuPlatforms", js.Array(value :_*))
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeprecated(value: SchemaDeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
