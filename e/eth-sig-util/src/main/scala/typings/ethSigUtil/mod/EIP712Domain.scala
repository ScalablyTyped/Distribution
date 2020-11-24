package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EIP712Domain extends js.Object {
  
  var chainId: js.UndefOr[String | Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var salt: js.UndefOr[String] = js.native
  
  var verifyingContract: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object EIP712Domain {
  
  @scala.inline
  def apply(): EIP712Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EIP712Domain]
  }
  
  @scala.inline
  implicit class EIP712DomainOps[Self <: EIP712Domain] (val x: Self) extends AnyVal {
    
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
    def setChainId(value: String | Double): Self = this.set("chainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChainId: Self = this.set("chainId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setVerifyingContract(value: String): Self = this.set("verifyingContract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyingContract: Self = this.set("verifyingContract", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
