package typings.ethereumjsVm.runBlockMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunBlockOpts extends js.Object {
  
  /**
    * The [`Block`](https://github.com/ethereumjs/ethereumjs-block) to process
    */
  var block: js.Any = js.native
  
  /**
    * Whether to generate the stateRoot. If false `runBlock` will check the
    * stateRoot of the block against the Trie
    */
  var generate: js.UndefOr[Boolean] = js.native
  
  /**
    * Root of the state trie
    */
  var root: js.UndefOr[Buffer] = js.native
  
  /**
    * If true, skips the balance check
    */
  var skipBalance: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, will skip block validation
    */
  var skipBlockValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, skips the nonce check
    */
  var skipNonce: js.UndefOr[Boolean] = js.native
}
object RunBlockOpts {
  
  @scala.inline
  def apply(block: js.Any): RunBlockOpts = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunBlockOpts]
  }
  
  @scala.inline
  implicit class RunBlockOptsOps[Self <: RunBlockOpts] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: js.Any): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerate(value: Boolean): Self = this.set("generate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerate: Self = this.set("generate", js.undefined)
    
    @scala.inline
    def setRoot(value: Buffer): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSkipBalance(value: Boolean): Self = this.set("skipBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipBalance: Self = this.set("skipBalance", js.undefined)
    
    @scala.inline
    def setSkipBlockValidation(value: Boolean): Self = this.set("skipBlockValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipBlockValidation: Self = this.set("skipBlockValidation", js.undefined)
    
    @scala.inline
    def setSkipNonce(value: Boolean): Self = this.set("skipNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipNonce: Self = this.set("skipNonce", js.undefined)
  }
}
