package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeType extends StObject {
  
  /**
    * [Output Only] The CPU platform used by this node type.
    */
  var cpuPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The deprecation status associated with this node type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.undefined
  
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The number of virtual CPUs that are available to the node type.
    */
  var guestCpus: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The type of the resource. Always compute#nodeType for node types.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Local SSD available to the node type, defined in GB.
    */
  var localSsdGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The amount of physical memory available to the node type, defined in MB.
    */
  var memoryMb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The name of the zone where the node type resides, such as us-central1-a.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeType {
  
  inline def apply(): SchemaNodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeType]
  }
  
  extension [Self <: SchemaNodeType](x: Self) {
    
    inline def setCpuPlatform(value: String): Self = StObject.set(x, "cpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setCpuPlatformNull: Self = StObject.set(x, "cpuPlatform", null)
    
    inline def setCpuPlatformUndefined: Self = StObject.set(x, "cpuPlatform", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeprecated(value: SchemaDeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGuestCpus(value: Double): Self = StObject.set(x, "guestCpus", value.asInstanceOf[js.Any])
    
    inline def setGuestCpusNull: Self = StObject.set(x, "guestCpus", null)
    
    inline def setGuestCpusUndefined: Self = StObject.set(x, "guestCpus", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalSsdGb(value: Double): Self = StObject.set(x, "localSsdGb", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdGbNull: Self = StObject.set(x, "localSsdGb", null)
    
    inline def setLocalSsdGbUndefined: Self = StObject.set(x, "localSsdGb", js.undefined)
    
    inline def setMemoryMb(value: Double): Self = StObject.set(x, "memoryMb", value.asInstanceOf[js.Any])
    
    inline def setMemoryMbNull: Self = StObject.set(x, "memoryMb", null)
    
    inline def setMemoryMbUndefined: Self = StObject.set(x, "memoryMb", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
