package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonPageToken
import typings.gapiClientCalendar.AnonSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(request: AnonSetting): Request_[Setting]
  /** Returns all user settings for the authenticated user. */
  def list(request: AnonPageToken): Request_[Settings]
  /** Watch for changes to Settings resources. */
  def watch(request: AnonPageToken): Request_[Channel]
}

object SettingsResource {
  @scala.inline
  def apply(
    get: AnonSetting => Request_[Setting],
    list: AnonPageToken => Request_[Settings],
    watch: AnonPageToken => Request_[Channel]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[SettingsResource]
  }
}

