package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetAccess extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var groupByEmail: js.UndefOr[String] = js.undefined
  var iamMember: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var specialGroup: js.UndefOr[String] = js.undefined
  var userByEmail: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[TableReference] = js.undefined
}

object DatasetAccess {
  @scala.inline
  def apply(
    domain: String = null,
    groupByEmail: String = null,
    iamMember: String = null,
    role: String = null,
    specialGroup: String = null,
    userByEmail: String = null,
    view: TableReference = null
  ): DatasetAccess = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (groupByEmail != null) __obj.updateDynamic("groupByEmail")(groupByEmail)
    if (iamMember != null) __obj.updateDynamic("iamMember")(iamMember)
    if (role != null) __obj.updateDynamic("role")(role)
    if (specialGroup != null) __obj.updateDynamic("specialGroup")(specialGroup)
    if (userByEmail != null) __obj.updateDynamic("userByEmail")(userByEmail)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DatasetAccess]
  }
}

