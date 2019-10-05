package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  /**
    * Timestamp when the Organization was created. Assigned by the server.
    * @OutputOnly
    */
  var creationTime: js.UndefOr[String] = js.undefined
  /**
    * A friendly string to be used to refer to the Organization in the UI.
    * Assigned by the server, set to the primary domain of the G Suite
    * customer that owns the organization.
    * @OutputOnly
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The organization's current lifecycle state. Assigned by the server.
    * @OutputOnly
    */
  var lifecycleState: js.UndefOr[String] = js.undefined
  /**
    * Output Only. The resource name of the organization. This is the
    * organization's relative path in the API. Its format is
    * "organizations/[organization_id]". For example, "organizations/1234".
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The owner of this Organization. The owner should be specified on
    * creation. Once set, it cannot be changed.
    * This field is required.
    */
  var owner: js.UndefOr[OrganizationOwner] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    creationTime: String = null,
    displayName: String = null,
    lifecycleState: String = null,
    name: String = null,
    owner: OrganizationOwner = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (lifecycleState != null) __obj.updateDynamic("lifecycleState")(lifecycleState)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[Organization]
  }
}

