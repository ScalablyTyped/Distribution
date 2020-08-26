package typings.firebaseDatabase.authTokenProviderMod

import typings.firebaseAppTypes.privateMod.FirebaseAuthTokenData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthTokenProvider extends js.Object {
  def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
  def notifyForInvalidToken(): Unit = js.native
  def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
}

object AuthTokenProvider {
  @scala.inline
  def apply(
    addTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Unit,
    getToken: Boolean => js.Promise[FirebaseAuthTokenData],
    notifyForInvalidToken: () => Unit,
    removeTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Unit
  ): AuthTokenProvider = {
    val __obj = js.Dynamic.literal(addTokenChangeListener = js.Any.fromFunction1(addTokenChangeListener), getToken = js.Any.fromFunction1(getToken), notifyForInvalidToken = js.Any.fromFunction0(notifyForInvalidToken), removeTokenChangeListener = js.Any.fromFunction1(removeTokenChangeListener))
    __obj.asInstanceOf[AuthTokenProvider]
  }
  @scala.inline
  implicit class AuthTokenProviderOps[Self <: AuthTokenProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Unit): Self = this.set("addTokenChangeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetToken(value: Boolean => js.Promise[FirebaseAuthTokenData]): Self = this.set("getToken", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyForInvalidToken(value: () => Unit): Self = this.set("notifyForInvalidToken", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Unit): Self = this.set("removeTokenChangeListener", js.Any.fromFunction1(value))
  }
  
}

