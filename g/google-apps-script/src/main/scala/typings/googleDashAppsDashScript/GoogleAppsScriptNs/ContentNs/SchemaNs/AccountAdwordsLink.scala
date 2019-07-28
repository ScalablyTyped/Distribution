package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAdwordsLink extends js.Object {
  var adwordsId: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object AccountAdwordsLink {
  @scala.inline
  def apply(adwordsId: String = null, status: String = null): AccountAdwordsLink = {
    val __obj = js.Dynamic.literal()
    if (adwordsId != null) __obj.updateDynamic("adwordsId")(adwordsId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[AccountAdwordsLink]
  }
}

