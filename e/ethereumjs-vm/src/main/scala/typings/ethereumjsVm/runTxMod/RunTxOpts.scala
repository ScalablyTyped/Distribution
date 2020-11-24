package typings.ethereumjsVm.runTxMod

import typings.ethereumjsTx.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunTxOpts extends js.Object {
  
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
  implicit class RunTxOptsOps[Self <: RunTxOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTx(value: Transaction): Self = this.set("tx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: js.Any): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setSkipBalance(value: Boolean): Self = this.set("skipBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipBalance: Self = this.set("skipBalance", js.undefined)
    
    @scala.inline
    def setSkipNonce(value: Boolean): Self = this.set("skipNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipNonce: Self = this.set("skipNonce", js.undefined)
  }
}
