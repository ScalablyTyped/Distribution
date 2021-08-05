package typings.ethereumjsTx

import typings.ethereumjsCommon.mod.default
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type BufferLike = Buffer | TransformableToBuffer | PrefixedHexString | Double
  
  trait FakeTxData
    extends StObject
       with TxData {
    
    /**
      * The sender of the Tx.
      */
    var from: js.UndefOr[BufferLike] = js.undefined
  }
  object FakeTxData {
    
    inline def apply(): FakeTxData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FakeTxData]
    }
    
    extension [Self <: FakeTxData](x: Self) {
      
      inline def setFrom(value: BufferLike): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  type PrefixedHexString = String
  
  trait TransactionOptions extends StObject {
    
    /**
      * The chain of the transaction, default: 'mainnet'
      */
    var chain: js.UndefOr[Double | String] = js.undefined
    
    /**
      * A Common object defining the chain and the hardfork a transaction belongs to.
      */
    var common: js.UndefOr[default] = js.undefined
    
    /**
      * The hardfork of the transaction, default: 'petersburg'
      */
    var hardfork: js.UndefOr[String] = js.undefined
  }
  object TransactionOptions {
    
    inline def apply(): TransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionOptions]
    }
    
    extension [Self <: TransactionOptions](x: Self) {
      
      inline def setChain(value: Double | String): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
      
      inline def setCommon(value: default): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      inline def setHardfork(value: String): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
      
      inline def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
    }
  }
  
  trait TransformableToBuffer extends StObject {
    
    def toBuffer(): Buffer
  }
  object TransformableToBuffer {
    
    inline def apply(toBuffer: () => Buffer): TransformableToBuffer = {
      val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[TransformableToBuffer]
    }
    
    extension [Self <: TransformableToBuffer](x: Self) {
      
      inline def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    }
  }
  
  trait TxData extends StObject {
    
    /**
      * This will contain the data of the message or the init of a contract
      */
    var data: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * The transaction's gas limit.
      */
    var gasLimit: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * The transaction's gas price.
      */
    var gasPrice: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * The transaction's nonce.
      */
    var nonce: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * EC signature parameter.
      */
    var r: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * EC signature parameter.
      */
    var s: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * The transaction's the address is sent to.
      */
    var to: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * EC recovery ID.
      */
    var v: js.UndefOr[BufferLike] = js.undefined
    
    /**
      * The amount of Ether sent.
      */
    var value: js.UndefOr[BufferLike] = js.undefined
  }
  object TxData {
    
    inline def apply(): TxData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TxData]
    }
    
    extension [Self <: TxData](x: Self) {
      
      inline def setData(value: BufferLike): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGasLimit(value: BufferLike): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: BufferLike): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setNonce(value: BufferLike): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setR(value: BufferLike): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setS(value: BufferLike): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setTo(value: BufferLike): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setV(value: BufferLike): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      inline def setValue(value: BufferLike): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
