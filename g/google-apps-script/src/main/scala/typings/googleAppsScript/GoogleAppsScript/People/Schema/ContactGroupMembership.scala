package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupMembership extends js.Object {
  var contactGroupId: js.UndefOr[String] = js.undefined
}

object ContactGroupMembership {
  @scala.inline
  def apply(contactGroupId: String = null): ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupId != null) __obj.updateDynamic("contactGroupId")(contactGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactGroupMembership]
  }
}

