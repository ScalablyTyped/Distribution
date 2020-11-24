package typings.ethersprojectNetworks.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network extends js.Object {
  
  var _defaultProvider: js.UndefOr[js.Function2[/* providers */ js.Any, /* options */ js.UndefOr[js.Any], _]] = js.native
  
  var chainId: Double = js.native
  
  var ensAddress: js.UndefOr[String] = js.native
  
  var name: String = js.native
}
object Network {
  
  @scala.inline
  def apply(chainId: Double, name: String): Network = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
  
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
    
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
    def setChainId(value: Double): Self = this.set("chainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultProvider(value: (/* providers */ js.Any, /* options */ js.UndefOr[js.Any]) => _): Self = this.set("_defaultProvider", js.Any.fromFunction2(value))
    
    @scala.inline
    def delete_defaultProvider: Self = this.set("_defaultProvider", js.undefined)
    
    @scala.inline
    def setEnsAddress(value: String): Self = this.set("ensAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnsAddress: Self = this.set("ensAddress", js.undefined)
  }
}
