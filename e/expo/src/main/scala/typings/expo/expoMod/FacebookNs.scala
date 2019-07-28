package typings.expo.expoMod

import typings.expo.expoMod.FacebookNs.Options
import typings.expo.expoMod.FacebookNs.Response
import typings.expo.expoStrings.browser
import typings.expo.expoStrings.cancel
import typings.expo.expoStrings.native
import typings.expo.expoStrings.success
import typings.expo.expoStrings.system
import typings.expo.expoStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Facebook")
@js.native
object FacebookNs extends js.Object {
  trait Options extends js.Object {
    var behavior: js.UndefOr[web | native | browser | system] = js.undefined
    var permissions: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  trait Response extends js.Object {
    var expires: js.UndefOr[Double] = js.undefined
    var token: js.UndefOr[String] = js.undefined
    var `type`: cancel | success
  }
  
  def logInWithReadPermissionsAsync(appId: String): js.Promise[Response] = js.native
  def logInWithReadPermissionsAsync(appId: String, options: Options): js.Promise[Response] = js.native
}

