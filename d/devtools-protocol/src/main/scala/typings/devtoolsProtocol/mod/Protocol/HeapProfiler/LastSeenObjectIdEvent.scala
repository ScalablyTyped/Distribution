package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastSeenObjectIdEvent extends StObject {
  
  var lastSeenObjectId: integer
  
  var timestamp: Double
}
object LastSeenObjectIdEvent {
  
  inline def apply(lastSeenObjectId: integer, timestamp: Double): LastSeenObjectIdEvent = {
    val __obj = js.Dynamic.literal(lastSeenObjectId = lastSeenObjectId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSeenObjectIdEvent]
  }
  
  extension [Self <: LastSeenObjectIdEvent](x: Self) {
    
    inline def setLastSeenObjectId(value: integer): Self = StObject.set(x, "lastSeenObjectId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
