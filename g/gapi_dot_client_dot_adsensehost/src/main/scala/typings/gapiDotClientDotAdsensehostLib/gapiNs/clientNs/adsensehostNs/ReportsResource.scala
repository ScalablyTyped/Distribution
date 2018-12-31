package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: gapiDotClientDotAdsensehostLib.Anon_EndDate): gapiDotClientLib.gapiNs.clientNs.Request[Report] = js.native
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: gapiDotClientDotAdsensehostLib.Anon_EndDateMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Report] = js.native
}

