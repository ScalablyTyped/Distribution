package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AutoscalerStatusDetails extends js.Object {
  /**
    * The status message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The type of error returned.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$AutoscalerStatusDetails {
  @scala.inline
  def apply(message: String = null, `type`: String = null): Schema$AutoscalerStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoscalerStatusDetails]
  }
}

