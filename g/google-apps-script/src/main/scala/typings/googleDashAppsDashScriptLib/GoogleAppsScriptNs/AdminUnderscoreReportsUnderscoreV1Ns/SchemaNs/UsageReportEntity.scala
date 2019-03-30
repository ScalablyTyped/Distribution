package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReportEntity extends js.Object {
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  var entityId: js.UndefOr[java.lang.String] = js.undefined
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var userEmail: js.UndefOr[java.lang.String] = js.undefined
}

object UsageReportEntity {
  @scala.inline
  def apply(
    customerId: java.lang.String = null,
    entityId: java.lang.String = null,
    profileId: java.lang.String = null,
    `type`: java.lang.String = null,
    userEmail: java.lang.String = null
  ): UsageReportEntity = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail)
    __obj.asInstanceOf[UsageReportEntity]
  }
}

