package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from searching fact-checked claims.
  */
@js.native
trait Schema$GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse extends js.Object {
  /**
    * The list of claims and all of their associated information.
    */
  var claims: js.UndefOr[js.Array[Schema$GoogleFactcheckingFactchecktoolsV1alpha1Claim]] = js.native
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse {
  @scala.inline
  def apply(
    claims: js.Array[Schema$GoogleFactcheckingFactchecktoolsV1alpha1Claim] = null,
    nextPageToken: String = null
  ): Schema$GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  }
}

