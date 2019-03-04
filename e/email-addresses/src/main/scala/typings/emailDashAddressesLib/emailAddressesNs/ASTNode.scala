package typings
package emailDashAddressesLib.emailAddressesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTNode extends js.Object {
  var children: js.Array[ASTNode]
  var name: java.lang.String
  var semantic: java.lang.String
  var tokens: java.lang.String
}

object ASTNode {
  @scala.inline
  def apply(
    children: js.Array[ASTNode],
    name: java.lang.String,
    semantic: java.lang.String,
    tokens: java.lang.String
  ): ASTNode = {
    val __obj = js.Dynamic.literal(children = children, name = name, semantic = semantic, tokens = tokens)
  
    __obj.asInstanceOf[ASTNode]
  }
}

