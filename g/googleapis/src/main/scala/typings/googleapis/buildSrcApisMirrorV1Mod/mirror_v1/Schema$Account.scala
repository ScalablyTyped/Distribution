package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an account passed into the Account Manager on Glass.
  */
@js.native
trait Schema$Account extends js.Object {
  var authTokens: js.UndefOr[js.Array[Schema$AuthToken]] = js.native
  var features: js.UndefOr[js.Array[String]] = js.native
  var password: js.UndefOr[String] = js.native
  var userData: js.UndefOr[js.Array[Schema$UserData]] = js.native
}

object Schema$Account {
  @scala.inline
  def apply(
    authTokens: js.Array[Schema$AuthToken] = null,
    features: js.Array[String] = null,
    password: String = null,
    userData: js.Array[Schema$UserData] = null
  ): Schema$Account = {
    val __obj = js.Dynamic.literal()
    if (authTokens != null) __obj.updateDynamic("authTokens")(authTokens.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Account]
  }
}

