package typings
package firebaseLib.firebaseMod.firebaseNs.functionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsError
  extends nodeLib.Error {
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
  def apply(code: FunctionsErrorCode, details: js.Any = null, stack: java.lang.String = null): HttpsError = {
    val __obj = js.Dynamic.literal(code = code)
    if (details != null) __obj.updateDynamic("details")(details)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[HttpsError]
  }
}

