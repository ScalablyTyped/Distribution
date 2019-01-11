package typings
package atFirebaseDatabaseLib.distSrcCoreAuthTokenProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "AuthTokenProvider")
@js.native
class AuthTokenProvider protected () extends js.Object {
  /**
    * @param {!FirebaseApp} app_
    */
  def this(`app_`: atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseApp) = this()
  var `app_`: js.Any = js.native
  def addTokenChangeListener(listener: js.Function1[/* token */ java.lang.String | scala.Null, scala.Unit]): scala.Unit = js.native
  /**
    * @param {boolean} forceRefresh
    * @return {!Promise<FirebaseAuthTokenData>}
    */
  def getToken(forceRefresh: scala.Boolean): js.Promise[atFirebaseAppDashTypesLib.privateMod.FirebaseAuthTokenData] = js.native
  def notifyForInvalidToken(): scala.Unit = js.native
  def removeTokenChangeListener(listener: js.Function1[/* token */ java.lang.String | scala.Null, scala.Unit]): scala.Unit = js.native
}

