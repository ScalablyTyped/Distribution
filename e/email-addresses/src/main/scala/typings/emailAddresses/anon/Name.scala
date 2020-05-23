package typings.emailAddresses.anon

import typings.emailAddresses.emailAddresses.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: ASTNode
}

object Name {
  @scala.inline
  def apply(name: ASTNode): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

