package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The root node in the resource hierarchy to which a particular entity&#39;s
  * (e.g., company) resources belong.
  */
@js.native
trait SchemaOrganization extends js.Object {
  /**
    * Timestamp when the Organization was created. Assigned by the server.
    * @OutputOnly
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * A human-readable string that refers to the Organization in the GCP
    * Console UI. This string is set by the server and cannot be changed. The
    * string will be set to the primary domain (for example,
    * &quot;google.com&quot;) of the G Suite customer that owns the
    * organization. @OutputOnly
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The organization&#39;s current lifecycle state. Assigned by the server.
    * @OutputOnly
    */
  var lifecycleState: js.UndefOr[String] = js.native
  /**
    * Output Only. The resource name of the organization. This is the
    * organization&#39;s relative path in the API. Its format is
    * &quot;organizations/[organization_id]&quot;. For example,
    * &quot;organizations/1234&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An immutable id for the Organization that is assigned on creation. This
    * should be omitted when creating a new Organization. This field is
    * read-only.
    */
  var organizationId: js.UndefOr[String] = js.native
  /**
    * The owner of this Organization. The owner should be specified on
    * creation. Once set, it cannot be changed. This field is required.
    */
  var owner: js.UndefOr[SchemaOrganizationOwner] = js.native
}

object SchemaOrganization {
  @scala.inline
  def apply(): SchemaOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganization]
  }
  @scala.inline
  implicit class SchemaOrganizationOps[Self <: SchemaOrganization] (val x: Self) extends AnyVal {
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
    def setOrganizationId(value: String): Self = this.set("organizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationId: Self = this.set("organizationId", js.undefined)
    @scala.inline
    def setOwner(value: SchemaOrganizationOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

