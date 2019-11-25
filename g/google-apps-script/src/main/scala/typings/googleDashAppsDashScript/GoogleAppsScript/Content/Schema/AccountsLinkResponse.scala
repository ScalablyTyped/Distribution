package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsLinkResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
}

object AccountsLinkResponse {
  @scala.inline
  def apply(kind: String = null): AccountsLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsLinkResponse]
  }
}

