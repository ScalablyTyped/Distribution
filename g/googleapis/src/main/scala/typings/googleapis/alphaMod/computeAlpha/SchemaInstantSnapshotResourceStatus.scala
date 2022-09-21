package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstantSnapshotResourceStatus extends StObject {
  
  /**
    * [Output Only] The storage size of this instant snapshot.
    */
  var storageSizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstantSnapshotResourceStatus {
  
  inline def apply(): SchemaInstantSnapshotResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstantSnapshotResourceStatus]
  }
  
  extension [Self <: SchemaInstantSnapshotResourceStatus](x: Self) {
    
    inline def setStorageSizeBytes(value: String): Self = StObject.set(x, "storageSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageSizeBytesNull: Self = StObject.set(x, "storageSizeBytes", null)
    
    inline def setStorageSizeBytesUndefined: Self = StObject.set(x, "storageSizeBytes", js.undefined)
  }
}
