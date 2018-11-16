package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  var saved: SavedResource = js.native
  /**
               * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
               * specify "alt=csv" as a query parameter.
               */
  def generate(request: gapiDotClientDotAdsenseLib.Anon_EndDate): gapiDotClientLib.gapiNs.clientNs.Request[AdsenseReportsGenerateResponse] = js.native
  /**
               * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
               * specify "alt=csv" as a query parameter.
               */
  def generate(request: gapiDotClientDotAdsenseLib.Anon_EndDateMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[AdsenseReportsGenerateResponse] = js.native
}

