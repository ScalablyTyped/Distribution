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
  def startAsync(options: expoLib.Anon_ReturnUrl): stdLib.Promise[StartAsyncResponse] = js.native
  type StartAsyncResponse = expoLib.Anon_TypeCancel | expoLib.Anon_TypeDismissed | expoLib.Anon_TypeSuccess | expoLib.Anon_ErrorCode
}

