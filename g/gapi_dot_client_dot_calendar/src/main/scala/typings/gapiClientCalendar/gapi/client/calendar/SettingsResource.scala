package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCalendar.anon.KeyMaxResults
import typings.gapiClientCalendar.anon.SyncToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(): Request[Setting] = js.native
  def get(request: typings.gapiClientCalendar.anon.Setting): Request[Setting] = js.native
  /** Returns all user settings for the authenticated user. */
  def list(): Request[Settings] = js.native
  def list(request: SyncToken): Request[Settings] = js.native
  /** Watch for changes to Settings resources. */
  def watch(request: KeyMaxResults): Request[Channel] = js.native
  def watch(request: SyncToken, body: Channel): Request[Channel] = js.native
}

