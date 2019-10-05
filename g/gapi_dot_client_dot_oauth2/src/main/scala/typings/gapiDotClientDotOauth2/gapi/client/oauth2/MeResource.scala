package typings.gapiDotClientDotOauth2.gapi.client.oauth2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotOauth2.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeResource extends js.Object {
  def get(request: Anon_Alt): Request[Userinfoplus]
}

object MeResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[Userinfoplus]): MeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[MeResource]
  }
}

