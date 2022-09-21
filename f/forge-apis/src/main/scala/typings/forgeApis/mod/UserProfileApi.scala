package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "UserProfileApi")
@js.native
open class UserProfileApi () extends StObject {
  def this(apiClient: Any) = this()
  
  /**
    * Returns the profile information of an authorizing end user.
    */
  def getUserProfile(oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}
