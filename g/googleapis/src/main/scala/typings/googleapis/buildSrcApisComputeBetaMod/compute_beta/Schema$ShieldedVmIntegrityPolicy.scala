package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The policy describes the baseline against which VM instance boot integrity
  * is measured.
  */
@js.native
trait Schema$ShieldedVmIntegrityPolicy extends js.Object {
  /**
    * Updates the integrity policy baseline using the measurements from the VM
    * instance&#39;s most recent boot.
    */
  var updateAutoLearnPolicy: js.UndefOr[Boolean] = js.native
}

object Schema$ShieldedVmIntegrityPolicy {
  @scala.inline
  def apply(updateAutoLearnPolicy: js.UndefOr[Boolean] = js.undefined): Schema$ShieldedVmIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateAutoLearnPolicy)) __obj.updateDynamic("updateAutoLearnPolicy")(updateAutoLearnPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShieldedVmIntegrityPolicy]
  }
}

