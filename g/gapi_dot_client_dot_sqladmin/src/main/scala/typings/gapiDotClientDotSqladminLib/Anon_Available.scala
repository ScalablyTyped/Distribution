package typings
package gapiDotClientDotSqladminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Available extends js.Object {
  /**
    * The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The master can only failover to the
    * falover replica when the status is true.
    */
  var available: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn't include the
    * project ID. This property is applicable only to Second Generation instances.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Available {
  @scala.inline
  def apply(available: js.UndefOr[scala.Boolean] = js.undefined, name: java.lang.String = null): Anon_Available = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Available]
  }
}

