package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskResourceStatus extends StObject {
  
  var asyncPrimaryDisk: js.UndefOr[SchemaDiskResourceStatusAsyncReplicationStatus] = js.undefined
  
  /**
    * Key: disk, value: AsyncReplicationStatus message
    */
  var asyncSecondaryDisks: js.UndefOr[StringDictionary[SchemaDiskResourceStatusAsyncReplicationStatus] | Null] = js.undefined
}
object SchemaDiskResourceStatus {
  
  inline def apply(): SchemaDiskResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskResourceStatus]
  }
  
  extension [Self <: SchemaDiskResourceStatus](x: Self) {
    
    inline def setAsyncPrimaryDisk(value: SchemaDiskResourceStatusAsyncReplicationStatus): Self = StObject.set(x, "asyncPrimaryDisk", value.asInstanceOf[js.Any])
    
    inline def setAsyncPrimaryDiskUndefined: Self = StObject.set(x, "asyncPrimaryDisk", js.undefined)
    
    inline def setAsyncSecondaryDisks(value: StringDictionary[SchemaDiskResourceStatusAsyncReplicationStatus]): Self = StObject.set(x, "asyncSecondaryDisks", value.asInstanceOf[js.Any])
    
    inline def setAsyncSecondaryDisksNull: Self = StObject.set(x, "asyncSecondaryDisks", null)
    
    inline def setAsyncSecondaryDisksUndefined: Self = StObject.set(x, "asyncSecondaryDisks", js.undefined)
  }
}
