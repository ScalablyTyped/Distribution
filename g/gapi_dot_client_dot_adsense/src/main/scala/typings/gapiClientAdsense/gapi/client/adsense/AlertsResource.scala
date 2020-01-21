package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonAccountIdAlertId
import typings.gapiClientAdsense.AnonAccountIdAlt
import typings.gapiClientAdsense.AnonAlertId
import typings.gapiClientAdsense.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsResource extends js.Object {
  /** Dismiss (delete) the specified alert from the specified publisher AdSense account. */
  def delete(request: AnonAccountIdAlertId): Request_[Unit] = js.native
  /** Dismiss (delete) the specified alert from the publisher's AdSense account. */
  def delete(request: AnonAlertId): Request_[Unit] = js.native
  /** List the alerts for the specified AdSense account. */
  def list(request: AnonAccountIdAlt): Request_[Alerts] = js.native
  /** List the alerts for this AdSense account. */
  def list(request: AnonAltFields): Request_[Alerts] = js.native
}

