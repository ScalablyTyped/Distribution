package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AdvertiserIds
import typings.gapiClientDfareporting.anon.DefaultLandingPageName
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignsResource extends js.Object {
  /** Gets one campaign by ID. */
  def get(request: Fields): Request[Campaign] = js.native
  /** Inserts a new campaign. */
  def insert(request: DefaultLandingPageName): Request[Campaign] = js.native
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(request: AdvertiserIds): Request[CampaignsListResponse] = js.native
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: Fields): Request[Campaign] = js.native
  /** Updates an existing campaign. */
  def update(request: Key): Request[Campaign] = js.native
}

object CampaignsResource {
  @scala.inline
  def apply(
    get: Fields => Request[Campaign],
    insert: DefaultLandingPageName => Request[Campaign],
    list: AdvertiserIds => Request[CampaignsListResponse],
    patch: Fields => Request[Campaign],
    update: Key => Request[Campaign]
  ): CampaignsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CampaignsResource]
  }
  @scala.inline
  implicit class CampaignsResourceOps[Self <: CampaignsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[Campaign]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: DefaultLandingPageName => Request[Campaign]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AdvertiserIds => Request[CampaignsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Campaign]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Campaign]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

