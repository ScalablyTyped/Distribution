package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AuthSession")
@js.native
object AuthSessionNs extends js.Object {
  trait StartAsyncResponse extends js.Object {
    var errorCode: js.UndefOr[java.lang.String] = js.undefined
    var event: js.UndefOr[expoLib.expoMod.HashMap] = js.undefined
    var params: js.UndefOr[expoLib.expoMod.HashMap] = js.undefined
    var `type`: js.UndefOr[
        expoLib.expoLibStrings.cancel | expoLib.expoLibStrings.dismissed | expoLib.expoLibStrings.error | expoLib.expoLibStrings.success
      ] = js.undefined
  }
  
  def dismiss(): scala.Unit = js.native
  def getRedirectUrl(): java.lang.String = js.native
  def startAsync(options: expoLib.Anon_AuthUrl): js.Promise[StartAsyncResponse] = js.native
}

