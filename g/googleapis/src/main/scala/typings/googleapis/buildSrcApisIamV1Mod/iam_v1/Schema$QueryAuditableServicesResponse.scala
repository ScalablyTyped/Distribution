package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a list of auditable services for a resource.
  */
@js.native
trait Schema$QueryAuditableServicesResponse extends js.Object {
  /**
    * The auditable services for a resource.
    */
  var services: js.UndefOr[js.Array[Schema$AuditableService]] = js.native
}

object Schema$QueryAuditableServicesResponse {
  @scala.inline
  def apply(services: js.Array[Schema$AuditableService] = null): Schema$QueryAuditableServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryAuditableServicesResponse]
  }
}

