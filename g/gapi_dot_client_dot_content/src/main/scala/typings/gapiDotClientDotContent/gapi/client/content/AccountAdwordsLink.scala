package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAdwordsLink extends js.Object {
  /** Customer ID of the AdWords account. */
  var adwordsId: js.UndefOr[String] = js.undefined
  /**
    * Status of the link between this Merchant Center account and the AdWords account. Upon retrieval, it represents the actual status of the link and can be
    * either active if it was approved in Google AdWords or pending if it's pending approval. Upon insertion, it represents the intended status of the link.
    * Re-uploading a link with status active when it's still pending or with status pending when it's already active will have no effect: the status will
    * remain unchanged. Re-uploading a link with deprecated status inactive is equivalent to not submitting the link at all and will delete the link if it
    * was active or cancel the link request if it was pending.
    */
  var status: js.UndefOr[String] = js.undefined
}

object AccountAdwordsLink {
  @scala.inline
  def apply(adwordsId: String = null, status: String = null): AccountAdwordsLink = {
    val __obj = js.Dynamic.literal()
    if (adwordsId != null) __obj.updateDynamic("adwordsId")(adwordsId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAdwordsLink]
  }
}

