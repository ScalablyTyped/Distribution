package typings.emailDashAddresses.emailAddresses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTNode extends js.Object {
  var children: js.Array[ASTNode]
  var name: String
  var semantic: String
  var tokens: String
}

object ASTNode {
  @scala.inline
  def apply(children: js.Array[ASTNode], name: String, semantic: String, tokens: String): ASTNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ASTNode]
  }
}

