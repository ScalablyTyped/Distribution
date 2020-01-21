package typings.emailAddresses.emailAddresses

import typings.emailAddresses.AnonAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedMailbox extends js.Object {
  var address: String
  var domain: String
  var local: String
  var name: String
  var node: js.UndefOr[ASTNode] = js.undefined
  var parts: AnonAddress
  var `type`: String
}

object ParsedMailbox {
  @scala.inline
  def apply(
    address: String,
    domain: String,
    local: String,
    name: String,
    parts: AnonAddress,
    `type`: String,
    node: ASTNode = null
  ): ParsedMailbox = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedMailbox]
  }
}

