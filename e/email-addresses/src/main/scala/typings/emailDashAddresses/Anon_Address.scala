package typings.emailDashAddresses

import typings.emailDashAddresses.emailAddresses.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: ASTNode
  var comments: js.Array[ASTNode]
  var domain: ASTNode
  var local: ASTNode
  var name: ASTNode
}

object Anon_Address {
  @scala.inline
  def apply(address: ASTNode, comments: js.Array[ASTNode], domain: ASTNode, local: ASTNode, name: ASTNode): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Address]
  }
}

