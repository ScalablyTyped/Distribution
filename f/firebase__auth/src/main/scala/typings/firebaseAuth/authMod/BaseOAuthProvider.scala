package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common code to all OAuth providers. This is separate from the
  * {@link OAuthProvider} so that child providers (like
  * {@link GoogleAuthProvider}) don't inherit the `credential` instance method.
  * Instead, they rely on a static `credential` method.
  */
@js.native
trait BaseOAuthProvider
  extends StObject
     with FederatedAuthProvider {
  
  /**
    * Add an OAuth scope to the credential.
    *
    * @param scope - Provider OAuth scope to add.
    */
  def addScope(scope: String): AuthProvider = js.native
  
  /**
    * Retrieve the current list of OAuth scopes.
    */
  def getScopes(): js.Array[String] = js.native
  
  /** @internal */
  /* private */ var scopes: Any = js.native
}
