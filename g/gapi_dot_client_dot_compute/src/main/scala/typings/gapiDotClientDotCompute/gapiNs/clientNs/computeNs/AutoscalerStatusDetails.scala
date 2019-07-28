package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalerStatusDetails extends js.Object {
  /** The status message. */
  var message: js.UndefOr[String] = js.undefined
  /** The type of error returned. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AutoscalerStatusDetails {
  @scala.inline
  def apply(message: String = null, `type`: String = null): AutoscalerStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AutoscalerStatusDetails]
  }
}

