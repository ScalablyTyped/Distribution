package typings.atFirebaseDatabase.distSrcCoreAuthTokenProviderMod

import typings.atFirebaseAppDashTypes.privateMod.FirebaseAuthTokenData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthTokenProvider extends js.Object {
  def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): js.Any
  /**
    * @param {boolean} forceRefresh
    * @return {!Promise<FirebaseAuthTokenData>}
    */
  def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData]
  def notifyForInvalidToken(): js.Any
  def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): js.Any
}

object AuthTokenProvider {
  @scala.inline
  def apply(
    addTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => js.Any,
    getToken: Boolean => js.Promise[FirebaseAuthTokenData],
    notifyForInvalidToken: () => js.Any,
    removeTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => js.Any
  ): AuthTokenProvider = {
    val __obj = js.Dynamic.literal(addTokenChangeListener = js.Any.fromFunction1(addTokenChangeListener), getToken = js.Any.fromFunction1(getToken), notifyForInvalidToken = js.Any.fromFunction0(notifyForInvalidToken), removeTokenChangeListener = js.Any.fromFunction1(removeTokenChangeListener))
  
    __obj.asInstanceOf[AuthTokenProvider]
  }
}

