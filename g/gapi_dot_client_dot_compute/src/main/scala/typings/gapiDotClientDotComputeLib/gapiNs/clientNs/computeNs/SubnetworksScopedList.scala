package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksScopedList extends js.Object {
  /** List of subnetworks contained in this scope. */
  var subnetworks: js.UndefOr[js.Array[Subnetwork]] = js.undefined
  /** An informational warning that appears when the list of addresses is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object SubnetworksScopedList {
  @scala.inline
  def apply(subnetworks: js.Array[Subnetwork] = null, warning: gapiDotClientDotComputeLib.Anon_Code = null): SubnetworksScopedList = {
    val __obj = js.Dynamic.literal()
    if (subnetworks != null) __obj.updateDynamic("subnetworks")(subnetworks)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[SubnetworksScopedList]
  }
}

