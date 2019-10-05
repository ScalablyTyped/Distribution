package typings.gapiDotAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GoogleUser object represents one user account.
  */
@js.native
trait GoogleUser extends js.Object {
  /**
    * Revokes all of the scopes that the user granted.
    */
  def disconnect(): Unit = js.native
  /**
    * Get the response object from the user's auth session.
    */
  def getAuthResponse(): AuthResponse = js.native
  def getAuthResponse(includeAuthorizationData: Boolean): AuthResponse = js.native
  /**
    * Get the user's basic profile information.
    */
  def getBasicProfile(): BasicProfile = js.native
  /**
    * Get the scopes that the user granted as a space-delimited string.
    */
  def getGrantedScopes(): String = js.native
  /**
    * Get the user's Google Apps domain if the user signed in with a Google Apps account.
    */
  def getHostedDomain(): String = js.native
  /**
    * Get the user's unique ID string.
    */
  def getId(): String = js.native
  /**
    * See GoogleUser.signIn()
    */
  def grant(): js.Any = js.native
  def grant(options: SigninOptions): js.Any = js.native
  def grant(options: SigninOptionsBuilder): js.Any = js.native
  /**
    * Get permission from the user to access the specified scopes offline.
    * When you use GoogleUser.grantOfflineAccess(), the sign-in flow skips the account chooser step.
    * See GoogleUser.grantOfflineAccess().
    */
  def grantOfflineAccess(scopes: String): Unit = js.native
  /**
    * Returns true if the user granted the specified scopes.
    */
  def hasGrantedScopes(scopes: String): Boolean = js.native
  /**
    * Returns true if the user is signed in.
    */
  def isSignedIn(): Boolean = js.native
  /**
    * Forces a refresh of the access token, and then returns a Promise for the new AuthResponse.
    */
  def reloadAuthResponse(): js.Promise[AuthResponse] = js.native
  /**
    * Signs in the user. Use this method to request additional scopes for incremental
    * authorization or to sign in a user after the user has signed out.
    * When you use GoogleUser.signIn(), the sign-in flow skips the account chooser step.
    * See GoogleAuth.signIn().
    */
  def signIn(): js.Any = js.native
  def signIn(options: SigninOptions): js.Any = js.native
  def signIn(options: SigninOptionsBuilder): js.Any = js.native
}

