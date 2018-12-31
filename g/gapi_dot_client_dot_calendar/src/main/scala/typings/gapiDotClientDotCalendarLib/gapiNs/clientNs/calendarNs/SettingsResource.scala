package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(request: gapiDotClientDotCalendarLib.Anon_Setting): gapiDotClientLib.gapiNs.clientNs.Request[Setting]
  /** Returns all user settings for the authenticated user. */
  def list(request: gapiDotClientDotCalendarLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Settings]
  /** Watch for changes to Settings resources. */
  def watch(request: gapiDotClientDotCalendarLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

