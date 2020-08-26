package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAdwordsLink extends js.Object {
  /** Customer ID of the AdWords account. */
  var adwordsId: js.UndefOr[String] = js.native
  /**
    * Status of the link between this Merchant Center account and the AdWords account. Upon retrieval, it represents the actual status of the link and can be
    * either active if it was approved in Google AdWords or pending if it's pending approval. Upon insertion, it represents the intended status of the link.
    * Re-uploading a link with status active when it's still pending or with status pending when it's already active will have no effect: the status will
    * remain unchanged. Re-uploading a link with deprecated status inactive is equivalent to not submitting the link at all and will delete the link if it
    * was active or cancel the link request if it was pending.
    */
  var status: js.UndefOr[String] = js.native
}

object AccountAdwordsLink {
  @scala.inline
  def apply(): AccountAdwordsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAdwordsLink]
  }
  @scala.inline
  implicit class AccountAdwordsLinkOps[Self <: AccountAdwordsLink] (val x: Self) extends AnyVal {
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
    def setAdwordsId(value: String): Self = this.set("adwordsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdwordsId: Self = this.set("adwordsId", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

