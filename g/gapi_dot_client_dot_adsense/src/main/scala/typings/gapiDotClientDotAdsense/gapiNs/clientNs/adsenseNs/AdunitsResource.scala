package typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdsense.Anon_AccountIdAdClientIdAdUnitId
import typings.gapiDotClientDotAdsense.Anon_AccountIdAdClientIdAltCustomChannelId
import typings.gapiDotClientDotAdsense.Anon_AccountIdAdClientIdAltFieldsIncludeInactive
import typings.gapiDotClientDotAdsense.Anon_AdClientIdAdUnitId
import typings.gapiDotClientDotAdsense.Anon_AdClientIdAltCustomChannelId
import typings.gapiDotClientDotAdsense.Anon_AdClientIdAltFieldsIncludeInactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsResource extends js.Object {
  var customchannels: CustomchannelsResource = js.native
  /** Gets the specified ad unit in the specified ad client for the specified account. */
  def get(request: Anon_AccountIdAdClientIdAdUnitId): Request[AdUnit] = js.native
  /** Gets the specified ad unit in the specified ad client. */
  def get(request: Anon_AdClientIdAdUnitId): Request[AdUnit] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: Anon_AccountIdAdClientIdAdUnitId): Request[AdCode] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: Anon_AdClientIdAdUnitId): Request[AdCode] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: Anon_AccountIdAdClientIdAltCustomChannelId): Request[AdUnits] = js.native
  /** List all ad units in the specified ad client for the specified account. */
  def list(request: Anon_AccountIdAdClientIdAltFieldsIncludeInactive): Request[AdUnits] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: Anon_AdClientIdAltCustomChannelId): Request[AdUnits] = js.native
  /** List all ad units in the specified ad client for this AdSense account. */
  def list(request: Anon_AdClientIdAltFieldsIncludeInactive): Request[AdUnits] = js.native
}

