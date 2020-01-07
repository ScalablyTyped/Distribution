package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents error information for QuotaOperation.
  */
@js.native
trait Schema$QuotaError extends js.Object {
  /**
    * Error code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Free-form text that provides details on the cause of the error.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Subject to whom this error applies. See the specific enum for more
    * details on this field. For example, &quot;clientip:&lt;ip address of
    * client&gt;&quot; or &quot;project:&lt;Google developer project
    * id&gt;&quot;.
    */
  var subject: js.UndefOr[String] = js.native
}

object Schema$QuotaError {
  @scala.inline
  def apply(code: String = null, description: String = null, subject: String = null): Schema$QuotaError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QuotaError]
  }
}

