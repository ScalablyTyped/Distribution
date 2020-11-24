package typings.ethereumjsVm.stateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateManagerOpts extends js.Object {
  
  /**
    * Parameters of the chain ([`Common`](https://github.com/ethereumjs/ethereumjs-common))
    */
  var common: js.UndefOr[typings.ethereumjsCommon.mod.default] = js.native
  
  /**
    * A [`merkle-patricia-tree`](https://github.com/ethereumjs/merkle-patricia-tree) instance
    */
  var trie: js.UndefOr[js.Any] = js.native
}
object StateManagerOpts {
  
  @scala.inline
  def apply(): StateManagerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateManagerOpts]
  }
  
  @scala.inline
  implicit class StateManagerOptsOps[Self <: StateManagerOpts] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: typings.ethereumjsCommon.mod.default): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setTrie(value: js.Any): Self = this.set("trie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrie: Self = this.set("trie", js.undefined)
  }
}
