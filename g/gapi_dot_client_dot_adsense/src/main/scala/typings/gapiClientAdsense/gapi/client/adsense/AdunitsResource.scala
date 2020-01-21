package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonAccountIdAdClientIdAdUnitId
import typings.gapiClientAdsense.AnonAccountIdAdClientIdAltCustomChannelId
import typings.gapiClientAdsense.AnonAccountIdAdClientIdAltFieldsIncludeInactive
import typings.gapiClientAdsense.AnonAdClientIdAdUnitId
import typings.gapiClientAdsense.AnonAdClientIdAltCustomChannelId
import typings.gapiClientAdsense.AnonAdClientIdAltFieldsIncludeInactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsResource extends js.Object {
  var customchannels: CustomchannelsResource = js.native
  /** Gets the specified ad unit in the specified ad client for the specified account. */
  def get(request: AnonAccountIdAdClientIdAdUnitId): Request_[AdUnit] = js.native
  /** Gets the specified ad unit in the specified ad client. */
  def get(request: AnonAdClientIdAdUnitId): Request_[AdUnit] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: AnonAccountIdAdClientIdAdUnitId): Request_[AdCode] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: AnonAdClientIdAdUnitId): Request_[AdCode] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: AnonAccountIdAdClientIdAltCustomChannelId): Request_[AdUnits] = js.native
  /** List all ad units in the specified ad client for the specified account. */
  def list(request: AnonAccountIdAdClientIdAltFieldsIncludeInactive): Request_[AdUnits] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: AnonAdClientIdAltCustomChannelId): Request_[AdUnits] = js.native
  /** List all ad units in the specified ad client for this AdSense account. */
  def list(request: AnonAdClientIdAltFieldsIncludeInactive): Request_[AdUnits] = js.native
}

