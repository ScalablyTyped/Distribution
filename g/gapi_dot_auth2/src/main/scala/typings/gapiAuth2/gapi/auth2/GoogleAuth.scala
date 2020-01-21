package typings.gapiAuth2.gapi.auth2

import typings.gapiAuth2.AnonCode
import typings.gapiAuth2.AnonDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GoogleAuth is a singleton class that provides methods to allow the user to sign in with a Google account,
  * get the user's current sign-in status, get specific data from the user's Google profile,
  * request additional scopes, and sign out from the current account.
  */
@JSGlobal("gapi.auth2.GoogleAuth")
@js.native
class GoogleAuth () extends js.Object {
  var currentUser: CurrentUser = js.native
  var isSignedIn: IsSignedIn = js.native
  /**
    * Attaches the sign-in flow to the specified container's click handler.
    */
  def attachClickHandler(
    container: js.Any,
    options: SigninOptions,
    onsuccess: js.Function1[/* googleUser */ GoogleUser, _],
    onfailure: js.Function1[/* reason */ String, _]
  ): js.Any = js.native
  /**
    * Revokes all of the scopes that the user granted.
    */
  def disconnect(): js.Any = js.native
  /**
    * Get permission from the user to access the specified scopes offline.
    */
  def grantOfflineAccess(): js.Promise[AnonCode] = js.native
  def grantOfflineAccess(options: OfflineAccessOptions): js.Promise[AnonCode] = js.native
  /**
    * Signs in the user using the specified options.
    * If no option specified here, fallback to the options specified to gapi.auth2.init().
    */
  def signIn(): js.Promise[GoogleUser] = js.native
  def signIn(options: SigninOptions): js.Promise[GoogleUser] = js.native
  def signIn(options: SigninOptionsBuilder): js.Promise[GoogleUser] = js.native
  /**
    * Signs out all accounts from the application.
    */
  def signOut(): js.Any = js.native
  /**
    * Calls the onInit function when the GoogleAuth object is fully initialized, or calls the onFailure function if
    * initialization fails.
    */
  def `then`(onInit: js.Function1[/* googleAuth */ this.type, _]): js.Any = js.native
  def `then`(
    onInit: js.Function1[/* googleAuth */ this.type, _],
    onFailure: js.Function1[/* reason */ AnonDetails, _]
  ): js.Any = js.native
}

