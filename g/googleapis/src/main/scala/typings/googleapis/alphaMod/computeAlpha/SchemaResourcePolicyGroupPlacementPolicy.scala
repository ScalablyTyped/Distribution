package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GroupPlacementPolicy specifies resource placement configuration. It
  * specifies the failure bucket separation as well as network locality
  */
@js.native
trait SchemaResourcePolicyGroupPlacementPolicy extends js.Object {
  /**
    * Specifies network locality
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Specifies instances to hosts placement relationship
    */
  var style: js.UndefOr[String] = js.native
  /**
    * Number of vms in this placement group
    */
  var vmCount: js.UndefOr[Double] = js.native
}

object SchemaResourcePolicyGroupPlacementPolicy {
  @scala.inline
  def apply(locality: String = null, style: String = null, vmCount: js.UndefOr[Double] = js.undefined): SchemaResourcePolicyGroupPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(vmCount)) __obj.updateDynamic("vmCount")(vmCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicyGroupPlacementPolicy]
  }
}

