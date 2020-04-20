package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdmin.AnonDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerUsageReportsResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a specific customer. */
  def get(request: AnonDate): Request_[UsageReports]
}

object CustomerUsageReportsResource {
  @scala.inline
  def apply(get: AnonDate => Request_[UsageReports]): CustomerUsageReportsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[CustomerUsageReportsResource]
  }
}

