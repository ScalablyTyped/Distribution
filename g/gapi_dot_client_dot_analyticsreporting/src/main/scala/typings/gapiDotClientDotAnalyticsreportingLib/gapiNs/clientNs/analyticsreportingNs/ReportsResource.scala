package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Returns the Analytics data. */
  def batchGet(request: gapiDotClientDotAnalyticsreportingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GetReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(
    batchGet: gapiDotClientDotAnalyticsreportingLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[GetReportsResponse]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

