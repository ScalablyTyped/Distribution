package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var authTokens: js.UndefOr[js.Array[AuthToken]] = js.undefined
  var features: js.UndefOr[js.Array[String]] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var userData: js.UndefOr[js.Array[UserData]] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    authTokens: js.Array[AuthToken] = null,
    features: js.Array[String] = null,
    password: String = null,
    userData: js.Array[UserData] = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (authTokens != null) __obj.updateDynamic("authTokens")(authTokens.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

