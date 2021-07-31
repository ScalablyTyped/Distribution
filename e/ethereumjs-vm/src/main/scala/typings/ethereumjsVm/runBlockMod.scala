package typings.ethereumjsVm

import typings.ethereumjsVm.ethereumjsVmNumbers.`0`
import typings.ethereumjsVm.ethereumjsVmNumbers.`1`
import typings.ethereumjsVm.runTxMod.RunTxResult
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runBlockMod {
  
  @JSImport("ethereumjs-vm/dist/runBlock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(opts: RunBlockOpts): js.Promise[RunBlockResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RunBlockResult]]
  
  trait RunBlockOpts extends StObject {
    
    /**
      * The [`Block`](https://github.com/ethereumjs/ethereumjs-block) to process
      */
    var block: js.Any
    
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
    
    @scala.inline
    def apply(block: js.Any): RunBlockOpts = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunBlockOpts]
    }
    
    @scala.inline
    implicit class RunBlockOptsMutableBuilder[Self <: RunBlockOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: js.Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerate(value: Boolean): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      @scala.inline
      def setRoot(value: Buffer): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSkipBalance(value: Boolean): Self = StObject.set(x, "skipBalance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipBalanceUndefined: Self = StObject.set(x, "skipBalance", js.undefined)
      
      @scala.inline
      def setSkipBlockValidation(value: Boolean): Self = StObject.set(x, "skipBlockValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipBlockValidationUndefined: Self = StObject.set(x, "skipBlockValidation", js.undefined)
      
      @scala.inline
      def setSkipNonce(value: Boolean): Self = StObject.set(x, "skipNonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipNonceUndefined: Self = StObject.set(x, "skipNonce", js.undefined)
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
    
    @scala.inline
    def apply(receipts: js.Array[TxReceipt], results: js.Array[RunTxResult]): RunBlockResult = {
      val __obj = js.Dynamic.literal(receipts = receipts.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunBlockResult]
    }
    
    @scala.inline
    implicit class RunBlockResultMutableBuilder[Self <: RunBlockResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReceipts(value: js.Array[TxReceipt]): Self = StObject.set(x, "receipts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptsVarargs(value: TxReceipt*): Self = StObject.set(x, "receipts", js.Array(value :_*))
      
      @scala.inline
      def setResults(value: js.Array[RunTxResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: RunTxResult*): Self = StObject.set(x, "results", js.Array(value :_*))
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
    var logs: js.Array[js.Any]
    
    /**
      * Status of transaction, `1` if successful, `0` if an exception occured
      */
    var status: `0` | `1`
  }
  object TxReceipt {
    
    @scala.inline
    def apply(bitvector: Buffer, gasUsed: Buffer, logs: js.Array[js.Any], status: `0` | `1`): TxReceipt = {
      val __obj = js.Dynamic.literal(bitvector = bitvector.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TxReceipt]
    }
    
    @scala.inline
    implicit class TxReceiptMutableBuilder[Self <: TxReceipt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitvector(value: Buffer): Self = StObject.set(x, "bitvector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUsed(value: Buffer): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogs(value: js.Array[js.Any]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsVarargs(value: js.Any*): Self = StObject.set(x, "logs", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: `0` | `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
