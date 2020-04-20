package typings.gapiClientOauth2.gapi.client.oauth2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientOauth2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeResource extends js.Object {
  def get(request: AnonAlt): Request_[Userinfoplus]
}

object MeResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Userinfoplus]): MeResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[MeResource]
  }
}

