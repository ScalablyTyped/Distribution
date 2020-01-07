package typings.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The root node in the resource hierarchy to which a particular entity&#39;s
  * (e.g., company) resources belong.
  */
@js.native
trait Schema$Organization extends js.Object {
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
  var owner: js.UndefOr[Schema$OrganizationOwner] = js.native
}

object Schema$Organization {
  @scala.inline
  def apply(
    creationTime: String = null,
    displayName: String = null,
    lifecycleState: String = null,
    name: String = null,
    organizationId: String = null,
    owner: Schema$OrganizationOwner = null
  ): Schema$Organization = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (lifecycleState != null) __obj.updateDynamic("lifecycleState")(lifecycleState.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (organizationId != null) __obj.updateDynamic("organizationId")(organizationId.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Organization]
  }
}

