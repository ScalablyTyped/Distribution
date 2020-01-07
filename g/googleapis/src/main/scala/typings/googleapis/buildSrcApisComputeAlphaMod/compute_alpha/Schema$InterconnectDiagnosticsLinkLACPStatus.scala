package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InterconnectDiagnosticsLinkLACPStatus extends js.Object {
  /**
    * System ID of the port on Google?s side of the LACP exchange.
    */
  var googleSystemId: js.UndefOr[String] = js.native
  /**
    * System ID of the port on the neighbor?s side of the LACP exchange.
    */
  var neighborSystemId: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object Schema$InterconnectDiagnosticsLinkLACPStatus {
  @scala.inline
  def apply(googleSystemId: String = null, neighborSystemId: String = null, state: String = null): Schema$InterconnectDiagnosticsLinkLACPStatus = {
    val __obj = js.Dynamic.literal()
    if (googleSystemId != null) __obj.updateDynamic("googleSystemId")(googleSystemId.asInstanceOf[js.Any])
    if (neighborSystemId != null) __obj.updateDynamic("neighborSystemId")(neighborSystemId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InterconnectDiagnosticsLinkLACPStatus]
  }
}

