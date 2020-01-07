package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The policy describes the baseline against which Instance boot integrity is
  * measured.
  */
@js.native
trait Schema$ShieldedInstanceIntegrityPolicy extends js.Object {
  /**
    * Updates the integrity policy baseline using the measurements from the VM
    * instance&#39;s most recent boot.
    */
  var updateAutoLearnPolicy: js.UndefOr[Boolean] = js.native
}

object Schema$ShieldedInstanceIntegrityPolicy {
  @scala.inline
  def apply(updateAutoLearnPolicy: js.UndefOr[Boolean] = js.undefined): Schema$ShieldedInstanceIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateAutoLearnPolicy)) __obj.updateDynamic("updateAutoLearnPolicy")(updateAutoLearnPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShieldedInstanceIntegrityPolicy]
  }
}

