package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodedLogEntryEvent[A] extends DecodedLogEntry[A] {
  
  var removed: Boolean = js.native
}
object DecodedLogEntryEvent {
  
  @scala.inline
  def apply[A](
    address: String,
    args: A,
    data: String,
    event: String,
    removed: Boolean,
    topics: js.Array[String],
    transactionHash: String
  ): DecodedLogEntryEvent[A] = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedLogEntryEvent[A]]
  }
  
  @scala.inline
  implicit class DecodedLogEntryEventMutableBuilder[Self <: DecodedLogEntryEvent[_], A] (val x: Self with DecodedLogEntryEvent[A]) extends AnyVal {
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
