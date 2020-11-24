package typings.googleAuthLibrary.idtokenclientMod

import typings.googleAuthLibrary.oauth2clientMod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-auth-library/build/src/auth/idtokenclient", "IdTokenClient")
@js.native
class IdTokenClient protected () extends OAuth2Client {
  /**
    * Google ID Token client
    *
    * Retrieve access token from the metadata server.
    * See: https://developers.google.com/compute/docs/authentication
    */
  def this(options: IdTokenOptions) = this()
  
  var getIdTokenExpiryDate: js.Any = js.native
  
  var idTokenProvider: IdTokenProvider = js.native
  
  var targetAudience: String = js.native
}
