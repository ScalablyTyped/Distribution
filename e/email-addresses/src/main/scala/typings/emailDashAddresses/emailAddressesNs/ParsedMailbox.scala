package typings.emailDashAddresses.emailAddressesNs

import typings.emailDashAddresses.Anon_Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedMailbox extends js.Object {
  var address: String
  var domain: String
  var local: String
  var name: String
  var node: js.UndefOr[ASTNode] = js.undefined
  var parts: Anon_Address
  var `type`: String
}

object ParsedMailbox {
  @scala.inline
  def apply(
    address: String,
    domain: String,
    local: String,
    name: String,
    parts: Anon_Address,
    `type`: String,
    node: ASTNode = null
  ): ParsedMailbox = {
    val __obj = js.Dynamic.literal(address = address, domain = domain, local = local, name = name, parts = parts)
    __obj.updateDynamic("type")(`type`)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[ParsedMailbox]
  }
}

