package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityId extends js.Object {
  var applicationName: js.UndefOr[String] = js.undefined
  var customerId: js.UndefOr[String] = js.undefined
  var time: js.UndefOr[String] = js.undefined
  var uniqueQualifier: js.UndefOr[String] = js.undefined
}

object ActivityId {
  @scala.inline
  def apply(
    applicationName: String = null,
    customerId: String = null,
    time: String = null,
    uniqueQualifier: String = null
  ): ActivityId = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (uniqueQualifier != null) __obj.updateDynamic("uniqueQualifier")(uniqueQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityId]
  }
}

