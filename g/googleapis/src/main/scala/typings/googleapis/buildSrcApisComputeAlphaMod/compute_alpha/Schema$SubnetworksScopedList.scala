package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SubnetworksScopedList extends js.Object {
  /**
    * A list of subnetworks contained in this scope.
    */
  var subnetworks: js.UndefOr[js.Array[Schema$Subnetwork]] = js.native
  /**
    * An informational warning that appears when the list of addresses is
    * empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$SubnetworksScopedList {
  @scala.inline
  def apply(subnetworks: js.Array[Schema$Subnetwork] = null, warning: Anon_Code = null): Schema$SubnetworksScopedList = {
    val __obj = js.Dynamic.literal()
    if (subnetworks != null) __obj.updateDynamic("subnetworks")(subnetworks.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubnetworksScopedList]
  }
}

