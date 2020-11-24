package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.AppAccessCollections
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.TrustedApps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedAppAccessSettingsCollection extends js.Object {
  
  // Retrieves resolved app access settings of the logged in user.
  def GetSettings(): AppAccessCollections = js.native
  
  // Retrieves the list of apps trusted by the admin of the logged in user.
  def ListTrustedApps(): TrustedApps = js.native
}
object ResolvedAppAccessSettingsCollection {
  
  @scala.inline
  def apply(GetSettings: () => AppAccessCollections, ListTrustedApps: () => TrustedApps): ResolvedAppAccessSettingsCollection = {
    val __obj = js.Dynamic.literal(GetSettings = js.Any.fromFunction0(GetSettings), ListTrustedApps = js.Any.fromFunction0(ListTrustedApps))
    __obj.asInstanceOf[ResolvedAppAccessSettingsCollection]
  }
  
  @scala.inline
  implicit class ResolvedAppAccessSettingsCollectionOps[Self <: ResolvedAppAccessSettingsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetSettings(value: () => AppAccessCollections): Self = this.set("GetSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListTrustedApps(value: () => TrustedApps): Self = this.set("ListTrustedApps", js.Any.fromFunction0(value))
  }
}
