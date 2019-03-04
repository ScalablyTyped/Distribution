package typings
package emailDashAddressesLib.emailAddressesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedGroup extends js.Object {
  var addresses: js.Array[ParsedMailbox]
  var name: java.lang.String
  var node: js.UndefOr[ASTNode] = js.undefined
  var parts: emailDashAddressesLib.Anon_Name
  var `type`: java.lang.String
}

object ParsedGroup {
  @scala.inline
  def apply(
    addresses: js.Array[ParsedMailbox],
    name: java.lang.String,
    parts: emailDashAddressesLib.Anon_Name,
    `type`: java.lang.String,
    node: ASTNode = null
  ): ParsedGroup = {
    val __obj = js.Dynamic.literal(addresses = addresses, name = name, parts = parts)
    __obj.updateDynamic("type")(`type`)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[ParsedGroup]
  }
}

