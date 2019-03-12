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
  def apply(get: gapiDotClientDotOauth2Lib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Userinfoplus]): MeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[MeResource]
  }
}

