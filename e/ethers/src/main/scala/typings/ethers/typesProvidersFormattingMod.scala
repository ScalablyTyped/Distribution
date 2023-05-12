package typings.ethers

import typings.ethers.typesCryptoMod.Signature
import typings.ethers.typesTransactionMod.AccessList
import typings.ethers.typesTransactionMod.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersFormattingMod {
  
  trait BlockParams extends StObject {
    
    var baseFeePerGas: Null | js.BigInt
    
    var difficulty: js.BigInt
    
    var extraData: String
    
    var gasLimit: js.BigInt
    
    var gasUsed: js.BigInt
    
    var hash: js.UndefOr[Null | String] = js.undefined
    
    var miner: String
    
    var nonce: String
    
    var number: Double
    
    var parentHash: String
    
    var timestamp: Double
    
    var transactions: js.Array[String | TransactionResponseParams]
  }
  object BlockParams {
    
    inline def apply(
      difficulty: js.BigInt,
      extraData: String,
      gasLimit: js.BigInt,
      gasUsed: js.BigInt,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      timestamp: Double,
      transactions: js.Array[String | TransactionResponseParams]
    ): BlockParams = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], baseFeePerGas = null)
      __obj.asInstanceOf[BlockParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockParams] (val x: Self) extends AnyVal {
      
      inline def setBaseFeePerGas(value: js.BigInt): Self = StObject.set(x, "baseFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setBaseFeePerGasNull: Self = StObject.set(x, "baseFeePerGas", null)
      
      inline def setDifficulty(value: js.BigInt): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
      
      inline def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setGasLimit(value: js.BigInt): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasUsed(value: js.BigInt): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setMiner(value: String): Self = StObject.set(x, "miner", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setParentHash(value: String): Self = StObject.set(x, "parentHash", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTransactions(value: js.Array[String | TransactionResponseParams]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: (String | TransactionResponseParams)*): Self = StObject.set(x, "transactions", js.Array(value*))
    }
  }
  
  trait LogParams extends StObject {
    
    var address: String
    
    var blockHash: String
    
    var blockNumber: Double
    
    var data: String
    
    var index: Double
    
    var removed: Boolean
    
    var topics: js.Array[String]
    
    var transactionHash: String
    
    var transactionIndex: Double
  }
  object LogParams {
    
    inline def apply(
      address: String,
      blockHash: String,
      blockNumber: Double,
      data: String,
      index: Double,
      removed: Boolean,
      topics: js.Array[String],
      transactionHash: String,
      transactionIndex: Double
    ): LogParams = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogParams] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
      
      inline def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
      
      inline def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransactionReceiptParams extends StObject {
    
    var blockHash: String
    
    var blockNumber: Double
    
    var contractAddress: Null | String
    
    var cumulativeGasUsed: js.BigInt
    
    var effectiveGasPrice: js.UndefOr[Null | js.BigInt] = js.undefined
    
    var from: String
    
    var gasPrice: js.UndefOr[Null | js.BigInt] = js.undefined
    
    var gasUsed: js.BigInt
    
    var hash: String
    
    var index: Double
    
    var logs: js.Array[LogParams]
    
    var logsBloom: String
    
    var root: Null | String
    
    var status: Null | Double
    
    var to: Null | String
    
    var `type`: Double
  }
  object TransactionReceiptParams {
    
    inline def apply(
      blockHash: String,
      blockNumber: Double,
      cumulativeGasUsed: js.BigInt,
      from: String,
      gasUsed: js.BigInt,
      hash: String,
      index: Double,
      logs: js.Array[LogParams],
      logsBloom: String,
      `type`: Double
    ): TransactionReceiptParams = {
      val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], contractAddress = null, root = null, status = null, to = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionReceiptParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionReceiptParams] (val x: Self) extends AnyVal {
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setContractAddress(value: String): Self = StObject.set(x, "contractAddress", value.asInstanceOf[js.Any])
      
      inline def setContractAddressNull: Self = StObject.set(x, "contractAddress", null)
      
      inline def setCumulativeGasUsed(value: js.BigInt): Self = StObject.set(x, "cumulativeGasUsed", value.asInstanceOf[js.Any])
      
      inline def setEffectiveGasPrice(value: js.BigInt): Self = StObject.set(x, "effectiveGasPrice", value.asInstanceOf[js.Any])
      
      inline def setEffectiveGasPriceNull: Self = StObject.set(x, "effectiveGasPrice", null)
      
      inline def setEffectiveGasPriceUndefined: Self = StObject.set(x, "effectiveGasPrice", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: js.BigInt): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceNull: Self = StObject.set(x, "gasPrice", null)
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setGasUsed(value: js.BigInt): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLogs(value: js.Array[LogParams]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsBloom(value: String): Self = StObject.set(x, "logsBloom", value.asInstanceOf[js.Any])
      
      inline def setLogsVarargs(value: LogParams*): Self = StObject.set(x, "logs", js.Array(value*))
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToNull: Self = StObject.set(x, "to", null)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransactionResponseParams extends StObject {
    
    var accessList: Null | AccessList
    
    var blockHash: Null | String
    
    var blockNumber: Null | Double
    
    var chainId: js.BigInt
    
    var data: String
    
    var from: String
    
    var gasLimit: js.BigInt
    
    var gasPrice: js.BigInt
    
    var hash: String
    
    var index: Double
    
    var maxFeePerGas: Null | js.BigInt
    
    var maxPriorityFeePerGas: Null | js.BigInt
    
    var nonce: Double
    
    var signature: Signature
    
    var to: Null | String
    
    var `type`: Double
    
    var value: js.BigInt
  }
  object TransactionResponseParams {
    
    inline def apply(
      chainId: js.BigInt,
      data: String,
      from: String,
      gasLimit: js.BigInt,
      gasPrice: js.BigInt,
      hash: String,
      index: Double,
      nonce: Double,
      signature: Signature,
      `type`: Double,
      value: js.BigInt
    ): TransactionResponseParams = {
      val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], accessList = null, blockHash = null, blockNumber = null, maxFeePerGas = null, maxPriorityFeePerGas = null, to = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionResponseParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionResponseParams] (val x: Self) extends AnyVal {
      
      inline def setAccessList(value: AccessList): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListNull: Self = StObject.set(x, "accessList", null)
      
      inline def setAccessListVarargs(value: AccessListEntry*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockHashNull: Self = StObject.set(x, "blockHash", null)
      
      inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setBlockNumberNull: Self = StObject.set(x, "blockNumber", null)
      
      inline def setChainId(value: js.BigInt): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setGasLimit(value: js.BigInt): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: js.BigInt): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGas(value: js.BigInt): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasNull: Self = StObject.set(x, "maxFeePerGas", null)
      
      inline def setMaxPriorityFeePerGas(value: js.BigInt): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasNull: Self = StObject.set(x, "maxPriorityFeePerGas", null)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToNull: Self = StObject.set(x, "to", null)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
