package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonAccountIdAlt
import typings.gapiClientAdsense.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsResource extends js.Object {
  /** List the payments for the specified AdSense account. */
  def list(request: AnonAccountIdAlt): Request_[Payments] = js.native
  /** List the payments for this AdSense account. */
  def list(request: AnonFieldsKey): Request_[Payments] = js.native
}

