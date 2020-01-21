package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsClaimWebsiteResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
}

object AccountsClaimWebsiteResponse {
  @scala.inline
  def apply(kind: String = null): AccountsClaimWebsiteResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsClaimWebsiteResponse]
  }
}

