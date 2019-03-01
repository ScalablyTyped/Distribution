package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedFunction extends UserScriptable {
  /** Type of function */
  var userDefinedFunctionType: js.UndefOr[UserDefinedFunctionType] = js.undefined
}

object UserDefinedFunction {
  @scala.inline
  def apply(
    id: java.lang.String,
    body: UserFunction = null,
    serverScript: UserFunction = null,
    userDefinedFunctionType: UserDefinedFunctionType = null
  ): UserDefinedFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (serverScript != null) __obj.updateDynamic("serverScript")(serverScript.asInstanceOf[js.Any])
    if (userDefinedFunctionType != null) __obj.updateDynamic("userDefinedFunctionType")(userDefinedFunctionType)
    __obj.asInstanceOf[UserDefinedFunction]
  }
}

