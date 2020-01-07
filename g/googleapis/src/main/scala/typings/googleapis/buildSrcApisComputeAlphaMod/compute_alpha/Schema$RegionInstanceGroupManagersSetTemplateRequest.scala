package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionInstanceGroupManagersSetTemplateRequest extends js.Object {
  /**
    * URL of the InstanceTemplate resource from which all new instances will be
    * created.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
}

object Schema$RegionInstanceGroupManagersSetTemplateRequest {
  @scala.inline
  def apply(instanceTemplate: String = null): Schema$RegionInstanceGroupManagersSetTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionInstanceGroupManagersSetTemplateRequest]
  }
}

