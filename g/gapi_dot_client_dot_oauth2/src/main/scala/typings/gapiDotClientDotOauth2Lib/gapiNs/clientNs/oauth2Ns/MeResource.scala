package typings
package gapiDotClientDotOauth2Lib.gapiNs.clientNs.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeResource extends js.Object {
  def get(request: gapiDotClientDotOauth2Lib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Userinfoplus]
}

object MeResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotOauth2Lib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Userinfoplus]
    ]
  ): MeResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[MeResource]
  }
}

