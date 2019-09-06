package typings.atFirebaseDatabase.distSrcCoreAuthTokenProviderMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAppDashTypes.privateMod.FirebaseAuthTokenData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "FirebaseAuthTokenProvider")
@js.native
class FirebaseAuthTokenProvider protected () extends AuthTokenProvider {
  def this(app_ : FirebaseApp) = this()
  var app_ : js.Any = js.native
  /* CompleteClass */
  override def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): js.Any = js.native
  /**
    * @param {boolean} forceRefresh
    * @return {!Promise<FirebaseAuthTokenData>}
    */
  /* CompleteClass */
  override def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
  /* CompleteClass */
  override def notifyForInvalidToken(): js.Any = js.native
  /* CompleteClass */
  override def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): js.Any = js.native
}

