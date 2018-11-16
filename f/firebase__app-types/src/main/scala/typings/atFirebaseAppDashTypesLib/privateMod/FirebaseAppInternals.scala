package typings
package atFirebaseAppDashTypesLib.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseAppInternals extends js.Object {
  def addAuthTokenListener(fn: js.Function1[/* token */ java.lang.String | scala.Null, scala.Unit]): scala.Unit = js.native
  def getToken(): stdLib.Promise[FirebaseAuthTokenData | scala.Null] = js.native
  def getToken(refreshToken: scala.Boolean): stdLib.Promise[FirebaseAuthTokenData | scala.Null] = js.native
  def getUid(): java.lang.String | scala.Null = js.native
  def removeAuthTokenListener(fn: js.Function1[/* token */ java.lang.String | scala.Null, scala.Unit]): scala.Unit = js.native
}

