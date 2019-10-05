package typings.gapiDotClientDotAdsense.gapi.client.adsense

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsense.Anon_AccountIdAltFields
import typings.gapiDotClientDotAdsense.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsResource extends js.Object {
  /** List the payments for the specified AdSense account. */
  def list(request: Anon_AccountIdAltFields): Request[Payments] = js.native
  /** List the payments for this AdSense account. */
  def list(request: Anon_AltFieldsKey): Request[Payments] = js.native
}

