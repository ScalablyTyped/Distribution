package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.AccountId
import typings.gapiClientAdsensehost.anon.AdUnitId
import typings.gapiClientAdsensehost.anon.HostCustomChannelId
import typings.gapiClientAdsensehost.anon.IncludeInactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsResource extends js.Object {
  /** Delete the specified ad unit from the specified publisher AdSense account. */
  def delete(request: AdUnitId): Request[AdUnit] = js.native
  /** Get the specified host ad unit in this AdSense account. */
  def get(request: AdUnitId): Request[AdUnit] = js.native
  /** Get ad code for the specified ad unit, attaching the specified host custom channels. */
  def getAdCode(request: HostCustomChannelId): Request[AdCode] = js.native
  /** Insert the supplied ad unit into the specified publisher AdSense account. */
  def insert(request: AccountId): Request[AdUnit] = js.native
  /** List all ad units in the specified publisher's AdSense account. */
  def list(request: IncludeInactive): Request[AdUnits] = js.native
  /** Update the supplied ad unit in the specified publisher AdSense account. This method supports patch semantics. */
  def patch(request: AdUnitId): Request[AdUnit] = js.native
  /** Update the supplied ad unit in the specified publisher AdSense account. */
  def update(request: AccountId): Request[AdUnit] = js.native
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
  @scala.inline
  implicit class AdunitsResourceOps[Self <: AdunitsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: AdUnitId => Request[AdUnit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AdUnitId => Request[AdUnit]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAdCode(value: HostCustomChannelId => Request[AdCode]): Self = this.set("getAdCode", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AccountId => Request[AdUnit]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: IncludeInactive => Request[AdUnits]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: AdUnitId => Request[AdUnit]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: AccountId => Request[AdUnit]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

