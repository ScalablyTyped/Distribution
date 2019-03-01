package typings
package emailDashAddressesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: emailDashAddressesLib.emailAddressesNs.ASTNode
  var comments: js.Array[emailDashAddressesLib.emailAddressesNs.ASTNode]
  var domain: emailDashAddressesLib.emailAddressesNs.ASTNode
  var local: emailDashAddressesLib.emailAddressesNs.ASTNode
  var name: emailDashAddressesLib.emailAddressesNs.ASTNode
}

object Anon_Address {
  @scala.inline
  def apply(
    address: emailDashAddressesLib.emailAddressesNs.ASTNode,
    comments: js.Array[emailDashAddressesLib.emailAddressesNs.ASTNode],
    domain: emailDashAddressesLib.emailAddressesNs.ASTNode,
    local: emailDashAddressesLib.emailAddressesNs.ASTNode,
    name: emailDashAddressesLib.emailAddressesNs.ASTNode
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Address]
  }
}

