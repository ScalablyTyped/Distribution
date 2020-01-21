package typings.emailAddresses

import typings.emailAddresses.emailAddresses.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: ASTNode
  var comments: js.Array[ASTNode]
  var domain: ASTNode
  var local: ASTNode
  var name: ASTNode
}

object AnonAddress {
  @scala.inline
  def apply(address: ASTNode, comments: js.Array[ASTNode], domain: ASTNode, local: ASTNode, name: ASTNode): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddress]
  }
}

