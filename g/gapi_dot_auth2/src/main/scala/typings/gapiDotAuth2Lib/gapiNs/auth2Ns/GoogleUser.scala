package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

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
  def disconnect(): scala.Unit = js.native
  /**
       * Get the response object from the user's auth session.
       */
  def getAuthResponse(): AuthResponse = js.native
  /**
       * Get the response object from the user's auth session.
       */
  def getAuthResponse(includeAuthorizationData: scala.Boolean): AuthResponse = js.native
  /**
       * Get the user's basic profile information.
       */
  def getBasicProfile(): BasicProfile = js.native
  /**
       * Get the scopes that the user granted as a space-delimited string.
       */
  def getGrantedScopes(): java.lang.String = js.native
  /**
       * Get the user's Google Apps domain if the user signed in with a Google Apps account.
       */
  def getHostedDomain(): java.lang.String = js.native
  /**
       * Get the user's unique ID string.
       */
  def getId(): java.lang.String = js.native
  /**
       * See GoogleUser.signIn()
       */
  def grant(): js.Any = js.native
  /**
       * See GoogleUser.signIn()
       */
  def grant(options: SigninOptions): js.Any = js.native
  /**
       * See GoogleUser.signIn()
       */
  def grant(options: SigninOptionsBuilder): js.Any = js.native
  /**
       * Get permission from the user to access the specified scopes offline.
       * When you use GoogleUser.grantOfflineAccess(), the sign-in flow skips the account chooser step.
       * See GoogleUser.grantOfflineAccess().
       */
  def grantOfflineAccess(scopes: java.lang.String): scala.Unit = js.native
  /**
       * Returns true if the user granted the specified scopes.
       */
  def hasGrantedScopes(scopes: java.lang.String): scala.Boolean = js.native
  /**
       * Returns true if the user is signed in.
       */
  def isSignedIn(): scala.Boolean = js.native
  /**
       * Forces a refresh of the access token, and then returns a Promise for the new AuthResponse.
       */
  def reloadAuthResponse(): stdLib.Promise[AuthResponse] = js.native
  /**
       * Signs in the user. Use this method to request additional scopes for incremental
       * authorization or to sign in a user after the user has signed out.
       * When you use GoogleUser.signIn(), the sign-in flow skips the account chooser step.
       * See GoogleAuth.signIn().
       */
  def signIn(): js.Any = js.native
  /**
       * Signs in the user. Use this method to request additional scopes for incremental
       * authorization or to sign in a user after the user has signed out.
       * When you use GoogleUser.signIn(), the sign-in flow skips the account chooser step.
       * See GoogleAuth.signIn().
       */
  def signIn(options: SigninOptions): js.Any = js.native
  /**
       * Signs in the user. Use this method to request additional scopes for incremental
       * authorization or to sign in a user after the user has signed out.
       * When you use GoogleUser.signIn(), the sign-in flow skips the account chooser step.
       * See GoogleAuth.signIn().
       */
  def signIn(options: SigninOptionsBuilder): js.Any = js.native
}

