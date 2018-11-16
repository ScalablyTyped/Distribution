package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsResource extends js.Object {
  var customchannels: CustomchannelsResource = js.native
  /** Gets the specified ad unit in the specified ad client for the specified account. */
  def get(request: gapiDotClientDotAdsenseLib.Anon_PrettyPrintAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[AdUnit] = js.native
  /** Gets the specified ad unit in the specified ad client. */
  def get(request: gapiDotClientDotAdsenseLib.Anon_PrettyPrintAdClientIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[AdUnit] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: gapiDotClientDotAdsenseLib.Anon_PrettyPrintAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[AdCode] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: gapiDotClientDotAdsenseLib.Anon_PrettyPrintAdClientIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[AdCode] = js.native
  /** List all ad units in the specified ad client for the specified account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_MaxResultsPrettyPrintAdClientIdIncludeInactive): gapiDotClientLib.gapiNs.clientNs.Request[AdUnits] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_MaxResultsPrettyPrintAdClientIdIncludeInactivePageToken): gapiDotClientLib.gapiNs.clientNs.Request[AdUnits] = js.native
  /** List all ad units in the specified ad client for this AdSense account. */
  def list(
    request: gapiDotClientDotAdsenseLib.Anon_MaxResultsPrettyPrintAdClientIdIncludeInactivePageTokenQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[AdUnits] = js.native
  /** List all ad units in the specified custom channel. */
  def list(
    request: gapiDotClientDotAdsenseLib.Anon_MaxResultsPrettyPrintAdClientIdIncludeInactivePageTokenQuotaUserKey
  ): gapiDotClientLib.gapiNs.clientNs.Request[AdUnits] = js.native
}

