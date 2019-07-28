package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupMembership extends js.Object {
  /**
    * The contact group ID for the contact group membership. The contact group
    * ID can be custom or predefined. Possible values include, but are not
    * limited to, the following:
    *
    * &#42;  `myContacts`
    * &#42;  `starred`
    * &#42;  A numerical ID for user-created groups.
    */
  var contactGroupId: js.UndefOr[String] = js.undefined
}

object ContactGroupMembership {
  @scala.inline
  def apply(contactGroupId: String = null): ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupId != null) __obj.updateDynamic("contactGroupId")(contactGroupId)
    __obj.asInstanceOf[ContactGroupMembership]
  }
}

