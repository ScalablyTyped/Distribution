package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "UserProfileApi")
@js.native
class UserProfileApi () extends js.Object {
  /**
    * Returns the profile information of an authorizing end user.
    */
  def getUserProfile(oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

