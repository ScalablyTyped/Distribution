package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsCollection extends js.Object {
  // Returns the Analytics data.
  def batchGet(resource: GetReportsRequest): GetReportsResponse
}

object ReportsCollection {
  @scala.inline
  def apply(batchGet: GetReportsRequest => GetReportsResponse): ReportsCollection = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
  
    __obj.asInstanceOf[ReportsCollection]
  }
}

