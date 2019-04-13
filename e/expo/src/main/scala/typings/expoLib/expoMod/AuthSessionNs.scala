package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AuthSession")
@js.native
object AuthSessionNs extends js.Object {
  @js.native
  trait StartAsyncResponse extends js.Object {
    var errorCode: js.UndefOr[java.lang.String] = js.native
    var event: js.UndefOr[expoLib.expoMod.HashMap] = js.native
    var params: js.UndefOr[expoLib.expoMod.HashMap] = js.native
    var `type`: js.UndefOr[
        expoLib.expoLibStrings.cancel | expoLib.expoLibStrings.dismissed | expoLib.expoLibStrings.error | expoLib.expoLibStrings.success
      ] = js.native
  }
  
  def dismiss(): scala.Unit = js.native
  def getRedirectUrl(): java.lang.String = js.native
  def startAsync(options: expoLib.Anon_AuthUrl): js.Promise[StartAsyncResponse] = js.native
}

