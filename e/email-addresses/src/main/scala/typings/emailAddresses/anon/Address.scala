package typings.emailAddresses.anon

import typings.emailAddresses.emailAddresses.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: ASTNode = js.native
  var comments: js.Array[ASTNode] = js.native
  var domain: ASTNode = js.native
  var local: ASTNode = js.native
  var name: ASTNode = js.native
}

object Address {
  @scala.inline
  def apply(address: ASTNode, comments: js.Array[ASTNode], domain: ASTNode, local: ASTNode, name: ASTNode): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setAddress(value: ASTNode): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentsVarargs(value: ASTNode*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[ASTNode]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: ASTNode): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal(value: ASTNode): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ASTNode): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

