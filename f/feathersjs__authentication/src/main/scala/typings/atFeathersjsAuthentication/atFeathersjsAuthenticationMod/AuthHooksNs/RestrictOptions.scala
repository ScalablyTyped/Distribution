package typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod.AuthHooksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictOptions extends js.Object {
  var idField: String
  var ownerField: String
}

object RestrictOptions {
  @scala.inline
  def apply(idField: String, ownerField: String): RestrictOptions = {
    val __obj = js.Dynamic.literal(idField = idField, ownerField = ownerField)
  
    __obj.asInstanceOf[RestrictOptions]
  }
}

