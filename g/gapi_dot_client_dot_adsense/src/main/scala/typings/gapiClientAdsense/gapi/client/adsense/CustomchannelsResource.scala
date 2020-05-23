package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsense.anon.AdClientId
import typings.gapiClientAdsense.anon.AdUnitId
import typings.gapiClientAdsense.anon.CustomChannelId
import typings.gapiClientAdsense.anon.Fields
import typings.gapiClientAdsense.anon.Key
import typings.gapiClientAdsense.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  var adunits: AdunitsResource = js.native
  /** Get the specified custom channel from the specified ad client for the specified account. */
  def get(request: CustomChannelId): Request[CustomChannel] = js.native
  /** Get the specified custom channel from the specified ad client. */
  def get(request: Key): Request[CustomChannel] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: AdClientId): Request[CustomChannels] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: AdUnitId): Request[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for the specified account. */
  def list(request: Fields): Request[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for this AdSense account. */
  def list(request: MaxResults): Request[CustomChannels] = js.native
}

