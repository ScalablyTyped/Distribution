package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisksStartAsyncReplicationRequest extends StObject {
  
  /**
    * The secondary disk to start asynchronous replication to. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
    */
  var asyncSecondaryDisk: js.UndefOr[String | Null] = js.undefined
}
object SchemaDisksStartAsyncReplicationRequest {
  
  inline def apply(): SchemaDisksStartAsyncReplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksStartAsyncReplicationRequest]
  }
  
  extension [Self <: SchemaDisksStartAsyncReplicationRequest](x: Self) {
    
    inline def setAsyncSecondaryDisk(value: String): Self = StObject.set(x, "asyncSecondaryDisk", value.asInstanceOf[js.Any])
    
    inline def setAsyncSecondaryDiskNull: Self = StObject.set(x, "asyncSecondaryDisk", null)
    
    inline def setAsyncSecondaryDiskUndefined: Self = StObject.set(x, "asyncSecondaryDisk", js.undefined)
  }
}
