package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to remove a tenant project resource from the tenancy unit.
  */
@js.native
trait Schema$RemoveTenantProjectRequest extends js.Object {
  /**
    * Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$RemoveTenantProjectRequest {
  @scala.inline
  def apply(tag: String = null): Schema$RemoveTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemoveTenantProjectRequest]
  }
}

