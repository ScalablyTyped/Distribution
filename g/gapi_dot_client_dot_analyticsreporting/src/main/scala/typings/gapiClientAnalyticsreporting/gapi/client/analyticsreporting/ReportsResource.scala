package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalyticsreporting.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Returns the Analytics data. */
  def batchGet(request: AnonAccesstoken): Request_[GetReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(batchGet: AnonAccesstoken => Request_[GetReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
    __obj.asInstanceOf[ReportsResource]
  }
}

