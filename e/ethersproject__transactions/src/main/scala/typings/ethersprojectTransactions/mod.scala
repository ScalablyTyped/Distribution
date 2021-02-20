package typings.ethersprojectTransactions

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.SignatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/transactions", "computeAddress")
  @js.native
  def computeAddress(key: String): String = js.native
  @JSImport("@ethersproject/transactions", "computeAddress")
  @js.native
  def computeAddress(key: BytesLike): String = js.native
  
  @JSImport("@ethersproject/transactions", "parse")
  @js.native
  def parse(rawTransaction: BytesLike): Transaction = js.native
  
  @JSImport("@ethersproject/transactions", "recoverAddress")
  @js.native
  def recoverAddress(digest: BytesLike, signature: SignatureLike): String = js.native
  
  @JSImport("@ethersproject/transactions", "serialize")
  @js.native
  def serialize(transaction: UnsignedTransaction): String = js.native
  @JSImport("@ethersproject/transactions", "serialize")
  @js.native
  def serialize(transaction: UnsignedTransaction, signature: SignatureLike): String = js.native
  
  @js.native
  trait Transaction extends StObject {
    
    var chainId: Double = js.native
    
    var data: String = js.native
    
    var from: js.UndefOr[String] = js.native
    
    var gasLimit: BigNumber = js.native
    
    var gasPrice: BigNumber = js.native
    
    var hash: js.UndefOr[String] = js.native
    
    var nonce: Double = js.native
    
    var r: js.UndefOr[String] = js.native
    
    var s: js.UndefOr[String] = js.native
    
    var to: js.UndefOr[String] = js.native
    
    var v: js.UndefOr[Double] = js.native
    
    var value: BigNumber = js.native
  }
  object Transaction {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGasLimit(value: BigNumber): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPrice(value: BigNumber): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      @scala.inline
      def setValue(value: BigNumber): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnsignedTransaction extends StObject {
    
    var chainId: js.UndefOr[Double] = js.native
    
    var data: js.UndefOr[BytesLike] = js.native
    
    var gasLimit: js.UndefOr[BigNumberish] = js.native
    
    var gasPrice: js.UndefOr[BigNumberish] = js.native
    
    var nonce: js.UndefOr[Double] = js.native
    
    var to: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[BigNumberish] = js.native
  }
  object UnsignedTransaction {
    
    @scala.inline
    def apply(): UnsignedTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnsignedTransaction]
    }
    
    @scala.inline
    implicit class UnsignedTransactionMutableBuilder[Self <: UnsignedTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      @scala.inline
      def setData(value: BytesLike): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setGasLimit(value: BigNumberish): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      @scala.inline
      def setGasPrice(value: BigNumberish): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
