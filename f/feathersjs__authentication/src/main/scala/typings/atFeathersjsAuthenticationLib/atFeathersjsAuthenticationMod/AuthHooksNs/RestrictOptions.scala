package typings
package atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.AuthHooksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictOptions extends js.Object {
  var idField: java.lang.String
  var ownerField: java.lang.String
}

object RestrictOptions {
  @scala.inline
  def apply(idField: java.lang.String, ownerField: java.lang.String): RestrictOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("idField")(idField)
    __obj.updateDynamic("ownerField")(ownerField)
    __obj.asInstanceOf[RestrictOptions]
  }
}

