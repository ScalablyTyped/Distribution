package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyContactGroupMembersRequest extends js.Object {
  var resourceNamesToAdd: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var resourceNamesToRemove: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ModifyContactGroupMembersRequest {
  @scala.inline
  def apply(
    resourceNamesToAdd: js.Array[java.lang.String] = null,
    resourceNamesToRemove: js.Array[java.lang.String] = null
  ): ModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (resourceNamesToAdd != null) __obj.updateDynamic("resourceNamesToAdd")(resourceNamesToAdd)
    if (resourceNamesToRemove != null) __obj.updateDynamic("resourceNamesToRemove")(resourceNamesToRemove)
    __obj.asInstanceOf[ModifyContactGroupMembersRequest]
  }
}

