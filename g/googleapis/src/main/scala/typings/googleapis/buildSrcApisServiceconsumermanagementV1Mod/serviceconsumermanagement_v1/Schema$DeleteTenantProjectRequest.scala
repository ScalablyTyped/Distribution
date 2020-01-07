package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to delete tenant project resource from the tenancy unit.
  */
@js.native
trait Schema$DeleteTenantProjectRequest extends js.Object {
  /**
    * Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$DeleteTenantProjectRequest {
  @scala.inline
  def apply(tag: String = null): Schema$DeleteTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteTenantProjectRequest]
  }
}

