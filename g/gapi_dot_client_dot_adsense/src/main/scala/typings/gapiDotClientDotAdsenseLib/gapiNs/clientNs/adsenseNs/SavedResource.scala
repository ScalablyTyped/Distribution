package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedResource extends js.Object {
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: gapiDotClientDotAdsenseLib.Anon_MaxResultsPrettyPrintAccountId): gapiDotClientLib.gapiNs.clientNs.Request[AdsenseReportsGenerateResponse] = js.native
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: gapiDotClientDotAdsenseLib.Anon_MaxResultsPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[AdsenseReportsGenerateResponse] = js.native
  /** List all saved reports in this AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[SavedReports] = js.native
  /** List all saved reports in the specified AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_MaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[SavedReports] = js.native
}

