package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsense.anon.AccountId
import typings.gapiClientAdsense.anon.Alt
import typings.gapiClientAdsense.anon.SavedReportId
import typings.gapiClientAdsense.anon.StartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedResource extends js.Object {
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: SavedReportId): Request[AdsenseReportsGenerateResponse] = js.native
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: StartIndex): Request[AdsenseReportsGenerateResponse] = js.native
  /** List all saved reports in the specified AdSense account. */
  def list(request: AccountId): Request[SavedReports] = js.native
  /** List all saved reports in this AdSense account. */
  def list(request: Alt): Request[SavedReports] = js.native
}

