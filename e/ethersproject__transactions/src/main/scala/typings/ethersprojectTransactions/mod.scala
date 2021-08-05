package typings.ethersprojectTransactions

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.SignatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/transactions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeAddress(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeAddress(key: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(rawTransaction: BytesLike): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawTransaction.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  inline def recoverAddress(digest: BytesLike, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverAddress")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serialize(transaction: UnsignedTransaction): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(transaction.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(transaction: UnsignedTransaction, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(transaction.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Transaction extends StObject {
    
    var chainId: Double
    
    var data: String
    
    var from: js.UndefOr[String] = js.undefined
    
    var gasLimit: BigNumber
    
    var gasPrice: BigNumber
    
    var hash: js.UndefOr[String] = js.undefined
    
    var nonce: Double
    
    var r: js.UndefOr[String] = js.undefined
    
    var s: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var v: js.UndefOr[Double] = js.undefined
    
    var value: BigNumber
  }
  object Transaction {
    
    inline def apply(
      chainId: Double,
      data: String,
      gasLimit: BigNumber,
      gasPrice: BigNumber,
      nonce: Double,
      value: BigNumber
    ): Transaction = {
      val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    extension [Self <: Transaction](x: Self) {
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGasLimit(value: BigNumber): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: BigNumber): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setValue(value: BigNumber): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsignedTransaction extends StObject {
    
    var chainId: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[BytesLike] = js.undefined
    
    var gasLimit: js.UndefOr[BigNumberish] = js.undefined
    
    var gasPrice: js.UndefOr[BigNumberish] = js.undefined
    
    var nonce: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[BigNumberish] = js.undefined
  }
  object UnsignedTransaction {
    
    inline def apply(): UnsignedTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnsignedTransaction]
    }
    
    extension [Self <: UnsignedTransaction](x: Self) {
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setData(value: BytesLike): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGasLimit(value: BigNumberish): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: BigNumberish): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
