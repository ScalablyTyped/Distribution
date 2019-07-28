package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContactGroupRequest extends js.Object {
  /** The contact group to create. */
  var contactGroup: js.UndefOr[ContactGroup] = js.undefined
}

object CreateContactGroupRequest {
  @scala.inline
  def apply(contactGroup: ContactGroup = null): CreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup)
    __obj.asInstanceOf[CreateContactGroupRequest]
  }
}

