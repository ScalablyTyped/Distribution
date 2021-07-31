package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandResources extends StObject {
  
  /**
    * The user id of the user who created the brand resource.
    */
  var createdByUserInfo: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * The date and time that the brand resource was created.
    */
  var createdDate: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var dataNotSavedNotInMaster: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Information about the user who last modified the brand resource.
    */
  var modifiedByUserInfo: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * The date on which this user record was last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.undefined
  
  /**
    * This property is returned in the response to the [AccountBrands::listResources][listResources] request.
    * It contains a list of any email templates that have been modified to differ from the master resource files.
    *
    * [listResources]: ./categories/Accounts/AccountBrands/listResources.html
    */
  var modifiedTemplates: js.UndefOr[js.Array[String]] = js.undefined
  
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
  var resourcesContentType: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the brand resource file.
    */
  var resourcesContentUri: js.UndefOr[String] = js.undefined
}
object BrandResources {
  
  @scala.inline
  def apply(): BrandResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandResources]
  }
  
  @scala.inline
  implicit class BrandResourcesMutableBuilder[Self <: BrandResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedByUserInfo(value: UserInfo): Self = StObject.set(x, "createdByUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUserInfoUndefined: Self = StObject.set(x, "createdByUserInfo", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDataNotSavedNotInMaster(value: js.Array[String]): Self = StObject.set(x, "dataNotSavedNotInMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNotSavedNotInMasterUndefined: Self = StObject.set(x, "dataNotSavedNotInMaster", js.undefined)
    
    @scala.inline
    def setDataNotSavedNotInMasterVarargs(value: String*): Self = StObject.set(x, "dataNotSavedNotInMaster", js.Array(value :_*))
    
    @scala.inline
    def setModifiedByUserInfo(value: UserInfo): Self = StObject.set(x, "modifiedByUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByUserInfoUndefined: Self = StObject.set(x, "modifiedByUserInfo", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    @scala.inline
    def setModifiedTemplates(value: js.Array[String]): Self = StObject.set(x, "modifiedTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTemplatesUndefined: Self = StObject.set(x, "modifiedTemplates", js.undefined)
    
    @scala.inline
    def setModifiedTemplatesVarargs(value: String*): Self = StObject.set(x, "modifiedTemplates", js.Array(value :_*))
    
    @scala.inline
    def setResourcesContentType(value: String): Self = StObject.set(x, "resourcesContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesContentTypeUndefined: Self = StObject.set(x, "resourcesContentType", js.undefined)
    
    @scala.inline
    def setResourcesContentUri(value: String): Self = StObject.set(x, "resourcesContentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesContentUriUndefined: Self = StObject.set(x, "resourcesContentUri", js.undefined)
  }
}
