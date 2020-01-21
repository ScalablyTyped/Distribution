package typings.googleapis.betaMod.computeBeta

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubnetworksScopedList extends js.Object {
  /**
    * A list of subnetworks contained in this scope.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaSubnetwork]] = js.native
  /**
    * An informational warning that appears when the list of addresses is
    * empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaSubnetworksScopedList {
  @scala.inline
  def apply(subnetworks: js.Array[SchemaSubnetwork] = null, warning: AnonCode = null): SchemaSubnetworksScopedList = {
    val __obj = js.Dynamic.literal()
    if (subnetworks != null) __obj.updateDynamic("subnetworks")(subnetworks.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubnetworksScopedList]
  }
}

