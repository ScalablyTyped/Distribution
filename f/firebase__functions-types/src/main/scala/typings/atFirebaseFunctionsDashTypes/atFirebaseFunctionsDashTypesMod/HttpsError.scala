package typings.atFirebaseFunctionsDashTypes.atFirebaseFunctionsDashTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsError extends Error {
  /**
    * A standard error code that will be returned to the client. This also
    * determines the HTTP status code of the response, as defined in code.proto.
    */
  val code: FunctionsErrorCode
  /**
    * Extra data to be converted to JSON and included in the error response.
    */
  val details: js.UndefOr[js.Any] = js.undefined
}

object HttpsError {
  @scala.inline
  def apply(
    code: FunctionsErrorCode,
    message: String,
    name: String,
    details: js.Any = null,
    stack: String = null
  ): HttpsError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (details != null) __obj.updateDynamic("details")(details)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[HttpsError]
  }
}

