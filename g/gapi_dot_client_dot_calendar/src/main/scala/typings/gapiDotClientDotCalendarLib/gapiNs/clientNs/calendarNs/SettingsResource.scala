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
    get: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Setting]
    ],
    list: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltFieldsKeyMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[Settings]
    ],
    watch: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltFieldsKeyMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[Channel]
    ]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list, watch = watch)
  
    __obj.asInstanceOf[SettingsResource]
  }
}

