package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEntry extends StObject {
  
  var address: String = js.native
  
  var blockHash: String | Null = js.native
  
  var blockNumber: Double | Null = js.native
  
  var data: String = js.native
  
  var logIndex: Double | Null = js.native
  
  var topics: js.Array[String] = js.native
  
  var transactionHash: String = js.native
  
  var transactionIndex: Double | Null = js.native
}
object LogEntry {
  
  @scala.inline
  def apply(address: String, data: String, topics: js.Array[String], transactionHash: String): LogEntry = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  
  @scala.inline
  implicit class LogEntryMutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockHashNull: Self = StObject.set(x, "blockHash", null)
    
    @scala.inline
    def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNumberNull: Self = StObject.set(x, "blockNumber", null)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogIndex(value: Double): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogIndexNull: Self = StObject.set(x, "logIndex", null)
    
    @scala.inline
    def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
    
    @scala.inline
    def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIndexNull: Self = StObject.set(x, "transactionIndex", null)
  }
}
