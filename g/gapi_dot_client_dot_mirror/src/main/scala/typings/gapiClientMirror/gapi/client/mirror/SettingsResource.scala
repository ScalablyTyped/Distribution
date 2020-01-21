package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMirror.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Gets a single setting by ID. */
  def get(request: AnonAlt): Request_[Setting]
}

object SettingsResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Setting]): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[SettingsResource]
  }
}

