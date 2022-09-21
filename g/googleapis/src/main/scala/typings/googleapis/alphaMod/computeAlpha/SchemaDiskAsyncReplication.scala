package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskAsyncReplication extends StObject {
  
  /**
    * The other disk asynchronously replicated to or from the current disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
    */
  var disk: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique ID of the other disk asynchronously replicated to or from the current disk. This value identifies the exact disk that was used to create this replication. For example, if you started replicating the persistent disk from a disk that was later deleted and recreated under the same name, the disk ID would identify the exact version of the disk that was used.
    */
  var diskId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiskAsyncReplication {
  
  inline def apply(): SchemaDiskAsyncReplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskAsyncReplication]
  }
  
  extension [Self <: SchemaDiskAsyncReplication](x: Self) {
    
    inline def setDisk(value: String): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskId(value: String): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
    
    inline def setDiskIdNull: Self = StObject.set(x, "diskId", null)
    
    inline def setDiskIdUndefined: Self = StObject.set(x, "diskId", js.undefined)
    
    inline def setDiskNull: Self = StObject.set(x, "disk", null)
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
  }
}
