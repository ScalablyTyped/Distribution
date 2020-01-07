package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google contact group membership.
  */
@js.native
trait Schema$ContactGroupMembership extends js.Object {
  /**
    * The contact group ID for the contact group membership. The contact group
    * ID can be custom or one of these predefined values:  *  `myContacts` *
    * `starred` *  A numerical ID for user-created groups.
    */
  var contactGroupId: js.UndefOr[String] = js.native
}

object Schema$ContactGroupMembership {
  @scala.inline
  def apply(contactGroupId: String = null): Schema$ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupId != null) __obj.updateDynamic("contactGroupId")(contactGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ContactGroupMembership]
  }
}

