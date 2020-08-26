package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AcceptsInterstitialPlacements
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitesResource extends js.Object {
  /** Gets one site by ID. */
  def get(request: Fields): Request[Site] = js.native
  /** Inserts a new site. */
  def insert(request: Key): Request[Site] = js.native
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(request: AcceptsInterstitialPlacements): Request[SitesListResponse] = js.native
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: Fields): Request[Site] = js.native
  /** Updates an existing site. */
  def update(request: Key): Request[Site] = js.native
}

object SitesResource {
  @scala.inline
  def apply(
    get: Fields => Request[Site],
    insert: Key => Request[Site],
    list: AcceptsInterstitialPlacements => Request[SitesListResponse],
    patch: Fields => Request[Site],
    update: Key => Request[Site]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SitesResource]
  }
  @scala.inline
  implicit class SitesResourceOps[Self <: SitesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[Site]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Site]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AcceptsInterstitialPlacements => Request[SitesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Site]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Site]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

