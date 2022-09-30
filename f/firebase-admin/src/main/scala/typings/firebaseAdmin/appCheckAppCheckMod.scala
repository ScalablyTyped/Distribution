package typings.firebaseAdmin

import typings.firebaseAdmin.appCheckApiMod.AppCheckToken
import typings.firebaseAdmin.appCheckApiMod.AppCheckTokenOptions
import typings.firebaseAdmin.appCheckApiMod.VerifyAppCheckTokenResponse
import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appCheckAppCheckMod {
  
  @JSImport("firebase-admin/lib/app-check/app-check", "AppCheck")
  @js.native
  open class AppCheck () extends StObject {
    
    val app: App = js.native
    
    /* private */ val appCheckTokenVerifier: Any = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * Creates a new {@link AppCheckToken} that can be sent
      * back to a client.
      *
      * @param appId - The app ID to use as the JWT app_id.
      * @param options - Optional options object when creating a new App Check Token.
      *
      * @returns A promise that fulfills with a `AppCheckToken`.
      */
    def createToken(appId: String): js.Promise[AppCheckToken] = js.native
    def createToken(appId: String, options: AppCheckTokenOptions): js.Promise[AppCheckToken] = js.native
    
    /* private */ val tokenGenerator: Any = js.native
    
    /**
      * Verifies a Firebase App Check token (JWT). If the token is valid, the promise is
      * fulfilled with the token's decoded claims; otherwise, the promise is
      * rejected.
      *
      * @param appCheckToken - The App Check token to verify.
      *
      * @returns A promise fulfilled with the token's decoded claims
      *   if the App Check token is valid; otherwise, a rejected promise.
      */
    def verifyToken(appCheckToken: String): js.Promise[VerifyAppCheckTokenResponse] = js.native
  }
}
