package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawLogEntry extends StObject {
  
  var address: String
  
  var blockHash: String | Null
  
  var blockNumber: String | Null
  
  var data: String
  
  var logIndex: String | Null
  
  var topics: js.Array[String]
  
  var transactionHash: String
  
  var transactionIndex: String | Null
}
object RawLogEntry {
  
  inline def apply(address: String, data: String, topics: js.Array[String], transactionHash: String): RawLogEntry = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], blockHash = null, blockNumber = null, logIndex = null, transactionIndex = null)
    __obj.asInstanceOf[RawLogEntry]
  }
  
  extension [Self <: RawLogEntry](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockHashNull: Self = StObject.set(x, "blockHash", null)
    
    inline def setBlockNumber(value: String): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
    
    inline def setBlockNumberNull: Self = StObject.set(x, "blockNumber", null)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLogIndex(value: String): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
    
    inline def setLogIndexNull: Self = StObject.set(x, "logIndex", null)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
    
    inline def setTransactionIndex(value: String): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    
    inline def setTransactionIndexNull: Self = StObject.set(x, "transactionIndex", null)
  }
}
