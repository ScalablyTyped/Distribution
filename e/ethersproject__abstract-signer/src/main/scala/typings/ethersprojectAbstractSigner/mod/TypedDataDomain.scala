package typings.ethersprojectAbstractSigner.mod

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedDataDomain extends js.Object {
  
  var chainId: js.UndefOr[BigNumberish] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var salt: js.UndefOr[BytesLike] = js.native
  
  var verifyingContract: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object TypedDataDomain {
  
  @scala.inline
  def apply(): TypedDataDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedDataDomain]
  }
  
  @scala.inline
  implicit class TypedDataDomainOps[Self <: TypedDataDomain] (val x: Self) extends AnyVal {
    
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
    def setChainId(value: BigNumberish): Self = this.set("chainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChainId: Self = this.set("chainId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSalt(value: BytesLike): Self = this.set("salt", value.asInstanceOf[js.Any])
    
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
