package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserScriptable extends UniqueId {
  /** The user function. Must set one of body or serverscript */
  var body: js.UndefOr[UserFunction] = js.undefined
  /** The user function. Must set one of body or serverscript */
  var serverScript: js.UndefOr[UserFunction] = js.undefined
}

object UserScriptable {
  @scala.inline
  def apply(id: String, body: UserFunction = null, serverScript: UserFunction = null): UserScriptable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (serverScript != null) __obj.updateDynamic("serverScript")(serverScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserScriptable]
  }
}

