package typings.ethersprojectTransactions

import typings.ethersprojectBignumber.libBignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.SignatureLike
import typings.ethersprojectTransactions.anon.Address
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/transactions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait TransactionTypes extends StObject
  @JSImport("@ethersproject/transactions", "TransactionTypes")
  @js.native
  object TransactionTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransactionTypes & Double] = js.native
    
    @js.native
    sealed trait eip1559
      extends StObject
         with TransactionTypes
    /* 2 */ val eip1559: typings.ethersprojectTransactions.mod.TransactionTypes.eip1559 & Double = js.native
    
    @js.native
    sealed trait eip2930
      extends StObject
         with TransactionTypes
    /* 1 */ val eip2930: typings.ethersprojectTransactions.mod.TransactionTypes.eip2930 & Double = js.native
    
    @js.native
    sealed trait legacy
      extends StObject
         with TransactionTypes
    /* 0 */ val legacy: typings.ethersprojectTransactions.mod.TransactionTypes.legacy & Double = js.native
  }
  
  inline def accessListify(value: AccessListish): AccessList = ^.asInstanceOf[js.Dynamic].applyDynamic("accessListify")(value.asInstanceOf[js.Any]).asInstanceOf[AccessList]
  
  inline def computeAddress(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeAddress(key: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(rawTransaction: BytesLike): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawTransaction.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  inline def recoverAddress(digest: BytesLike, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverAddress")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serialize(transaction: UnsignedTransaction): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(transaction.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(transaction: UnsignedTransaction, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(transaction.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type AccessList = js.Array[Address]
  
  type AccessListish = AccessList | (js.Array[js.Tuple2[String, js.Array[String]]]) | (Record[String, js.Array[String]])
  
  trait Transaction extends StObject {
    
    var accessList: js.UndefOr[AccessList] = js.undefined
    
    var chainId: Double
    
    var data: String
    
    var from: js.UndefOr[String] = js.undefined
    
    var gasLimit: BigNumber
    
    var gasPrice: js.UndefOr[BigNumber] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var maxFeePerGas: js.UndefOr[BigNumber] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[BigNumber] = js.undefined
    
    var nonce: Double
    
    var r: js.UndefOr[String] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[Double | Null] = js.undefined
    
    var v: js.UndefOr[Double] = js.undefined
    
    var value: BigNumber
  }
  object Transaction {
    
    inline def apply(chainId: Double, data: String, gasLimit: BigNumber, nonce: Double, value: BigNumber): Transaction = {
      val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    extension [Self <: Transaction](x: Self) {
      
      inline def setAccessList(value: AccessList): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: Address*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGasLimit(value: BigNumber): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: BigNumber): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setMaxFeePerGas(value: BigNumber): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: BigNumber): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setValue(value: BigNumber): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsignedTransaction extends StObject {
    
    var accessList: js.UndefOr[AccessListish] = js.undefined
    
    var chainId: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[BytesLike] = js.undefined
    
    var gasLimit: js.UndefOr[BigNumberish] = js.undefined
    
    var gasPrice: js.UndefOr[BigNumberish] = js.undefined
    
    var maxFeePerGas: js.UndefOr[BigNumberish] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[BigNumberish] = js.undefined
    
    var nonce: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[Double | Null] = js.undefined
    
    var value: js.UndefOr[BigNumberish] = js.undefined
  }
  object UnsignedTransaction {
    
    inline def apply(): UnsignedTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnsignedTransaction]
    }
    
    extension [Self <: UnsignedTransaction](x: Self) {
      
      inline def setAccessList(value: AccessListish): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: (Address | (js.Tuple2[String, js.Array[String]]))*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setData(value: BytesLike): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGasLimit(value: BigNumberish): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: BigNumberish): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setMaxFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
