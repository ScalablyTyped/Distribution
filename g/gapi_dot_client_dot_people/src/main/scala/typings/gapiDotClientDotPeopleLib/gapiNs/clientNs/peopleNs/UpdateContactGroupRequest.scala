package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContactGroupRequest extends js.Object {
  /** The contact group to update. */
  var contactGroup: js.UndefOr[ContactGroup] = js.undefined
}

object UpdateContactGroupRequest {
  @scala.inline
  def apply(contactGroup: ContactGroup = null): UpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup)
    __obj.asInstanceOf[UpdateContactGroupRequest]
  }
}

