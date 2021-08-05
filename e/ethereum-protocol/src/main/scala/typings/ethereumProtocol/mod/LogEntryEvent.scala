package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEntryEvent
  extends StObject
     with LogEntry {
  
  var removed: Boolean
}
object LogEntryEvent {
  
  inline def apply(address: String, data: String, removed: Boolean, topics: js.Array[String], transactionHash: String): LogEntryEvent = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], blockHash = null, blockNumber = null, logIndex = null, transactionIndex = null)
    __obj.asInstanceOf[LogEntryEvent]
  }
  
  extension [Self <: LogEntryEvent](x: Self) {
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
