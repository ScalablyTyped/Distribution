package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManagersSetInstanceTemplateRequest extends js.Object {
  /**
    * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the
    * managed instance group.
    */
  var instanceTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object InstanceGroupManagersSetInstanceTemplateRequest {
  @scala.inline
  def apply(instanceTemplate: java.lang.String = null): InstanceGroupManagersSetInstanceTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate)
    __obj.asInstanceOf[InstanceGroupManagersSetInstanceTemplateRequest]
  }
}

