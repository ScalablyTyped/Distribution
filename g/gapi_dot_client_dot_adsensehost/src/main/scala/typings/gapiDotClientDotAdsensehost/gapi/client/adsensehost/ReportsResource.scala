package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsensehost.Anon_AccountIdAltDimension
import typings.gapiDotClientDotAdsensehost.Anon_AltDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: Anon_AccountIdAltDimension): Request[Report] = js.native
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: Anon_AltDimension): Request[Report] = js.native
}

