package typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User
  extends StObject
     with UserInfo {
  
  /**
    * Deletes and signs out the user.
    *
    * @remarks
    * Important: this is a security-sensitive operation that requires the user to have recently
    * signed in. If this requirement isn't met, ask the user to authenticate again and then call
    * one of the reauthentication methods like {@link reauthenticateWithCredential}.
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * Whether the email has been verified with {@link sendEmailVerification} and
    * {@link applyActionCode}.
    */
  val emailVerified: Boolean = js.native
  
  /**
    * Returns a JSON Web Token (JWT) used to identify the user to a Firebase service.
    *
    * @remarks
    * Returns the current token if it has not expired or if it will not expire in the next five
    * minutes. Otherwise, this will refresh the token and return a new one.
    *
    * @param forceRefresh - Force refresh regardless of token expiration.
    */
  def getIdToken(): js.Promise[String] = js.native
  def getIdToken(forceRefresh: Boolean): js.Promise[String] = js.native
  
  /**
    * Returns a deserialized JSON Web Token (JWT) used to identitfy the user to a Firebase service.
    *
    * @remarks
    * Returns the current token if it has not expired or if it will not expire in the next five
    * minutes. Otherwise, this will refresh the token and return a new one.
    *
    * @param forceRefresh - Force refresh regardless of token expiration.
    */
  def getIdTokenResult(): js.Promise[IdTokenResult] = js.native
  def getIdTokenResult(forceRefresh: Boolean): js.Promise[IdTokenResult] = js.native
  
  /**
    * Whether the user is authenticated using the {@link ProviderId}.ANONYMOUS provider.
    */
  val isAnonymous: Boolean = js.native
  
  /**
    * Additional metadata around user creation and sign-in times.
    */
  val metadata: UserMetadata = js.native
  
  /**
    * Additional per provider such as displayName and profile information.
    */
  val providerData: js.Array[UserInfo] = js.native
  
  /**
    * Refresh token used to reauthenticate the user. Avoid using this directly and prefer
    * {@link User.getIdToken} to refresh the ID token instead.
    */
  val refreshToken: String = js.native
  
  /**
    * Refreshes the user, if signed in.
    */
  def reload(): js.Promise[Unit] = js.native
  
  /**
    * The user's tenant ID.
    *
    * @remarks
    * This is a read-only property, which indicates the tenant ID
    * used to sign in the user. This is null if the user is signed in from the parent
    * project.
    *
    * @example
    * ```javascript
    * // Set the tenant ID on Auth instance.
    * auth.tenantId = 'TENANT_PROJECT_ID';
    *
    * // All future sign-in request now include tenant ID.
    * const result = await signInWithEmailAndPassword(auth, email, password);
    * // result.user.tenantId should be 'TENANT_PROJECT_ID'.
    * ```
    */
  val tenantId: String | Null = js.native
  
  /**
    * Returns a JSON-serializable representation of this object.
    *
    * @returns A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}
