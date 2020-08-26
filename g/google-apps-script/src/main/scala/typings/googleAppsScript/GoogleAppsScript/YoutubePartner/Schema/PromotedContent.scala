package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromotedContent extends js.Object {
  var link: js.UndefOr[js.Array[CampaignTargetLink]] = js.native
}

object PromotedContent {
  @scala.inline
  def apply(): PromotedContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromotedContent]
  }
  @scala.inline
  implicit class PromotedContentOps[Self <: PromotedContent] (val x: Self) extends AnyVal {
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
    def setLinkVarargs(value: CampaignTargetLink*): Self = this.set("link", js.Array(value :_*))
    @scala.inline
    def setLink(value: js.Array[CampaignTargetLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
  
}

