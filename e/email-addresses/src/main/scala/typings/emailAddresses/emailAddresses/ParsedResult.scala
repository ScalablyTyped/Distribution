package typings.emailAddresses.emailAddresses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedResult extends js.Object {
  
  var addresses: js.Array[ParsedMailbox | ParsedGroup] = js.native
  
  var ast: ASTNode = js.native
}
object ParsedResult {
  
  @scala.inline
  def apply(addresses: js.Array[ParsedMailbox | ParsedGroup], ast: ASTNode): ParsedResult = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedResult]
  }
  
  @scala.inline
  implicit class ParsedResultOps[Self <: ParsedResult] (val x: Self) extends AnyVal {
    
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
    def setAddressesVarargs(value: (ParsedMailbox | ParsedGroup)*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[ParsedMailbox | ParsedGroup]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAst(value: ASTNode): Self = this.set("ast", value.asInstanceOf[js.Any])
  }
}
