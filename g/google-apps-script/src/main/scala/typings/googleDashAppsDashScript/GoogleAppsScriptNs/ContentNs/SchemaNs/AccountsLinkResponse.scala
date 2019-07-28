package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

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
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountsLinkResponse]
  }
}

