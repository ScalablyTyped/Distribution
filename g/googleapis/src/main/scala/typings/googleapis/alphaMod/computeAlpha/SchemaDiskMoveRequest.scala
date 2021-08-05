package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskMoveRequest extends StObject {
  
  /**
    * The URL of the destination zone to move the disk. This can be a full or
    * partial URL. For example, the following are all valid URLs to a zone:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone  -
    * projects/project/zones/zone  - zones/zone
    */
  var destinationZone: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the target disk to move. This can be a full or partial URL.
    * For example, the following are all valid URLs to a disk:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
    * - projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
    */
  var targetDisk: js.UndefOr[String] = js.undefined
}
object SchemaDiskMoveRequest {
  
  inline def apply(): SchemaDiskMoveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskMoveRequest]
  }
  
  extension [Self <: SchemaDiskMoveRequest](x: Self) {
    
    inline def setDestinationZone(value: String): Self = StObject.set(x, "destinationZone", value.asInstanceOf[js.Any])
    
    inline def setDestinationZoneUndefined: Self = StObject.set(x, "destinationZone", js.undefined)
    
    inline def setTargetDisk(value: String): Self = StObject.set(x, "targetDisk", value.asInstanceOf[js.Any])
    
    inline def setTargetDiskUndefined: Self = StObject.set(x, "targetDisk", js.undefined)
  }
}
