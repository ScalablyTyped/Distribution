package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandResources extends js.Object {
  
  /**
    * The user id of the user who created the brand resource.
    */
  var createdByUserInfo: js.UndefOr[UserInfo] = js.native
  
  /**
    * The date and time that the brand resource was created.
    */
  var createdDate: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var dataNotSavedNotInMaster: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Information about the user who last modified the brand resource.
    */
  var modifiedByUserInfo: js.UndefOr[UserInfo] = js.native
  
  /**
    * The date on which this user record was last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  
  /**
    * This property is returned in the response to the [AccountBrands::listResources][listResources] request.
    * It contains a list of any email templates that have been modified to differ from the master resource files.
    *
    * [listResources]: ./categories/Accounts/AccountBrands/listResources.html
    */
  var modifiedTemplates: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The type of brand resource file. A brand uses a different resource file to control each of the following experiences:
    *
    * - Sending (`sending`)
    * - Signing (`signing`)
    * - Email messages (`email`)
    * - Captive (embedded) signing (`signing_captive`)
    *
    * You can modify the default email messages and formats in these files and upload them to your brand to customize the user experience.
    */
  var resourcesContentType: js.UndefOr[String] = js.native
  
  /**
    * The URI for the brand resource file.
    */
  var resourcesContentUri: js.UndefOr[String] = js.native
}
object BrandResources {
  
  @scala.inline
  def apply(): BrandResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandResources]
  }
  
  @scala.inline
  implicit class BrandResourcesOps[Self <: BrandResources] (val x: Self) extends AnyVal {
    
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
    def setCreatedByUserInfo(value: UserInfo): Self = this.set("createdByUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByUserInfo: Self = this.set("createdByUserInfo", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDataNotSavedNotInMasterVarargs(value: String*): Self = this.set("dataNotSavedNotInMaster", js.Array(value :_*))
    
    @scala.inline
    def setDataNotSavedNotInMaster(value: js.Array[String]): Self = this.set("dataNotSavedNotInMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataNotSavedNotInMaster: Self = this.set("dataNotSavedNotInMaster", js.undefined)
    
    @scala.inline
    def setModifiedByUserInfo(value: UserInfo): Self = this.set("modifiedByUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedByUserInfo: Self = this.set("modifiedByUserInfo", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    
    @scala.inline
    def setModifiedTemplatesVarargs(value: String*): Self = this.set("modifiedTemplates", js.Array(value :_*))
    
    @scala.inline
    def setModifiedTemplates(value: js.Array[String]): Self = this.set("modifiedTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTemplates: Self = this.set("modifiedTemplates", js.undefined)
    
    @scala.inline
    def setResourcesContentType(value: String): Self = this.set("resourcesContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesContentType: Self = this.set("resourcesContentType", js.undefined)
    
    @scala.inline
    def setResourcesContentUri(value: String): Self = this.set("resourcesContentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesContentUri: Self = this.set("resourcesContentUri", js.undefined)
  }
}
