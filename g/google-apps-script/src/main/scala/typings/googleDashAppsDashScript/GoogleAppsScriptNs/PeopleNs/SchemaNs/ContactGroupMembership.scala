package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs

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
    if (contactGroupId != null) __obj.updateDynamic("contactGroupId")(contactGroupId)
    __obj.asInstanceOf[ContactGroupMembership]
  }
}

