package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubaccountsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#subaccountsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Subaccount collection. */
  var subaccounts: js.UndefOr[js.Array[Subaccount]] = js.undefined
}

object SubaccountsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, subaccounts: js.Array[Subaccount] = null): SubaccountsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (subaccounts != null) __obj.updateDynamic("subaccounts")(subaccounts)
    __obj.asInstanceOf[SubaccountsListResponse]
  }
}

