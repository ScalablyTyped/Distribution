package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualScaling extends js.Object {
  /**
    * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API
    * (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
    */
  var instances: js.UndefOr[scala.Double] = js.undefined
}

object ManualScaling {
  @scala.inline
  def apply(instances: scala.Int | scala.Double = null): ManualScaling = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualScaling]
  }
}

