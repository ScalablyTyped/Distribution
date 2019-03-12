package typings
package expressDashJwtLib.expressDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnauthorizedError
  extends stdLib.Error {
  var code: ErrorCode
  var inner: expressDashJwtLib.Anon_Message
  @JSName("name")
  var name_UnauthorizedError: expressDashJwtLib.expressDashJwtLibStrings.UnauthorizedError
  var status: scala.Double
}

object UnauthorizedError {
  @scala.inline
  def apply(
    code: ErrorCode,
    inner: expressDashJwtLib.Anon_Message,
    message: java.lang.String,
    name: expressDashJwtLib.expressDashJwtLibStrings.UnauthorizedError,
    status: scala.Double,
    stack: java.lang.String = null
  ): UnauthorizedError = {
    val __obj = js.Dynamic.literal(code = code, inner = inner, message = message, name = name, status = status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UnauthorizedError]
  }
}

