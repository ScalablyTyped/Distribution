package typings.ethereumjsVm

import typings.ethereumjsTx.mod.Transaction
import typings.ethereumjsVm.distBloomMod.default
import typings.ethereumjsVm.distEvmEvmMod.EVMResult
import typings.ethereumjsVm.distEvmEvmMod.ExecResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRunTxMod {
  
  @JSImport("ethereumjs-vm/dist/runTx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: RunTxOpts): js.Promise[RunTxResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RunTxResult]]
  
  trait RunTxOpts extends StObject {
    
    /**
      * The block to which the `tx` belongs
      */
    var block: js.UndefOr[Any] = js.undefined
    
    /**
      * If true, skips the balance check
      */
    var skipBalance: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, skips the nonce check
      */
    var skipNonce: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A [`Transaction`](https://github.com/ethereum/ethereumjs-tx) to run
      */
    var tx: Transaction
  }
  object RunTxOpts {
    
    inline def apply(tx: Transaction): RunTxOpts = {
      val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunTxOpts]
    }
    
    extension [Self <: RunTxOpts](x: Self) {
      
      inline def setBlock(value: Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setSkipBalance(value: Boolean): Self = StObject.set(x, "skipBalance", value.asInstanceOf[js.Any])
      
      inline def setSkipBalanceUndefined: Self = StObject.set(x, "skipBalance", js.undefined)
      
      inline def setSkipNonce(value: Boolean): Self = StObject.set(x, "skipNonce", value.asInstanceOf[js.Any])
      
      inline def setSkipNonceUndefined: Self = StObject.set(x, "skipNonce", js.undefined)
      
      inline def setTx(value: Transaction): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunTxResult
    extends StObject
       with EVMResult {
    
    /**
      * The amount of ether used by this transaction
      */
    var amountSpent: typings.bnJs.mod.^
    
    /**
      * Bloom filter resulted from transaction
      */
    var bloom: default
    
    /**
      * The amount of gas as that was refunded during the transaction (i.e. `gasUsed = totalGasConsumed - gasRefund`)
      */
    var gasRefund: js.UndefOr[typings.bnJs.mod.^] = js.undefined
  }
  object RunTxResult {
    
    inline def apply(
      amountSpent: typings.bnJs.mod.^,
      bloom: default,
      execResult: ExecResult,
      gasUsed: typings.bnJs.mod.^
    ): RunTxResult = {
      val __obj = js.Dynamic.literal(amountSpent = amountSpent.asInstanceOf[js.Any], bloom = bloom.asInstanceOf[js.Any], execResult = execResult.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunTxResult]
    }
    
    extension [Self <: RunTxResult](x: Self) {
      
      inline def setAmountSpent(value: typings.bnJs.mod.^): Self = StObject.set(x, "amountSpent", value.asInstanceOf[js.Any])
      
      inline def setBloom(value: default): Self = StObject.set(x, "bloom", value.asInstanceOf[js.Any])
      
      inline def setGasRefund(value: typings.bnJs.mod.^): Self = StObject.set(x, "gasRefund", value.asInstanceOf[js.Any])
      
      inline def setGasRefundUndefined: Self = StObject.set(x, "gasRefund", js.undefined)
    }
  }
}
