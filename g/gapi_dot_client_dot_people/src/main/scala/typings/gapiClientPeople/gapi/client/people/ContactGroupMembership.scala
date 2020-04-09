package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupMembership extends js.Object {
  /** Output only. The contact group ID for the contact group membership. */
  var contactGroupId: js.UndefOr[String] = js.undefined
  /**
    * The resource name for the contact group, assigned by the server. An ASCII
    * string, in the form of `contactGroups/{contact_group_id}`.
    * Only contact_group_resource_name can be used for modifying memberships.
    * Any contact group membership can be removed, but only user group or
    * "myContacts" or "starred" system groups memberships can be added. A
    * contact must always have at least one contact group membership.
    */
  var contactGroupResourceName: js.UndefOr[String] = js.undefined
}

object ContactGroupMembership {
  @scala.inline
  def apply(contactGroupId: String = null, contactGroupResourceName: String = null): ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupId != null) __obj.updateDynamic("contactGroupId")(contactGroupId.asInstanceOf[js.Any])
    if (contactGroupResourceName != null) __obj.updateDynamic("contactGroupResourceName")(contactGroupResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactGroupMembership]
  }
}

