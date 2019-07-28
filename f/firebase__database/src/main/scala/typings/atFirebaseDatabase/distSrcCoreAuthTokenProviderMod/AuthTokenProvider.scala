package typings.atFirebaseDatabase.distSrcCoreAuthTokenProviderMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAppDashTypes.privateMod.FirebaseAuthTokenData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "AuthTokenProvider")
@js.native
class AuthTokenProvider protected () extends js.Object {
  /**
    * @param {!FirebaseApp} app_
    */
  def this(app_ : FirebaseApp) = this()
  var app_ : js.Any = js.native
  def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  /**
    * @param {boolean} forceRefresh
    * @return {!Promise<FirebaseAuthTokenData>}
    */
  def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
  def notifyForInvalidToken(): Unit = js.native
  def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
}

