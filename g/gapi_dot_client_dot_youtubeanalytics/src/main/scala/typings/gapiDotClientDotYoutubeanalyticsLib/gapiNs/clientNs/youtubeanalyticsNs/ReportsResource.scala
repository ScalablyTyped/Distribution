package typings
package gapiDotClientDotYoutubeanalyticsLib.gapiNs.clientNs.youtubeanalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieve your YouTube Analytics reports. */
  def query(request: gapiDotClientDotYoutubeanalyticsLib.Anon_AltCurrency): gapiDotClientLib.gapiNs.clientNs.Request[ResultTable]
}

object ReportsResource {
  @scala.inline
  def apply(
    query: gapiDotClientDotYoutubeanalyticsLib.Anon_AltCurrency => gapiDotClientLib.gapiNs.clientNs.Request[ResultTable]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

