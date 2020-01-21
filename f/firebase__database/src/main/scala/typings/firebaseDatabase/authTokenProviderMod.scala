package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseAuthTokenData
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/AuthTokenProvider", JSImport.Namespace)
@js.native
object authTokenProviderMod extends js.Object {
  @js.native
  class AuthTokenProvider protected () extends js.Object {
    def this(app_ : FirebaseApp, authProvider_ : Provider[FirebaseAuthInternalName]) = this()
    var app_ : js.Any = js.native
    var authProvider_ : js.Any = js.native
    var auth_ : js.Any = js.native
    def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    /**
      * @param {boolean} forceRefresh
      * @return {!Promise<FirebaseAuthTokenData>}
      */
    def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
    def notifyForInvalidToken(): Unit = js.native
    def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  
}

