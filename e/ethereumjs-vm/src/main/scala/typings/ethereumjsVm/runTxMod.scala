package typings.ethereumjsVm

import typings.bnJs.mod.^
import typings.ethereumjsTx.mod.Transaction
import typings.ethereumjsVm.bloomMod.default
import typings.ethereumjsVm.evmMod.EVMResult
import typings.ethereumjsVm.evmMod.ExecResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runTxMod {
  
  @JSImport("ethereumjs-vm/dist/runTx", JSImport.Default)
  @js.native
  def default(opts: RunTxOpts): js.Promise[RunTxResult] = js.native
  
  @js.native
  trait RunTxOpts extends StObject {
    
    /**
      * The block to which the `tx` belongs
      */
    var block: js.UndefOr[js.Any] = js.native
    
    /**
      * If true, skips the balance check
      */
    var skipBalance: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, skips the nonce check
      */
    var skipNonce: js.UndefOr[Boolean] = js.native
    
    /**
      * A [`Transaction`](https://github.com/ethereum/ethereumjs-tx) to run
      */
    var tx: Transaction = js.native
  }
  object RunTxOpts {
    
    @scala.inline
    def apply(tx: Transaction): RunTxOpts = {
      val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunTxOpts]
    }
    
    @scala.inline
    implicit class RunTxOptsMutableBuilder[Self <: RunTxOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: js.Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setSkipBalance(value: Boolean): Self = StObject.set(x, "skipBalance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipBalanceUndefined: Self = StObject.set(x, "skipBalance", js.undefined)
      
      @scala.inline
      def setSkipNonce(value: Boolean): Self = StObject.set(x, "skipNonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipNonceUndefined: Self = StObject.set(x, "skipNonce", js.undefined)
      
      @scala.inline
      def setTx(value: Transaction): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunTxResult extends EVMResult {
    
    /**
      * The amount of ether used by this transaction
      */
    var amountSpent: ^ = js.native
    
    /**
      * Bloom filter resulted from transaction
      */
    var bloom: default = js.native
    
    /**
      * The amount of gas as that was refunded during the transaction (i.e. `gasUsed = totalGasConsumed - gasRefund`)
      */
    var gasRefund: js.UndefOr[^] = js.native
  }
  object RunTxResult {
    
    @scala.inline
    def apply(amountSpent: ^, bloom: default, execResult: ExecResult, gasUsed: ^): RunTxResult = {
      val __obj = js.Dynamic.literal(amountSpent = amountSpent.asInstanceOf[js.Any], bloom = bloom.asInstanceOf[js.Any], execResult = execResult.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunTxResult]
    }
    
    @scala.inline
    implicit class RunTxResultMutableBuilder[Self <: RunTxResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmountSpent(value: ^): Self = StObject.set(x, "amountSpent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBloom(value: default): Self = StObject.set(x, "bloom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasRefund(value: ^): Self = StObject.set(x, "gasRefund", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasRefundUndefined: Self = StObject.set(x, "gasRefund", js.undefined)
    }
  }
}
