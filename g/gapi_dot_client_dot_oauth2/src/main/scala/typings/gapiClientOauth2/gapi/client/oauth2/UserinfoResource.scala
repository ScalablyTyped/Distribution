package typings.gapiClientOauth2.gapi.client.oauth2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientOauth2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserinfoResource extends js.Object {
  var v2: V2Resource
  def get(request: AnonAlt): Request_[Userinfoplus]
}

object UserinfoResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Userinfoplus], v2: V2Resource): UserinfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), v2 = v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserinfoResource]
  }
}

