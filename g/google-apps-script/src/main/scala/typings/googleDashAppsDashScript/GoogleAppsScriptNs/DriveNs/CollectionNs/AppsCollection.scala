package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.App
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.AppList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCollection extends js.Object {
  // Gets a specific app.
  def get(appId: String): App = js.native
  // Lists a user's installed apps.
  def list(): AppList = js.native
  // Lists a user's installed apps.
  def list(optionalArgs: js.Object): AppList = js.native
}

