package typings.gapiDotClientDotServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckError extends js.Object {
  /** The error code. */
  var code: js.UndefOr[String] = js.undefined
  /** Free-form text providing details on the error cause of the error. */
  var detail: js.UndefOr[String] = js.undefined
}

object CheckError {
  @scala.inline
  def apply(code: String = null, detail: String = null): CheckError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    __obj.asInstanceOf[CheckError]
  }
}

