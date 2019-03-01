package typings
package emailDashAddressesLib.emailAddressesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedMailbox extends js.Object {
  var address: java.lang.String
  var domain: java.lang.String
  var local: java.lang.String
  var name: java.lang.String
  var node: js.UndefOr[ASTNode] = js.undefined
  var parts: emailDashAddressesLib.Anon_Address
  var `type`: java.lang.String
}

object ParsedMailbox {
  @scala.inline
  def apply(
    address: java.lang.String,
    domain: java.lang.String,
    local: java.lang.String,
    name: java.lang.String,
    parts: emailDashAddressesLib.Anon_Address,
    `type`: java.lang.String,
    node: ASTNode = null
  ): ParsedMailbox = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parts")(parts)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[ParsedMailbox]
  }
}

