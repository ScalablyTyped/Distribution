package typings.emailAddresses.emailAddresses

import typings.emailAddresses.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedGroup extends js.Object {
  
  var addresses: js.Array[ParsedMailbox] = js.native
  
  var name: String = js.native
  
  var node: js.UndefOr[ASTNode] = js.native
  
  var parts: Name = js.native
  
  var `type`: String = js.native
}
object ParsedGroup {
  
  @scala.inline
  def apply(addresses: js.Array[ParsedMailbox], name: String, parts: Name, `type`: String): ParsedGroup = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedGroup]
  }
  
  @scala.inline
  implicit class ParsedGroupOps[Self <: ParsedGroup] (val x: Self) extends AnyVal {
    
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
    def setAddressesVarargs(value: ParsedMailbox*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[ParsedMailbox]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParts(value: Name): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ASTNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
  }
}
