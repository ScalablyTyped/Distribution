package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyContactGroupMembersRequest extends js.Object {
  var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.undefined
  var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.undefined
}

object ModifyContactGroupMembersRequest {
  @scala.inline
  def apply(resourceNamesToAdd: js.Array[String] = null, resourceNamesToRemove: js.Array[String] = null): ModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (resourceNamesToAdd != null) __obj.updateDynamic("resourceNamesToAdd")(resourceNamesToAdd)
    if (resourceNamesToRemove != null) __obj.updateDynamic("resourceNamesToRemove")(resourceNamesToRemove)
    __obj.asInstanceOf[ModifyContactGroupMembersRequest]
  }
}

