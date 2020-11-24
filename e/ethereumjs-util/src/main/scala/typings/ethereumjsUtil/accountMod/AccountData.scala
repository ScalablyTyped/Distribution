package typings.ethereumjsUtil.accountMod

import typings.ethereumjsUtil.typesMod.BNLike
import typings.ethereumjsUtil.typesMod.BufferLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountData extends js.Object {
  
  var balance: js.UndefOr[BNLike] = js.native
  
  var codeHash: js.UndefOr[BufferLike] = js.native
  
  var nonce: js.UndefOr[BNLike] = js.native
  
  var stateRoot: js.UndefOr[BufferLike] = js.native
}
object AccountData {
  
  @scala.inline
  def apply(): AccountData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountData]
  }
  
  @scala.inline
  implicit class AccountDataOps[Self <: AccountData] (val x: Self) extends AnyVal {
    
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
    def setBalance(value: BNLike): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    
    @scala.inline
    def setCodeHashVarargs(value: Double*): Self = this.set("codeHash", js.Array(value :_*))
    
    @scala.inline
    def setCodeHash(value: BufferLike): Self = this.set("codeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeHash: Self = this.set("codeHash", js.undefined)
    
    @scala.inline
    def setNonce(value: BNLike): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setStateRootVarargs(value: Double*): Self = this.set("stateRoot", js.Array(value :_*))
    
    @scala.inline
    def setStateRoot(value: BufferLike): Self = this.set("stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateRoot: Self = this.set("stateRoot", js.undefined)
  }
}
