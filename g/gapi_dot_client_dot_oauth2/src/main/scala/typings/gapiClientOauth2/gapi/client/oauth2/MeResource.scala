package typings.gapiClientOauth2.gapi.client.oauth2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientOauth2.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeResource extends js.Object {
  def get(request: Alt): Request[Userinfoplus]
}

object MeResource {
  @scala.inline
  def apply(get: Alt => Request[Userinfoplus]): MeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[MeResource]
  }
}

