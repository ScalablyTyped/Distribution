package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmbAccountsGmbAccount extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var listingCount: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object GmbAccountsGmbAccount {
  @scala.inline
  def apply(email: String = null, listingCount: String = null, name: String = null, `type`: String = null): GmbAccountsGmbAccount = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (listingCount != null) __obj.updateDynamic("listingCount")(listingCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GmbAccountsGmbAccount]
  }
}

