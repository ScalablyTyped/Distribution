package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsensehost.Anon_AccountId
import typings.gapiDotClientDotAdsensehost.Anon_AccountIdAdClientId
import typings.gapiDotClientDotAdsensehost.Anon_AccountIdAdClientIdAdUnitId
import typings.gapiDotClientDotAdsensehost.Anon_AccountIdAdClientIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdunitsResource extends js.Object {
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(request: Anon_AccountIdAdClientId): Request[AdUnit]
  /** Get the specified host ad unit in this AdSense account. */
  def get(request: Anon_AccountIdAdClientId): Request[AdUnit]
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(request: Anon_AccountIdAdClientIdAdUnitId): Request[AdCode]
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: Anon_AccountId): Request[AdUnit]
  /** List all ad units in the specified publisher's AdSense account. */
  def list(request: Anon_AccountIdAdClientIdAlt): Request[AdUnits]
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAdClientId): Request[AdUnit]
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: Anon_AccountId): Request[AdUnit]
}

object AdunitsResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAdClientId => Request[AdUnit],
    get: Anon_AccountIdAdClientId => Request[AdUnit],
    getAdCode: Anon_AccountIdAdClientIdAdUnitId => Request[AdCode],
    insert: Anon_AccountId => Request[AdUnit],
    list: Anon_AccountIdAdClientIdAlt => Request[AdUnits],
    patch: Anon_AccountIdAdClientId => Request[AdUnit],
    update: Anon_AccountId => Request[AdUnit]
  ): AdunitsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAdCode = js.Any.fromFunction1(getAdCode), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdunitsResource]
  }
}

