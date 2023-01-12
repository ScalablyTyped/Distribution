package typings.ethereumjsVm

import typings.ethereumjsVm.distRunTxMod.RunTxResult
import typings.ethereumjsVm.ethereumjsVmInts.`0`
import typings.ethereumjsVm.ethereumjsVmInts.`1`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRunBlockMod {
  
  @JSImport("ethereumjs-vm/dist/runBlock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: RunBlockOpts): js.Promise[RunBlockResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RunBlockResult]]
  
  trait RunBlockOpts extends StObject {
    
    /**
      * The [`Block`](https://github.com/ethereumjs/ethereumjs-block) to process
      */
    var block: Any
    
    /**
      * Whether to generate the stateRoot. If false `runBlock` will check the
      * stateRoot of the block against the Trie
      */
    var generate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Root of the state trie
      */
    var root: js.UndefOr[Buffer] = js.undefined
    
    /**
      * If true, skips the balance check
      */
    var skipBalance: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, will skip block validation
      */
    var skipBlockValidation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, skips the nonce check
      */
    var skipNonce: js.UndefOr[Boolean] = js.undefined
  }
  object RunBlockOpts {
    
    inline def apply(block: Any): RunBlockOpts = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunBlockOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunBlockOpts] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setGenerate(value: Boolean): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
      
      inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      inline def setRoot(value: Buffer): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSkipBalance(value: Boolean): Self = StObject.set(x, "skipBalance", value.asInstanceOf[js.Any])
      
      inline def setSkipBalanceUndefined: Self = StObject.set(x, "skipBalance", js.undefined)
      
      inline def setSkipBlockValidation(value: Boolean): Self = StObject.set(x, "skipBlockValidation", value.asInstanceOf[js.Any])
      
      inline def setSkipBlockValidationUndefined: Self = StObject.set(x, "skipBlockValidation", js.undefined)
      
      inline def setSkipNonce(value: Boolean): Self = StObject.set(x, "skipNonce", value.asInstanceOf[js.Any])
      
      inline def setSkipNonceUndefined: Self = StObject.set(x, "skipNonce", js.undefined)
    }
  }
  
  trait RunBlockResult extends StObject {
    
    /**
      * Receipts generated for transactions in the block
      */
    var receipts: js.Array[TxReceipt]
    
    /**
      * Results of executing the transactions in the block
      */
    var results: js.Array[RunTxResult]
  }
  object RunBlockResult {
    
    inline def apply(receipts: js.Array[TxReceipt], results: js.Array[RunTxResult]): RunBlockResult = {
      val __obj = js.Dynamic.literal(receipts = receipts.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunBlockResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunBlockResult] (val x: Self) extends AnyVal {
      
      inline def setReceipts(value: js.Array[TxReceipt]): Self = StObject.set(x, "receipts", value.asInstanceOf[js.Any])
      
      inline def setReceiptsVarargs(value: TxReceipt*): Self = StObject.set(x, "receipts", js.Array(value*))
      
      inline def setResults(value: js.Array[RunTxResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: RunTxResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait TxReceipt extends StObject {
    
    /**
      * Bloom bitvector
      */
    var bitvector: Buffer
    
    /**
      * Gas used
      */
    var gasUsed: Buffer
    
    /**
      * Logs emitted
      */
    var logs: js.Array[Any]
    
    /**
      * Status of transaction, `1` if successful, `0` if an exception occured
      */
    var status: `0` | `1`
  }
  object TxReceipt {
    
    inline def apply(bitvector: Buffer, gasUsed: Buffer, logs: js.Array[Any], status: `0` | `1`): TxReceipt = {
      val __obj = js.Dynamic.literal(bitvector = bitvector.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TxReceipt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TxReceipt] (val x: Self) extends AnyVal {
      
      inline def setBitvector(value: Buffer): Self = StObject.set(x, "bitvector", value.asInstanceOf[js.Any])
      
      inline def setGasUsed(value: Buffer): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      inline def setLogs(value: js.Array[Any]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsVarargs(value: Any*): Self = StObject.set(x, "logs", js.Array(value*))
      
      inline def setStatus(value: `0` | `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
