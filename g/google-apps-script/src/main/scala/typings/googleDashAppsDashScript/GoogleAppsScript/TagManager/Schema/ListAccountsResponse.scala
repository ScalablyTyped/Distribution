package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAccountsResponse extends js.Object {
  var account: js.UndefOr[js.Array[Account]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListAccountsResponse {
  @scala.inline
  def apply(account: js.Array[Account] = null, nextPageToken: String = null): ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListAccountsResponse]
  }
}

