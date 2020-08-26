package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AdvertiserId
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdsResource extends js.Object {
  /** Gets one ad by ID. */
  def get(request: Fields): Request[Ad] = js.native
  /** Inserts a new ad. */
  def insert(request: Key): Request[Ad] = js.native
  /** Retrieves a list of ads, possibly filtered. This method supports paging. */
  def list(request: AdvertiserId): Request[AdsListResponse] = js.native
  /** Updates an existing ad. This method supports patch semantics. */
  def patch(request: Fields): Request[Ad] = js.native
  /** Updates an existing ad. */
  def update(request: Key): Request[Ad] = js.native
}

object AdsResource {
  @scala.inline
  def apply(
    get: Fields => Request[Ad],
    insert: Key => Request[Ad],
    list: AdvertiserId => Request[AdsListResponse],
    patch: Fields => Request[Ad],
    update: Key => Request[Ad]
  ): AdsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdsResource]
  }
  @scala.inline
  implicit class AdsResourceOps[Self <: AdsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[Ad]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Ad]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AdvertiserId => Request[AdsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Ad]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Ad]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

