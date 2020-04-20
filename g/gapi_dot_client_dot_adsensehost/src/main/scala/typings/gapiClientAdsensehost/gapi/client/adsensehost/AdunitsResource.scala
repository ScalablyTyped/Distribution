package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsensehost.AnonAccountId
import typings.gapiClientAdsensehost.AnonAdUnitId
import typings.gapiClientAdsensehost.AnonHostCustomChannelId
import typings.gapiClientAdsensehost.AnonIncludeInactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdunitsResource extends js.Object {
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(request: AnonAdUnitId): Request_[AdUnit]
  /** Get the specified host ad unit in this AdSense account. */
  def get(request: AnonAdUnitId): Request_[AdUnit]
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(request: AnonHostCustomChannelId): Request_[AdCode]
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: AnonAccountId): Request_[AdUnit]
  /** List all ad units in the specified publisher's AdSense account. */
  def list(request: AnonIncludeInactive): Request_[AdUnits]
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: AnonAdUnitId): Request_[AdUnit]
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: AnonAccountId): Request_[AdUnit]
}

object AdunitsResource {
  @scala.inline
  def apply(
    delete: AnonAdUnitId => Request_[AdUnit],
    get: AnonAdUnitId => Request_[AdUnit],
    getAdCode: AnonHostCustomChannelId => Request_[AdCode],
    insert: AnonAccountId => Request_[AdUnit],
    list: AnonIncludeInactive => Request_[AdUnits],
    patch: AnonAdUnitId => Request_[AdUnit],
    update: AnonAccountId => Request_[AdUnit]
  ): AdunitsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAdCode = js.Any.fromFunction1(getAdCode), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdunitsResource]
  }
}

