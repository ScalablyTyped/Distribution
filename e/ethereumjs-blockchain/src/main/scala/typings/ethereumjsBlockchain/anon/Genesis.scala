package typings.ethereumjsBlockchain.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Genesis extends js.Object {
  
  var genesis: js.Any = js.native
  
  var heads: js.Any = js.native
  
  var rawHead: js.Any = js.native
}
object Genesis {
  
  @scala.inline
  def apply(genesis: js.Any, heads: js.Any, rawHead: js.Any): Genesis = {
    val __obj = js.Dynamic.literal(genesis = genesis.asInstanceOf[js.Any], heads = heads.asInstanceOf[js.Any], rawHead = rawHead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genesis]
  }
  
  @scala.inline
  implicit class GenesisOps[Self <: Genesis] (val x: Self) extends AnyVal {
    
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
    def setGenesis(value: js.Any): Self = this.set("genesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeads(value: js.Any): Self = this.set("heads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawHead(value: js.Any): Self = this.set("rawHead", value.asInstanceOf[js.Any])
  }
}
