package typings.firebaseAdmin.admin.credential

import typings.firebaseAdmin.admin.GoogleOAuthAccessToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that provides Google OAuth2 access tokens used to authenticate
  * with Firebase services.
  *
  * In most cases, you will not need to implement this yourself and can instead
  * use the default implementations provided by
  * {@link admin.credential `admin.credential`}.
  */
trait Credential extends js.Object {
  /**
    * Returns a Google OAuth2 access token object used to authenticate with
    * Firebase services.
    *
    * This object contains the following properties:
    * * `access_token` (`string`): The actual Google OAuth2 access token.
    * * `expires_in` (`number`): The number of seconds from when the token was
    *   issued that it expires.
    *
    * @return A Google OAuth2 access token object.
    */
  def getAccessToken(): js.Promise[GoogleOAuthAccessToken]
}

object Credential {
  @scala.inline
  def apply(getAccessToken: () => js.Promise[GoogleOAuthAccessToken]): Credential = {
    val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
  
    __obj.asInstanceOf[Credential]
  }
}

