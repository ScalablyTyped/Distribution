package typings
package firefoxDashWebextDashBrowserLib.browserNs.identityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.identity")
@js.native
object ^ extends js.Object {
  /* identity events */
  /**
    * Fired when signin state changes for an account on the user's profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onSignInChanged: js.UndefOr[
    firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function2[/* account */ AccountInfo, /* signedIn */ scala.Boolean, scala.Unit]
    ]
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
  def getAuthToken(): js.Promise[js.UndefOr[js.Array[AccountInfo]]] = js.native
  def getAuthToken(details: firefoxDashWebextDashBrowserLib.Anon_Account): js.Promise[js.UndefOr[js.Array[AccountInfo]]] = js.native
  /**
    * Retrieves email address and obfuscated gaia id of the user signed into a profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getProfileUserInfo(): js.Promise[firefoxDashWebextDashBrowserLib.Anon_Email] = js.native
  /**
    * Generates a redirect URL to be used in |launchWebAuthFlow|.
    * @param [path] The path appended to the end of the generated URL.
    */
  def getRedirectURL(): java.lang.String = js.native
  def getRedirectURL(path: java.lang.String): java.lang.String = js.native
  /** Starts an auth flow at the specified URL. */
  def launchWebAuthFlow(details: firefoxDashWebextDashBrowserLib.Anon_Interactive): js.Promise[java.lang.String] = js.native
  /**
    * Removes an OAuth2 access token from the Identity API's token cache.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeCachedAuthToken(details: firefoxDashWebextDashBrowserLib.Anon_Token): js.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Email]] = js.native
}

