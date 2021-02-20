package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodedLogEntry[A] extends LogEntry {
  
  var args: A = js.native
  
  var event: String = js.native
}
object DecodedLogEntry {
  
  @scala.inline
  def apply[A](
    address: String,
    args: A,
    data: String,
    event: String,
    topics: js.Array[String],
    transactionHash: String
  ): DecodedLogEntry[A] = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedLogEntry[A]]
  }
  
  @scala.inline
  implicit class DecodedLogEntryMutableBuilder[Self <: DecodedLogEntry[_], A] (val x: Self with DecodedLogEntry[A]) extends AnyVal {
    
    @scala.inline
    def setArgs(value: A): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
