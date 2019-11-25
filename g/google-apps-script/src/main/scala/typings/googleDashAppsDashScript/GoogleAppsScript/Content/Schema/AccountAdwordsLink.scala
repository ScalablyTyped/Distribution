package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

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
    if (adwordsId != null) __obj.updateDynamic("adwordsId")(adwordsId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAdwordsLink]
  }
}

