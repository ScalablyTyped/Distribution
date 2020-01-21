package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonAltFieldsKeyMaxResults
import typings.gapiClientCalendar.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(request: AnonAltFieldsKeyOauthtoken): Request_[Setting]
  /** Returns all user settings for the authenticated user. */
  def list(request: AnonAltFieldsKeyMaxResults): Request_[Settings]
  /** Watch for changes to Settings resources. */
  def watch(request: AnonAltFieldsKeyMaxResults): Request_[Channel]
}

object SettingsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKeyOauthtoken => Request_[Setting],
    list: AnonAltFieldsKeyMaxResults => Request_[Settings],
    watch: AnonAltFieldsKeyMaxResults => Request_[Channel]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[SettingsResource]
  }
}

