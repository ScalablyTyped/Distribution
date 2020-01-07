package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account list response.
  */
@js.native
trait Schema$ListServiceAccountsResponse extends js.Object {
  /**
    * The list of matching service accounts.
    */
  var accounts: js.UndefOr[js.Array[Schema$ServiceAccount]] = js.native
  /**
    * To retrieve the next page of results, set
    * ListServiceAccountsRequest.page_token to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListServiceAccountsResponse {
  @scala.inline
  def apply(accounts: js.Array[Schema$ServiceAccount] = null, nextPageToken: String = null): Schema$ListServiceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListServiceAccountsResponse]
  }
}

