package typings.gapiClientOauth2.gapi.client.oauth2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientOauth2.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserinfoResource extends js.Object {
  var v2: V2Resource
  def get(request: Alt): Request[Userinfoplus]
}

object UserinfoResource {
  @scala.inline
  def apply(get: Alt => Request[Userinfoplus], v2: V2Resource): UserinfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), v2 = v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserinfoResource]
  }
}

