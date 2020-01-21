package typings.firebaseAuthInteropTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseAuthInternal extends js.Object {
  def addAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  def getToken(): js.Promise[FirebaseAuthTokenData | Null] = js.native
  def getToken(refreshToken: Boolean): js.Promise[FirebaseAuthTokenData | Null] = js.native
  def getUid(): String | Null = js.native
  def removeAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
}

