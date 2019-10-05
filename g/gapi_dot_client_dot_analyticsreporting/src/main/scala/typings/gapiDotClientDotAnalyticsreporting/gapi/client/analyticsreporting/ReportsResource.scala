package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalyticsreporting.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Returns the Analytics data. */
  def batchGet(request: Anon_Accesstoken): Request[GetReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(batchGet: Anon_Accesstoken => Request[GetReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

