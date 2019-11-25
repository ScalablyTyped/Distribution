package typings.gapiDotClientDotServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaError extends js.Object {
  /** Error code. */
  var code: js.UndefOr[String] = js.undefined
  /** Free-form text that provides details on the cause of the error. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Subject to whom this error applies. See the specific enum for more details
    * on this field. For example, "clientip:<ip address of client>" or
    * "project:<Google developer project id>".
    */
  var subject: js.UndefOr[String] = js.undefined
}

object QuotaError {
  @scala.inline
  def apply(code: String = null, description: String = null, subject: String = null): QuotaError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaError]
  }
}

