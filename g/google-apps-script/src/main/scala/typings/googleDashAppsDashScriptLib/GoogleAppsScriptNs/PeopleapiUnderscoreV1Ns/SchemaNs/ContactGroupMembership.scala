package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupMembership extends js.Object {
  var contactGroupId: js.UndefOr[java.lang.String] = js.undefined
}

object ContactGroupMembership {
  @scala.inline
  def apply(contactGroupId: java.lang.String = null): ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupId != null) __obj.updateDynamic("contactGroupId")(contactGroupId)
    __obj.asInstanceOf[ContactGroupMembership]
  }
}

