package typings.googleAppsScript.GoogleAppsScript.Drive.Collection

import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.App
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.AppList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsCollection extends js.Object {
  
  // Gets a specific app.
  def get(appId: String): App = js.native
  
  // Lists a user's installed apps.
  def list(): AppList = js.native
  // Lists a user's installed apps.
  def list(optionalArgs: js.Object): AppList = js.native
}
