package typings.gapiDotClientDotOauth2.gapiNs.clientNs.oauth2Ns

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotOauth2.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserinfoResource extends js.Object {
  var v2: V2Resource
  def get(request: Anon_Alt): Request[Userinfoplus]
}

object UserinfoResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[Userinfoplus], v2: V2Resource): UserinfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), v2 = v2)
  
    __obj.asInstanceOf[UserinfoResource]
  }
}

