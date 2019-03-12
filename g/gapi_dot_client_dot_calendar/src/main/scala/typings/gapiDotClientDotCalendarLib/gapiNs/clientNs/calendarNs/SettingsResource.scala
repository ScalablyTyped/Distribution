package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(request: gapiDotClientDotCalendarLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Setting]
  /** Returns all user settings for the authenticated user. */
  def list(request: gapiDotClientDotCalendarLib.Anon_AltFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Settings]
  /** Watch for changes to Settings resources. */
  def watch(request: gapiDotClientDotCalendarLib.Anon_AltFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

object SettingsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotCalendarLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Setting],
    list: gapiDotClientDotCalendarLib.Anon_AltFieldsKeyMaxResults => gapiDotClientLib.gapiNs.clientNs.Request[Settings],
    watch: gapiDotClientDotCalendarLib.Anon_AltFieldsKeyMaxResults => gapiDotClientLib.gapiNs.clientNs.Request[Channel]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[SettingsResource]
  }
}

