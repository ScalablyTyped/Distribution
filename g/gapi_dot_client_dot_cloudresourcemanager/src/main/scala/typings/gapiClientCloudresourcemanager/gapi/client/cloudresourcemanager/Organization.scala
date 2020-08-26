package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  /**
    * Timestamp when the Organization was created. Assigned by the server.
    * @OutputOnly
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * A friendly string to be used to refer to the Organization in the UI.
    * Assigned by the server, set to the primary domain of the G Suite
    * customer that owns the organization.
    * @OutputOnly
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The organization's current lifecycle state. Assigned by the server.
    * @OutputOnly
    */
  var lifecycleState: js.UndefOr[String] = js.native
  /**
    * Output Only. The resource name of the organization. This is the
    * organization's relative path in the API. Its format is
    * "organizations/[organization_id]". For example, "organizations/1234".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of this Organization. The owner should be specified on
    * creation. Once set, it cannot be changed.
    * This field is required.
    */
  var owner: js.UndefOr[OrganizationOwner] = js.native
}

object Organization {
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  @scala.inline
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLifecycleState(value: String): Self = this.set("lifecycleState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleState: Self = this.set("lifecycleState", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: OrganizationOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

