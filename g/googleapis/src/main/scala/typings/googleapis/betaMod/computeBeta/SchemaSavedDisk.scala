package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedDisk extends StObject {
  
  /**
    * [Output Only] The architecture of the attached disk.
    */
  var architecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#savedDisk for attached disks.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies a URL of the disk attached to the source instance.
    */
  var sourceDisk: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Size of the individual disk snapshot used by this machine image.
    */
  var storageBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
    */
  var storageBytesStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaSavedDisk {
  
  inline def apply(): SchemaSavedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedDisk]
  }
  
  extension [Self <: SchemaSavedDisk](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureNull: Self = StObject.set(x, "architecture", null)
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSourceDisk(value: String): Self = StObject.set(x, "sourceDisk", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskNull: Self = StObject.set(x, "sourceDisk", null)
    
    inline def setSourceDiskUndefined: Self = StObject.set(x, "sourceDisk", js.undefined)
    
    inline def setStorageBytes(value: String): Self = StObject.set(x, "storageBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesNull: Self = StObject.set(x, "storageBytes", null)
    
    inline def setStorageBytesStatus(value: String): Self = StObject.set(x, "storageBytesStatus", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesStatusNull: Self = StObject.set(x, "storageBytesStatus", null)
    
    inline def setStorageBytesStatusUndefined: Self = StObject.set(x, "storageBytesStatus", js.undefined)
    
    inline def setStorageBytesUndefined: Self = StObject.set(x, "storageBytes", js.undefined)
  }
}
