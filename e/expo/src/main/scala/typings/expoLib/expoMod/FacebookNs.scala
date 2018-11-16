package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Facebook")
@js.native
object FacebookNs extends js.Object {
  
  trait Options extends js.Object {
    var behavior: js.UndefOr[
        expoLib.expoLibStrings.web | expoLib.expoLibStrings.native | expoLib.expoLibStrings.browser | expoLib.expoLibStrings.system
      ] = js.undefined
    var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  
  
  trait Response extends js.Object {
    var expires: js.UndefOr[scala.Double] = js.undefined
    var token: js.UndefOr[java.lang.String] = js.undefined
    var `type`: expoLib.expoLibStrings.cancel | expoLib.expoLibStrings.success
  }
  
  def logInWithReadPermissionsAsync(appId: java.lang.String): stdLib.Promise[Response] = js.native
  def logInWithReadPermissionsAsync(appId: java.lang.String, options: Options): stdLib.Promise[Response] = js.native
}

