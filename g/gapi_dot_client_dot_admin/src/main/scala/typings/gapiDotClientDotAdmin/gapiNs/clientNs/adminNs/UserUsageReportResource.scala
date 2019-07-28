package typings.gapiDotClientDotAdmin.gapiNs.clientNs.adminNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdmin.Anon_AltCustomerIdDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUsageReportResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a set of users. */
  def get(request: Anon_AltCustomerIdDate): Request[UsageReports]
}

object UserUsageReportResource {
  @scala.inline
  def apply(get: Anon_AltCustomerIdDate => Request[UsageReports]): UserUsageReportResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[UserUsageReportResource]
  }
}

