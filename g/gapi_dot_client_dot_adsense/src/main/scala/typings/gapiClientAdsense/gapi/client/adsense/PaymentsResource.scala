package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsense.anon.AccountIdAlt
import typings.gapiClientAdsense.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsResource extends js.Object {
  /** List the payments for the specified AdSense account. */
  def list(request: AccountIdAlt): Request[Payments] = js.native
  /** List the payments for this AdSense account. */
  def list(request: FieldsKey): Request[Payments] = js.native
}

