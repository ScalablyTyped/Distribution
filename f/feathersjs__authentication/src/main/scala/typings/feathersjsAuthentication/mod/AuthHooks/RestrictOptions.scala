package typings.feathersjsAuthentication.mod.AuthHooks

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
    val __obj = js.Dynamic.literal(idField = idField.asInstanceOf[js.Any], ownerField = ownerField.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictOptions]
  }
}

