package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockWithoutTransactionData
  extends StObject
     with AbstractBlock {
  
  var transactions: js.Array[String]
}
object BlockWithoutTransactionData {
  
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
    transactions: js.Array[String],
    transactionsRoot: String,
    uncles: js.Array[String]
  ): BlockWithoutTransactionData = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], transactionsRoot = transactionsRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any], hash = null, logsBloom = null, nonce = null, number = null)
    __obj.asInstanceOf[BlockWithoutTransactionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockWithoutTransactionData] (val x: Self) extends AnyVal {
    
    inline def setTransactions(value: js.Array[String]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: String*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
}
