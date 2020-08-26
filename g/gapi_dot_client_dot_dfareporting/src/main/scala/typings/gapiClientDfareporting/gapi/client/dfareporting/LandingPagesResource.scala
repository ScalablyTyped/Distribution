package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AltCampaignId
import typings.gapiClientDfareporting.anon.CampaignId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LandingPagesResource extends js.Object {
  /** Deletes an existing campaign landing page. */
  def delete(request: AltCampaignId): Request[Unit] = js.native
  /** Gets one campaign landing page by ID. */
  def get(request: AltCampaignId): Request[LandingPage] = js.native
  /** Inserts a new landing page for the specified campaign. */
  def insert(request: CampaignId): Request[LandingPage] = js.native
  /** Retrieves the list of landing pages for the specified campaign. */
  def list(request: CampaignId): Request[LandingPagesListResponse] = js.native
  /** Updates an existing campaign landing page. This method supports patch semantics. */
  def patch(request: AltCampaignId): Request[LandingPage] = js.native
  /** Updates an existing campaign landing page. */
  def update(request: CampaignId): Request[LandingPage] = js.native
}

object LandingPagesResource {
  @scala.inline
  def apply(
    delete: AltCampaignId => Request[Unit],
    get: AltCampaignId => Request[LandingPage],
    insert: CampaignId => Request[LandingPage],
    list: CampaignId => Request[LandingPagesListResponse],
    patch: AltCampaignId => Request[LandingPage],
    update: CampaignId => Request[LandingPage]
  ): LandingPagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LandingPagesResource]
  }
  @scala.inline
  implicit class LandingPagesResourceOps[Self <: LandingPagesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: AltCampaignId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AltCampaignId => Request[LandingPage]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: CampaignId => Request[LandingPage]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: CampaignId => Request[LandingPagesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: AltCampaignId => Request[LandingPage]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: CampaignId => Request[LandingPage]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

