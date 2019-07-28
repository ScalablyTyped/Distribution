package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Setting
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsCollection extends js.Object {
  // Returns a single user setting.
  def get(setting: String): Setting = js.native
  // Returns a single user setting.
  def get(setting: String, optionalArgs: js.Object, headers: js.Object): Setting = js.native
  // Returns all user settings for the authenticated user.
  def list(): Settings = js.native
  // Returns all user settings for the authenticated user.
  def list(optionalArgs: js.Object): Settings = js.native
  // Returns all user settings for the authenticated user.
  def list(optionalArgs: js.Object, headers: js.Object): Settings = js.native
  // Watch for changes to Settings resources.
  def watch(resource: Channel): Channel = js.native
  // Watch for changes to Settings resources.
  def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
  // Watch for changes to Settings resources.
  def watch(resource: Channel, optionalArgs: js.Object, headers: js.Object): Channel = js.native
}

