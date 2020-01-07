package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for updating a finding&#39;s state.
  */
@js.native
trait Schema$SetFindingStateRequest extends js.Object {
  /**
    * The time at which the updated state takes effect.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The desired State of the finding.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$SetFindingStateRequest {
  @scala.inline
  def apply(startTime: String = null, state: String = null): Schema$SetFindingStateRequest = {
    val __obj = js.Dynamic.literal()
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetFindingStateRequest]
  }
}

