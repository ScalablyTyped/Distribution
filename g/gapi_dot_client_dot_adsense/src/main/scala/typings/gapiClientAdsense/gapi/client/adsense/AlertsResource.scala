package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsense.anon.AlertId
import typings.gapiClientAdsense.anon.AlertIdAlt
import typings.gapiClientAdsense.anon.AltFields
import typings.gapiClientAdsense.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsResource extends js.Object {
  /** Dismiss (delete) the specified alert from the specified publisher AdSense account. */
  def delete(request: AlertId): Request[Unit] = js.native
  /** Dismiss (delete) the specified alert from the publisher's AdSense account. */
  def delete(request: AlertIdAlt): Request[Unit] = js.native
  /** List the alerts for this AdSense account. */
  def list(request: AltFields): Request[Alerts] = js.native
  /** List the alerts for the specified AdSense account. */
  def list(request: Locale): Request[Alerts] = js.native
}

