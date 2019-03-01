package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupManagersSetTemplateRequest extends js.Object {
  /** URL of the InstanceTemplate resource from which all new instances will be created. */
  var instanceTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object RegionInstanceGroupManagersSetTemplateRequest {
  @scala.inline
  def apply(instanceTemplate: java.lang.String = null): RegionInstanceGroupManagersSetTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate)
    __obj.asInstanceOf[RegionInstanceGroupManagersSetTemplateRequest]
  }
}

