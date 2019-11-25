package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsListResponse extends js.Object {
  /** Account collection. */
  var accounts: js.UndefOr[js.Array[Account]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AccountsListResponse {
  @scala.inline
  def apply(accounts: js.Array[Account] = null, kind: String = null, nextPageToken: String = null): AccountsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsListResponse]
  }
}

