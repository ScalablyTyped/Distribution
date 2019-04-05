package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedAppAccessSettingsCollection extends js.Object {
  // Retrieves resolved app access settings of the logged in user.
  def GetSettings(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.AppAccessCollections
  // Retrieves the list of apps trusted by the admin of the logged in user.
  def ListTrustedApps(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.TrustedApps
}

object ResolvedAppAccessSettingsCollection {
  @scala.inline
  def apply(
    GetSettings: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.AppAccessCollections,
    ListTrustedApps: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.TrustedApps
  ): ResolvedAppAccessSettingsCollection = {
    val __obj = js.Dynamic.literal(GetSettings = js.Any.fromFunction0(GetSettings), ListTrustedApps = js.Any.fromFunction0(ListTrustedApps))
  
    __obj.asInstanceOf[ResolvedAppAccessSettingsCollection]
  }
}

