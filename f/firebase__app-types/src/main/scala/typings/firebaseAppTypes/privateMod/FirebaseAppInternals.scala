package typings.firebaseAppTypes.privateMod

import typings.firebaseAppTypes.anon.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseAppInternals extends js.Object {
  
  def addAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  
  var analytics: LogEvent = js.native
  
  def getToken(): js.Promise[FirebaseAuthTokenData | Null] = js.native
  def getToken(refreshToken: Boolean): js.Promise[FirebaseAuthTokenData | Null] = js.native
  
  def getUid(): String | Null = js.native
  
  def removeAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
}
