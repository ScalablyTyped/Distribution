package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionInstanceGroupManagersSetTemplateRequest extends js.Object {
  /**
    * URL of the InstanceTemplate resource from which all new instances will be
    * created.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
}

object SchemaRegionInstanceGroupManagersSetTemplateRequest {
  @scala.inline
  def apply(instanceTemplate: String = null): SchemaRegionInstanceGroupManagersSetTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSetTemplateRequest]
  }
}

