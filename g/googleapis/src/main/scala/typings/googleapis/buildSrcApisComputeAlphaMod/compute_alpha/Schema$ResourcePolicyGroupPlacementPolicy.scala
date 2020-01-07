package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GroupPlacementPolicy specifies resource placement configuration. It
  * specifies the failure bucket separation as well as network locality
  */
@js.native
trait Schema$ResourcePolicyGroupPlacementPolicy extends js.Object {
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

object Schema$ResourcePolicyGroupPlacementPolicy {
  @scala.inline
  def apply(locality: String = null, style: String = null, vmCount: Int | Double = null): Schema$ResourcePolicyGroupPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (vmCount != null) __obj.updateDynamic("vmCount")(vmCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicyGroupPlacementPolicy]
  }
}

