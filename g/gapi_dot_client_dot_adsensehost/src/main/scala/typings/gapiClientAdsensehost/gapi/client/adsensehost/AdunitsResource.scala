package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsensehost.AnonAccountId
import typings.gapiClientAdsensehost.AnonAccountIdAdClientId
import typings.gapiClientAdsensehost.AnonAccountIdAdClientIdAdUnitId
import typings.gapiClientAdsensehost.AnonAccountIdAdClientIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdunitsResource extends js.Object {
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(request: AnonAccountIdAdClientId): Request_[AdUnit]
  /** Get the specified host ad unit in this AdSense account. */
  def get(request: AnonAccountIdAdClientId): Request_[AdUnit]
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(request: AnonAccountIdAdClientIdAdUnitId): Request_[AdCode]
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: AnonAccountId): Request_[AdUnit]
  /** List all ad units in the specified publisher's AdSense account. */
  def list(request: AnonAccountIdAdClientIdAlt): Request_[AdUnits]
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: AnonAccountIdAdClientId): Request_[AdUnit]
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: AnonAccountId): Request_[AdUnit]
}

object AdunitsResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAdClientId => Request_[AdUnit],
    get: AnonAccountIdAdClientId => Request_[AdUnit],
    getAdCode: AnonAccountIdAdClientIdAdUnitId => Request_[AdCode],
    insert: AnonAccountId => Request_[AdUnit],
    list: AnonAccountIdAdClientIdAlt => Request_[AdUnits],
    patch: AnonAccountIdAdClientId => Request_[AdUnit],
    update: AnonAccountId => Request_[AdUnit]
  ): AdunitsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAdCode = js.Any.fromFunction1(getAdCode), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdunitsResource]
  }
}

