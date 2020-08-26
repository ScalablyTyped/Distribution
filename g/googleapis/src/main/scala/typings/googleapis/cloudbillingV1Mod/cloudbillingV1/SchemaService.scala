package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates a single service in Google Cloud Platform.
  */
@js.native
trait SchemaService extends js.Object {
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

object SchemaService {
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  @scala.inline
  implicit class SchemaServiceOps[Self <: SchemaService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBusinessEntityName(value: String): Self = this.set("businessEntityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessEntityName: Self = this.set("businessEntityName", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
  }
  
}

