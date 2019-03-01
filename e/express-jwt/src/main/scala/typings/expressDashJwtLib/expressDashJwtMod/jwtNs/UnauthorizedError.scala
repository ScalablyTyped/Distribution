package typings
package expressDashJwtLib.expressDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnauthorizedError
  extends nodeLib.Error {
  var code: ErrorCode
  var inner: expressDashJwtLib.Anon_Message
  var message: java.lang.String
  var name: expressDashJwtLib.expressDashJwtLibStrings.UnauthorizedError
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("inner")(inner)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("status")(status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UnauthorizedError]
  }
}

