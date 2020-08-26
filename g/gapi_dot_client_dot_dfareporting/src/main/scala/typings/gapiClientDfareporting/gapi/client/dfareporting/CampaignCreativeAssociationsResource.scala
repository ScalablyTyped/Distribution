package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.CampaignId
import typings.gapiClientDfareporting.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignCreativeAssociationsResource extends js.Object {
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a
    * default ad does not exist already.
    */
  def insert(request: CampaignId): Request[CampaignCreativeAssociation] = js.native
  /** Retrieves the list of creative IDs associated with the specified campaign. This method supports paging. */
  def list(request: PageToken): Request[CampaignCreativeAssociationsListResponse] = js.native
}

object CampaignCreativeAssociationsResource {
  @scala.inline
  def apply(
    insert: CampaignId => Request[CampaignCreativeAssociation],
    list: PageToken => Request[CampaignCreativeAssociationsListResponse]
  ): CampaignCreativeAssociationsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CampaignCreativeAssociationsResource]
  }
  @scala.inline
  implicit class CampaignCreativeAssociationsResourceOps[Self <: CampaignCreativeAssociationsResource] (val x: Self) extends AnyVal {
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
    def setInsert(value: CampaignId => Request[CampaignCreativeAssociation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PageToken => Request[CampaignCreativeAssociationsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

