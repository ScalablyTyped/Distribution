package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodedLogEntry[A]
  extends StObject
     with LogEntry {
  
  var args: A
  
  var event: String
}
object DecodedLogEntry {
  
  inline def apply[A](
    address: String,
    args: A,
    data: String,
    event: String,
    topics: js.Array[String],
    transactionHash: String
  ): DecodedLogEntry[A] = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], blockHash = null, blockNumber = null, logIndex = null, transactionIndex = null)
    __obj.asInstanceOf[DecodedLogEntry[A]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecodedLogEntry[?], A] (val x: Self & DecodedLogEntry[A]) extends AnyVal {
    
    inline def setArgs(value: A): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
