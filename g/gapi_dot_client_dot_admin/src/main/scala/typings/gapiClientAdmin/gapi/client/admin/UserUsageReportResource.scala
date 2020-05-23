package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdmin.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUsageReportResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a set of users. */
  def get(request: Fields): Request[UsageReports]
}

object UserUsageReportResource {
  @scala.inline
  def apply(get: Fields => Request[UsageReports]): UserUsageReportResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[UserUsageReportResource]
  }
}

