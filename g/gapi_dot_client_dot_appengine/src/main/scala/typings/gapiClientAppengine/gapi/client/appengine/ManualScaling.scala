package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualScaling extends js.Object {
  /**
    * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API
    * (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
    */
  var instances: js.UndefOr[Double] = js.undefined
}

object ManualScaling {
  @scala.inline
  def apply(instances: Int | Double = null): ManualScaling = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualScaling]
  }
}

