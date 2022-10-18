package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * We need to mark this class as internal explicitly to exclude it in the public typings, because
  * it references AuthInternal which has a circular dependency with UserInternal.
  *
  * @internal
  */
@js.native
trait StsTokenManager extends StObject {
  
  def _assign(stsTokenManager: StsTokenManager): Unit = js.native
  
  def _clone(): StsTokenManager = js.native
  
  def _performRefresh(): scala.Nothing = js.native
  
  var accessToken: String | Null = js.native
  
  def clearRefreshToken(): Unit = js.native
  
  var expirationTime: Double | Null = js.native
  
  def getToken(auth: AuthInternal): js.Promise[String | Null] = js.native
  def getToken(auth: AuthInternal, forceRefresh: Boolean): js.Promise[String | Null] = js.native
  
  def isExpired: Boolean = js.native
  
  /* private */ var refresh: Any = js.native
  
  var refreshToken: String | Null = js.native
  
  def toJSON(): js.Object = js.native
  
  def updateFromServerResponse(response: FinalizeMfaResponse): Unit = js.native
  def updateFromServerResponse(response: IdTokenResponse): Unit = js.native
  
  /* private */ var updateTokensAndExpiration: Any = js.native
}
