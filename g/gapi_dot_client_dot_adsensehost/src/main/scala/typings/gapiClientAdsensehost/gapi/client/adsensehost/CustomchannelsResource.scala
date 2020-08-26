package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdsensehost.anon.AdClientId
import typings.gapiClientAdsensehost.anon.CustomChannelId
import typings.gapiClientAdsensehost.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  /** Delete a specific custom channel from the host AdSense account. */
  def delete(request: CustomChannelId): Request[CustomChannel] = js.native
  /** Get a specific custom channel from the host AdSense account. */
  def get(request: CustomChannelId): Request[CustomChannel] = js.native
  /** Add a new custom channel to the host AdSense account. */
  def insert(request: AdClientId): Request[CustomChannel] = js.native
  /** List all host custom channels in this AdSense account. */
  def list(request: MaxResults): Request[CustomChannels] = js.native
  /** Update a custom channel in the host AdSense account. This method supports patch semantics. */
  def patch(request: CustomChannelId): Request[CustomChannel] = js.native
  /** Update a custom channel in the host AdSense account. */
  def update(request: AdClientId): Request[CustomChannel] = js.native
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    delete: CustomChannelId => Request[CustomChannel],
    get: CustomChannelId => Request[CustomChannel],
    insert: AdClientId => Request[CustomChannel],
    list: MaxResults => Request[CustomChannels],
    patch: CustomChannelId => Request[CustomChannel],
    update: AdClientId => Request[CustomChannel]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomchannelsResource]
  }
  @scala.inline
  implicit class CustomchannelsResourceOps[Self <: CustomchannelsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: CustomChannelId => Request[CustomChannel]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: CustomChannelId => Request[CustomChannel]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AdClientId => Request[CustomChannel]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[CustomChannels]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: CustomChannelId => Request[CustomChannel]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: AdClientId => Request[CustomChannel]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

