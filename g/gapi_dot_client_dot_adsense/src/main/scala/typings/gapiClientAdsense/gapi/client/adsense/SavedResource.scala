package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonAccountId
import typings.gapiClientAdsense.AnonAccountIdAltFieldsKey
import typings.gapiClientAdsense.AnonAlt
import typings.gapiClientAdsense.AnonAltFieldsKeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedResource extends js.Object {
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonAccountIdAltFieldsKey): Request_[AdsenseReportsGenerateResponse] = js.native
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonAltFieldsKeyLocale): Request_[AdsenseReportsGenerateResponse] = js.native
  /** List all saved reports in the specified AdSense account. */
  def list(request: AnonAccountId): Request_[SavedReports] = js.native
  /** List all saved reports in this AdSense account. */
  def list(request: AnonAlt): Request_[SavedReports] = js.native
}

