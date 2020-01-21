package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

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
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (groupByEmail != null) __obj.updateDynamic("groupByEmail")(groupByEmail.asInstanceOf[js.Any])
    if (iamMember != null) __obj.updateDynamic("iamMember")(iamMember.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (specialGroup != null) __obj.updateDynamic("specialGroup")(specialGroup.asInstanceOf[js.Any])
    if (userByEmail != null) __obj.updateDynamic("userByEmail")(userByEmail.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetAccess]
  }
}

