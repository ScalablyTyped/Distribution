package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEntryEvent extends LogEntry {
  
  var removed: Boolean = js.native
}
object LogEntryEvent {
  
  @scala.inline
  def apply(address: String, data: String, removed: Boolean, topics: js.Array[String], transactionHash: String): LogEntryEvent = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntryEvent]
  }
  
  @scala.inline
  implicit class LogEntryEventMutableBuilder[Self <: LogEntryEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
