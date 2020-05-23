package typings.gapiClientSqladmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Available extends js.Object {
  /**
    * The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The master can only failover to the
    * falover replica when the status is true.
    */
  var available: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn't include the
    * project ID. This property is applicable only to Second Generation instances.
    */
  var name: js.UndefOr[String] = js.undefined
}

object Available {
  @scala.inline
  def apply(available: js.UndefOr[Boolean] = js.undefined, name: String = null): Available = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
}

