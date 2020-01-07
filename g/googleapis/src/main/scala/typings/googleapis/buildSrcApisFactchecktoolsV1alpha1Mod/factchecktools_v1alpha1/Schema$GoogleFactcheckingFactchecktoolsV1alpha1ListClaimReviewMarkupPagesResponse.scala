package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from listing `ClaimReview` markup.
  */
@js.native
trait Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse extends js.Object {
  /**
    * The result list of pages of `ClaimReview` markup.
    */
  var claimReviewMarkupPages: js.UndefOr[js.Array[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]] = js.native
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse {
  @scala.inline
  def apply(
    claimReviewMarkupPages: js.Array[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = null,
    nextPageToken: String = null
  ): Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse = {
    val __obj = js.Dynamic.literal()
    if (claimReviewMarkupPages != null) __obj.updateDynamic("claimReviewMarkupPages")(claimReviewMarkupPages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  }
}

