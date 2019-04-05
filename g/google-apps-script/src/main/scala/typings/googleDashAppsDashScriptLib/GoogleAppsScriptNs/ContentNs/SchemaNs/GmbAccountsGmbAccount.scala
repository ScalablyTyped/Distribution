package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmbAccountsGmbAccount extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var listingCount: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object GmbAccountsGmbAccount {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    listingCount: java.lang.String = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): GmbAccountsGmbAccount = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (listingCount != null) __obj.updateDynamic("listingCount")(listingCount)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GmbAccountsGmbAccount]
  }
}

