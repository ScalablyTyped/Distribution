package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsAuthInfoResponse extends js.Object {
  var accountIdentifiers: js.UndefOr[js.Array[AccountIdentifier]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AccountsAuthInfoResponse {
  @scala.inline
  def apply(accountIdentifiers: js.Array[AccountIdentifier] = null, kind: String = null): AccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (accountIdentifiers != null) __obj.updateDynamic("accountIdentifiers")(accountIdentifiers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountsAuthInfoResponse]
  }
}

