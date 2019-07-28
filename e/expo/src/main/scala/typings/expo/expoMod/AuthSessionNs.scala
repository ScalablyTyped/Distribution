package typings.expo.expoMod

import typings.expo.Anon_AuthUrl
import typings.expo.expoMod.AuthSessionNs.StartAsyncResponse
import typings.expo.expoStrings.cancel
import typings.expo.expoStrings.dismissed
import typings.expo.expoStrings.error
import typings.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AuthSession")
@js.native
object AuthSessionNs extends js.Object {
  trait StartAsyncResponse extends js.Object {
    var errorCode: js.UndefOr[String] = js.undefined
    var event: js.UndefOr[HashMap] = js.undefined
    var params: js.UndefOr[HashMap] = js.undefined
    var `type`: js.UndefOr[cancel | dismissed | error | success] = js.undefined
  }
  
  def dismiss(): Unit = js.native
  def getRedirectUrl(): String = js.native
  def startAsync(options: Anon_AuthUrl): js.Promise[StartAsyncResponse] = js.native
}

