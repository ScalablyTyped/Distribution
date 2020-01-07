package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates a single service in Google Cloud Platform.
  */
@js.native
trait Schema$Service extends js.Object {
  /**
    * The business under which the service is offered. Ex.
    * &quot;businessEntities/GCP&quot;, &quot;businessEntities/Maps&quot;
    */
  var businessEntityName: js.UndefOr[String] = js.native
  /**
    * A human readable display name for this service.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The resource name for the service. Example:
    * &quot;services/DA34-426B-A397&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The identifier for the service. Example: &quot;DA34-426B-A397&quot;
    */
  var serviceId: js.UndefOr[String] = js.native
}

object Schema$Service {
  @scala.inline
  def apply(
    businessEntityName: String = null,
    displayName: String = null,
    name: String = null,
    serviceId: String = null
  ): Schema$Service = {
    val __obj = js.Dynamic.literal()
    if (businessEntityName != null) __obj.updateDynamic("businessEntityName")(businessEntityName.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Service]
  }
}

