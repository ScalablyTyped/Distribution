package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskAsyncReplicationList extends StObject {
  
  var asyncReplicationDisk: js.UndefOr[SchemaDiskAsyncReplication] = js.undefined
}
object SchemaDiskAsyncReplicationList {
  
  inline def apply(): SchemaDiskAsyncReplicationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskAsyncReplicationList]
  }
  
  extension [Self <: SchemaDiskAsyncReplicationList](x: Self) {
    
    inline def setAsyncReplicationDisk(value: SchemaDiskAsyncReplication): Self = StObject.set(x, "asyncReplicationDisk", value.asInstanceOf[js.Any])
    
    inline def setAsyncReplicationDiskUndefined: Self = StObject.set(x, "asyncReplicationDisk", js.undefined)
  }
}
