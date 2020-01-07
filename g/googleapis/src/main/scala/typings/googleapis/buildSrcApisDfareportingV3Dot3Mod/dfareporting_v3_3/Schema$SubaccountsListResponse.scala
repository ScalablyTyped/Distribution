package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subaccount List Response
  */
@js.native
trait Schema$SubaccountsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#subaccountsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Subaccount collection.
    */
  var subaccounts: js.UndefOr[js.Array[Schema$Subaccount]] = js.native
}

object Schema$SubaccountsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, subaccounts: js.Array[Schema$Subaccount] = null): Schema$SubaccountsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subaccounts != null) __obj.updateDynamic("subaccounts")(subaccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubaccountsListResponse]
  }
}

