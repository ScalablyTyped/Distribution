package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUsageReportResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a set of users. */
  def get(request: gapiDotClientDotAdminLib.Anon_AltCustomerIdDate): gapiDotClientLib.gapiNs.clientNs.Request[UsageReports]
}

object UserUsageReportResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAdminLib.Anon_AltCustomerIdDate, 
      gapiDotClientLib.gapiNs.clientNs.Request[UsageReports]
    ]
  ): UserUsageReportResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[UserUsageReportResource]
  }
}

