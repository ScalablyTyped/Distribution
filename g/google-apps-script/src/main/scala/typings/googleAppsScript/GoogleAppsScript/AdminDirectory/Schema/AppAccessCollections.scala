package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppAccessCollections extends js.Object {
  
  var blockedApiAccessBuckets: js.UndefOr[js.Array[String]] = js.native
  
  var enforceSettingsForAndroidDrive: js.UndefOr[Boolean] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var resourceId: js.UndefOr[String] = js.native
  
  var resourceName: js.UndefOr[String] = js.native
  
  var trustDomainOwnedApps: js.UndefOr[Boolean] = js.native
}
object AppAccessCollections {
  
  @scala.inline
  def apply(): AppAccessCollections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppAccessCollections]
  }
  
  @scala.inline
  implicit class AppAccessCollectionsOps[Self <: AppAccessCollections] (val x: Self) extends AnyVal {
    
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
    def setBlockedApiAccessBucketsVarargs(value: String*): Self = this.set("blockedApiAccessBuckets", js.Array(value :_*))
    
    @scala.inline
    def setBlockedApiAccessBuckets(value: js.Array[String]): Self = this.set("blockedApiAccessBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedApiAccessBuckets: Self = this.set("blockedApiAccessBuckets", js.undefined)
    
    @scala.inline
    def setEnforceSettingsForAndroidDrive(value: Boolean): Self = this.set("enforceSettingsForAndroidDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceSettingsForAndroidDrive: Self = this.set("enforceSettingsForAndroidDrive", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setTrustDomainOwnedApps(value: Boolean): Self = this.set("trustDomainOwnedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustDomainOwnedApps: Self = this.set("trustDomainOwnedApps", js.undefined)
  }
}
