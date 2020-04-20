package typings.emailAddresses.emailAddresses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedResult extends js.Object {
  var addresses: js.Array[ParsedMailbox | ParsedGroup]
  var ast: ASTNode
}

object ParsedResult {
  @scala.inline
  def apply(addresses: js.Array[ParsedMailbox | ParsedGroup], ast: ASTNode): ParsedResult = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedResult]
  }
}

