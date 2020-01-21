package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message of customer&#39;s listing DPCs.
  */
@js.native
trait SchemaCustomerListDpcsResponse extends js.Object {
  /**
    * The list of DPCs available to the customer that support zero-touch
    * enrollment.
    */
  var dpcs: js.UndefOr[js.Array[SchemaDpc]] = js.native
}

object SchemaCustomerListDpcsResponse {
  @scala.inline
  def apply(dpcs: js.Array[SchemaDpc] = null): SchemaCustomerListDpcsResponse = {
    val __obj = js.Dynamic.literal()
    if (dpcs != null) __obj.updateDynamic("dpcs")(dpcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomerListDpcsResponse]
  }
}

