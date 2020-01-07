package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account List Response
  */
@js.native
trait Schema$AccountsListResponse extends js.Object {
  /**
    * Account collection.
    */
  var accounts: js.UndefOr[js.Array[Schema$Account]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$AccountsListResponse {
  @scala.inline
  def apply(accounts: js.Array[Schema$Account] = null, kind: String = null, nextPageToken: String = null): Schema$AccountsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountsListResponse]
  }
}

