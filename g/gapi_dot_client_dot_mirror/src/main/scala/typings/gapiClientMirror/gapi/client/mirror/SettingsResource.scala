package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Gets a single setting by ID. */
  def get(request: Alt): Request[Setting]
}

object SettingsResource {
  @scala.inline
  def apply(get: Alt => Request[Setting]): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SettingsResource]
  }
}

