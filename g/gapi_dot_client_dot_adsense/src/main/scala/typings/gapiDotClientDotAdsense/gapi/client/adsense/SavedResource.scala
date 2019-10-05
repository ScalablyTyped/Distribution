package typings.gapiDotClientDotAdsense.gapi.client.adsense

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsense.Anon_AccountId
import typings.gapiDotClientDotAdsense.Anon_AccountIdAltFieldsKey
import typings.gapiDotClientDotAdsense.Anon_Alt
import typings.gapiDotClientDotAdsense.Anon_AltFieldsKeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedResource extends js.Object {
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: Anon_AccountIdAltFieldsKey): Request[AdsenseReportsGenerateResponse] = js.native
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: Anon_AltFieldsKeyLocale): Request[AdsenseReportsGenerateResponse] = js.native
  /** List all saved reports in the specified AdSense account. */
  def list(request: Anon_AccountId): Request[SavedReports] = js.native
  /** List all saved reports in this AdSense account. */
  def list(request: Anon_Alt): Request[SavedReports] = js.native
}

