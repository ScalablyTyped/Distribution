package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalyticsreporting.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Returns the Analytics data. */
  def batchGet(request: Accesstoken): Request[GetReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(batchGet: Accesstoken => Request[GetReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
    __obj.asInstanceOf[ReportsResource]
  }
}

