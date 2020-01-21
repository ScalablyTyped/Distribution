package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The policy describes the baseline against which VM instance boot integrity
  * is measured.
  */
@js.native
trait SchemaShieldedVmIntegrityPolicy extends js.Object {
  /**
    * Updates the integrity policy baseline using the measurements from the VM
    * instance&#39;s most recent boot.
    */
  var updateAutoLearnPolicy: js.UndefOr[Boolean] = js.native
}

object SchemaShieldedVmIntegrityPolicy {
  @scala.inline
  def apply(updateAutoLearnPolicy: js.UndefOr[Boolean] = js.undefined): SchemaShieldedVmIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateAutoLearnPolicy)) __obj.updateDynamic("updateAutoLearnPolicy")(updateAutoLearnPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShieldedVmIntegrityPolicy]
  }
}

