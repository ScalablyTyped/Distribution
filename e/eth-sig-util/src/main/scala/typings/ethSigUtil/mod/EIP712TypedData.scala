package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EIP712TypedData extends js.Object {
  
  var domain: EIP712Domain = js.native
  
  var message: EIP712Message = js.native
  
  var primaryType: String = js.native
  
  var types: EIP712Types = js.native
}
object EIP712TypedData {
  
  @scala.inline
  def apply(domain: EIP712Domain, message: EIP712Message, primaryType: String, types: EIP712Types): EIP712TypedData = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], primaryType = primaryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[EIP712TypedData]
  }
  
  @scala.inline
  implicit class EIP712TypedDataOps[Self <: EIP712TypedData] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: EIP712Domain): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: EIP712Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryType(value: String): Self = this.set("primaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: EIP712Types): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
