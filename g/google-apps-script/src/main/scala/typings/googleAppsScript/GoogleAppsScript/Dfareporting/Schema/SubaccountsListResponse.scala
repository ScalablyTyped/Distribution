package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubaccountsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var subaccounts: js.UndefOr[js.Array[Subaccount]] = js.undefined
}

object SubaccountsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, subaccounts: js.Array[Subaccount] = null): SubaccountsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subaccounts != null) __obj.updateDynamic("subaccounts")(subaccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountsListResponse]
  }
}

