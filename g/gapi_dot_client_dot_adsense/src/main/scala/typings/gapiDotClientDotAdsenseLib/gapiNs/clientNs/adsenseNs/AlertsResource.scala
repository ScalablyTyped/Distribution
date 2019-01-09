package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsResource extends js.Object {
  /** Dismiss (delete) the specified alert from the specified publisher AdSense account. */
  def delete(request: gapiDotClientDotAdsenseLib.Anon_AccountIdAlertId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit] = js.native
  /** Dismiss (delete) the specified alert from the publisher's AdSense account. */
  def delete(request: gapiDotClientDotAdsenseLib.Anon_AlertId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit] = js.native
  /** List the alerts for the specified AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[Alerts] = js.native
  /** List the alerts for this AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Alerts] = js.native
}

