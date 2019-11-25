package typings.gapiDotClientDotPeople.gapi.client.people

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
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactGroupRequest]
  }
}

