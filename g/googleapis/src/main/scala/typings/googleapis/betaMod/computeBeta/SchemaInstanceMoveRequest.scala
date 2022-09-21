package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceMoveRequest extends StObject {
  
  /**
    * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
    */
  var destinationZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
    */
  var targetInstance: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceMoveRequest {
  
  inline def apply(): SchemaInstanceMoveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceMoveRequest]
  }
  
  extension [Self <: SchemaInstanceMoveRequest](x: Self) {
    
    inline def setDestinationZone(value: String): Self = StObject.set(x, "destinationZone", value.asInstanceOf[js.Any])
    
    inline def setDestinationZoneNull: Self = StObject.set(x, "destinationZone", null)
    
    inline def setDestinationZoneUndefined: Self = StObject.set(x, "destinationZone", js.undefined)
    
    inline def setTargetInstance(value: String): Self = StObject.set(x, "targetInstance", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceNull: Self = StObject.set(x, "targetInstance", null)
    
    inline def setTargetInstanceUndefined: Self = StObject.set(x, "targetInstance", js.undefined)
  }
}
