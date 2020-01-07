package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a single physical circuit between the Customer and Google.
  * CircuitInfo objects are created by Google, so all fields are output only.
  * Next id: 4
  */
@js.native
trait Schema$InterconnectCircuitInfo extends js.Object {
  /**
    * Customer-side demarc ID for this circuit.
    */
  var customerDemarcId: js.UndefOr[String] = js.native
  /**
    * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
    */
  var googleCircuitId: js.UndefOr[String] = js.native
  /**
    * Google-side demarc ID for this circuit. Assigned at circuit turn-up and
    * provided by Google to the customer in the LOA.
    */
  var googleDemarcId: js.UndefOr[String] = js.native
}

object Schema$InterconnectCircuitInfo {
  @scala.inline
  def apply(customerDemarcId: String = null, googleCircuitId: String = null, googleDemarcId: String = null): Schema$InterconnectCircuitInfo = {
    val __obj = js.Dynamic.literal()
    if (customerDemarcId != null) __obj.updateDynamic("customerDemarcId")(customerDemarcId.asInstanceOf[js.Any])
    if (googleCircuitId != null) __obj.updateDynamic("googleCircuitId")(googleCircuitId.asInstanceOf[js.Any])
    if (googleDemarcId != null) __obj.updateDynamic("googleDemarcId")(googleDemarcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InterconnectCircuitInfo]
  }
}

