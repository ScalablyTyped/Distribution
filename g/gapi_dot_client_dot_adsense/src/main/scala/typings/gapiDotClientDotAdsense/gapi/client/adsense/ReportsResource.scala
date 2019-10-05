package typings.gapiDotClientDotAdsense.gapi.client.adsense

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsense.Anon_AccountIdAltCurrency
import typings.gapiDotClientDotAdsense.Anon_AccountIdAltCurrencyDimension
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
  def generate(request: Anon_AccountIdAltCurrency): Request[AdsenseReportsGenerateResponse] = js.native
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: Anon_AccountIdAltCurrencyDimension): Request[AdsenseReportsGenerateResponse] = js.native
}

