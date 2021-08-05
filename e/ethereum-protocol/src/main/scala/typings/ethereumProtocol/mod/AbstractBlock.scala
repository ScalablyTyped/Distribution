package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractBlock extends StObject {
  
  var difficulty: default
  
  var extraData: String
  
  var gasLimit: Double
  
  var gasUsed: Double
  
  var hash: String | Null
  
  var logsBloom: String | Null
  
  var miner: String
  
  var nonce: String | Null
  
  var number: Double | Null
  
  var parentHash: String
  
  var sha3Uncles: String
  
  var size: Double
  
  var stateRoot: String
  
  var timestamp: Double
  
  var totalDifficulty: default
  
  var transactionsRoot: String
  
  var uncles: js.Array[String]
}
object AbstractBlock {
  
  inline def apply(
    difficulty: default,
    extraData: String,
    gasLimit: Double,
    gasUsed: Double,
    miner: String,
    parentHash: String,
    sha3Uncles: String,
    size: Double,
    stateRoot: String,
    timestamp: Double,
    totalDifficulty: default,
    transactionsRoot: String,
    uncles: js.Array[String]
  ): AbstractBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionsRoot = transactionsRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any], hash = null, logsBloom = null, nonce = null, number = null)
    __obj.asInstanceOf[AbstractBlock]
  }
  
  extension [Self <: AbstractBlock](x: Self) {
    
    inline def setDifficulty(value: default): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
    
    inline def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setGasLimit(value: Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
    
    inline def setGasUsed(value: Double): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashNull: Self = StObject.set(x, "hash", null)
    
    inline def setLogsBloom(value: String): Self = StObject.set(x, "logsBloom", value.asInstanceOf[js.Any])
    
    inline def setLogsBloomNull: Self = StObject.set(x, "logsBloom", null)
    
    inline def setMiner(value: String): Self = StObject.set(x, "miner", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setParentHash(value: String): Self = StObject.set(x, "parentHash", value.asInstanceOf[js.Any])
    
    inline def setSha3Uncles(value: String): Self = StObject.set(x, "sha3Uncles", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTotalDifficulty(value: default): Self = StObject.set(x, "totalDifficulty", value.asInstanceOf[js.Any])
    
    inline def setTransactionsRoot(value: String): Self = StObject.set(x, "transactionsRoot", value.asInstanceOf[js.Any])
    
    inline def setUncles(value: js.Array[String]): Self = StObject.set(x, "uncles", value.asInstanceOf[js.Any])
    
    inline def setUnclesVarargs(value: String*): Self = StObject.set(x, "uncles", js.Array(value :_*))
  }
}
