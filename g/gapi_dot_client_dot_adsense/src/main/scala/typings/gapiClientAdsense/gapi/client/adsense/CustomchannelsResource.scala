package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonAccountIdAdClientId
import typings.gapiClientAdsense.AnonAccountIdAdClientIdAlt
import typings.gapiClientAdsense.AnonAccountIdAdClientIdAltFields
import typings.gapiClientAdsense.AnonAdClientId
import typings.gapiClientAdsense.AnonAdClientIdAlt
import typings.gapiClientAdsense.AnonAdClientIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  var adunits: AdunitsResource = js.native
  /** Get the specified custom channel from the specified ad client for the specified account. */
  def get(request: AnonAccountIdAdClientIdAlt): Request_[CustomChannel] = js.native
  /** Get the specified custom channel from the specified ad client. */
  def get(request: AnonAdClientIdAlt): Request_[CustomChannel] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: AnonAccountIdAdClientId): Request_[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for the specified account. */
  def list(request: AnonAccountIdAdClientIdAltFields): Request_[CustomChannels] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: AnonAdClientId): Request_[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for this AdSense account. */
  def list(request: AnonAdClientIdAltFields): Request_[CustomChannels] = js.native
}

