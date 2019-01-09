package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AuthSession")
@js.native
object AuthSessionNs extends js.Object {
  def dismiss(): scala.Unit = js.native
  def getRedirectUrl(): java.lang.String = js.native
  def startAsync(options: expoLib.Anon_AuthUrl): js.Promise[StartAsyncResponse] = js.native
  type StartAsyncResponse = expoLib.Anon_Cancel | expoLib.Anon_Dismissed | expoLib.Anon_Event | expoLib.Anon_Error
}

