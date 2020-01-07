package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupManagersSetInstanceTemplateRequest extends js.Object {
  /**
    * The URL of the instance template that is specified for this managed
    * instance group. The group uses this template to create all new instances
    * in the managed instance group.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
}

object Schema$InstanceGroupManagersSetInstanceTemplateRequest {
  @scala.inline
  def apply(instanceTemplate: String = null): Schema$InstanceGroupManagersSetInstanceTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupManagersSetInstanceTemplateRequest]
  }
}

