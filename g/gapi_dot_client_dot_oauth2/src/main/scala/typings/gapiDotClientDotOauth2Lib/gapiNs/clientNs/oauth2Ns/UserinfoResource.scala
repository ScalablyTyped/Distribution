package typings
package gapiDotClientDotOauth2Lib.gapiNs.clientNs.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserinfoResource extends js.Object {
  var v2: V2Resource
  def get(request: gapiDotClientDotOauth2Lib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Userinfoplus]
}

object UserinfoResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotOauth2Lib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Userinfoplus]
    ],
    v2: V2Resource
  ): UserinfoResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("v2")(v2)
    __obj.asInstanceOf[UserinfoResource]
  }
}

