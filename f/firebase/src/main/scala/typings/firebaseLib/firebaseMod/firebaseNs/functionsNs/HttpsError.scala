package typings
package firebaseLib.firebaseMod.firebaseNs.functionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsError
  extends nodeLib.Error {
  val code: ErrorStatus
  val details: js.UndefOr[js.Any] = js.undefined
}

object HttpsError {
  @scala.inline
  def apply(code: ErrorStatus, details: js.Any = null, stack: java.lang.String = null): HttpsError = {
    val __obj = js.Dynamic.literal(code = code)
    if (details != null) __obj.updateDynamic("details")(details)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[HttpsError]
  }
}

