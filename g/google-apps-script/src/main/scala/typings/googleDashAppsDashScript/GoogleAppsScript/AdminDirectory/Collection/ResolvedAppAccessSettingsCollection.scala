package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.AppAccessCollections
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.TrustedApps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedAppAccessSettingsCollection extends js.Object {
  // Retrieves resolved app access settings of the logged in user.
  def GetSettings(): AppAccessCollections
  // Retrieves the list of apps trusted by the admin of the logged in user.
  def ListTrustedApps(): TrustedApps
}

object ResolvedAppAccessSettingsCollection {
  @scala.inline
  def apply(GetSettings: () => AppAccessCollections, ListTrustedApps: () => TrustedApps): ResolvedAppAccessSettingsCollection = {
    val __obj = js.Dynamic.literal(GetSettings = js.Any.fromFunction0(GetSettings), ListTrustedApps = js.Any.fromFunction0(ListTrustedApps))
  
    __obj.asInstanceOf[ResolvedAppAccessSettingsCollection]
  }
}

