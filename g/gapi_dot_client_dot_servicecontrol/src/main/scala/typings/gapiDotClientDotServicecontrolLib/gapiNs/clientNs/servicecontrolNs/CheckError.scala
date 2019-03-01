package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckError extends js.Object {
  /** The error code. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Free-form text providing details on the error cause of the error. */
  var detail: js.UndefOr[java.lang.String] = js.undefined
}

object CheckError {
  @scala.inline
  def apply(code: java.lang.String = null, detail: java.lang.String = null): CheckError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    __obj.asInstanceOf[CheckError]
  }
}

