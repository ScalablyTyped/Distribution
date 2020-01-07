package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message of customer&#39;s listing DPCs.
  */
@js.native
trait Schema$CustomerListDpcsResponse extends js.Object {
  /**
    * The list of DPCs available to the customer that support zero-touch
    * enrollment.
    */
  var dpcs: js.UndefOr[js.Array[Schema$Dpc]] = js.native
}

object Schema$CustomerListDpcsResponse {
  @scala.inline
  def apply(dpcs: js.Array[Schema$Dpc] = null): Schema$CustomerListDpcsResponse = {
    val __obj = js.Dynamic.literal()
    if (dpcs != null) __obj.updateDynamic("dpcs")(dpcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerListDpcsResponse]
  }
}

