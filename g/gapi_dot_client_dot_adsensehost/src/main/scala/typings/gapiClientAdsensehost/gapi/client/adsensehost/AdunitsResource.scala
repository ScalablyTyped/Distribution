package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.AccountId
import typings.gapiClientAdsensehost.anon.AdUnitId
import typings.gapiClientAdsensehost.anon.HostCustomChannelId
import typings.gapiClientAdsensehost.anon.IncludeInactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdunitsResource extends js.Object {
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(request: AdUnitId): Request[AdUnit]
  /** Get the specified host ad unit in this AdSense account. */
  def get(request: AdUnitId): Request[AdUnit]
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(request: HostCustomChannelId): Request[AdCode]
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: AccountId): Request[AdUnit]
  /** List all ad units in the specified publisher's AdSense account. */
  def list(request: IncludeInactive): Request[AdUnits]
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: AdUnitId): Request[AdUnit]
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: AccountId): Request[AdUnit]
}

object AdunitsResource {
  @scala.inline
  def apply(
    delete: AdUnitId => Request[AdUnit],
    get: AdUnitId => Request[AdUnit],
    getAdCode: HostCustomChannelId => Request[AdCode],
    insert: AccountId => Request[AdUnit],
    list: IncludeInactive => Request[AdUnits],
    patch: AdUnitId => Request[AdUnit],
    update: AccountId => Request[AdUnit]
  ): AdunitsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAdCode = js.Any.fromFunction1(getAdCode), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdunitsResource]
  }
}

