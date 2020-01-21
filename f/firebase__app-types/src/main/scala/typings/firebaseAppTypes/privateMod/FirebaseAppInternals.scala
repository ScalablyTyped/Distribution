package typings.firebaseAppTypes.privateMod

import typings.firebaseAppTypes.AnonEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseAppInternals extends js.Object {
  var analytics: AnonEventName = js.native
  def addAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  def getToken(): js.Promise[FirebaseAuthTokenData | Null] = js.native
  def getToken(refreshToken: Boolean): js.Promise[FirebaseAuthTokenData | Null] = js.native
  def getUid(): String | Null = js.native
  def removeAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
}

