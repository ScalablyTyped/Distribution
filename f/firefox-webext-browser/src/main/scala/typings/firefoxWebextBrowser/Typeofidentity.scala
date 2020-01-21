package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.identity.AccountInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofidentity extends js.Object {
  /* identity events */
  /**
    * Fired when signin state changes for an account on the user's profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onSignInChanged: js.UndefOr[
    WebExtEvent[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
  ] = js.native
  /* identity functions */
  /**
    * Retrieves a list of AccountInfo objects describing the accounts present on the profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getAccounts(): js.Promise[js.Array[AccountInfo]] = js.native
  /**
    * Gets an OAuth2 access token using the client ID and scopes specified in the oauth2 section of manifest.json.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getAuthToken(): js.Promise[js.Array[AccountInfo]] = js.native
  def getAuthToken(details: AnonAccount): js.Promise[js.Array[AccountInfo]] = js.native
  /**
    * Retrieves email address and obfuscated gaia id of the user signed into a profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getProfileUserInfo(): js.Promise[AnonEmail] = js.native
  /**
    * Generates a redirect URL to be used in |launchWebAuthFlow|.
    * @param [path] The path appended to the end of the generated URL.
    */
  def getRedirectURL(): String = js.native
  def getRedirectURL(path: String): String = js.native
  /** Starts an auth flow at the specified URL. */
  def launchWebAuthFlow(details: AnonInteractive): js.Promise[String] = js.native
  /**
    * Removes an OAuth2 access token from the Identity API's token cache.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeCachedAuthToken(details: AnonToken): js.Promise[AnonEmail] = js.native
}

