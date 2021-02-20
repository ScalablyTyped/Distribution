package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaDownloadAccessRestriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessViewStatus extends StObject {
  
  var accessViewStatus: js.UndefOr[String] = js.native
  
  var country: js.UndefOr[String] = js.native
  
  var downloadAccess: js.UndefOr[SchemaDownloadAccessRestriction] = js.native
  
  var driveImportedContentLink: js.UndefOr[String] = js.native
  
  var embeddable: js.UndefOr[Boolean] = js.native
  
  var epub: js.UndefOr[AcsTokenLink] = js.native
  
  var explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.native
  
  var pdf: js.UndefOr[AcsTokenLink] = js.native
  
  var publicDomain: js.UndefOr[Boolean] = js.native
  
  var quoteSharingAllowed: js.UndefOr[Boolean] = js.native
  
  var textToSpeechPermission: js.UndefOr[String] = js.native
  
  var viewOrderUrl: js.UndefOr[String] = js.native
  
  var viewability: js.UndefOr[String] = js.native
  
  var webReaderLink: js.UndefOr[String] = js.native
}
object AccessViewStatus {
  
  @scala.inline
  def apply(): AccessViewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessViewStatus]
  }
  
  @scala.inline
  implicit class AccessViewStatusMutableBuilder[Self <: AccessViewStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessViewStatus(value: String): Self = StObject.set(x, "accessViewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessViewStatusUndefined: Self = StObject.set(x, "accessViewStatus", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDownloadAccess(value: SchemaDownloadAccessRestriction): Self = StObject.set(x, "downloadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadAccessUndefined: Self = StObject.set(x, "downloadAccess", js.undefined)
    
    @scala.inline
    def setDriveImportedContentLink(value: String): Self = StObject.set(x, "driveImportedContentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveImportedContentLinkUndefined: Self = StObject.set(x, "driveImportedContentLink", js.undefined)
    
    @scala.inline
    def setEmbeddable(value: Boolean): Self = StObject.set(x, "embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddableUndefined: Self = StObject.set(x, "embeddable", js.undefined)
    
    @scala.inline
    def setEpub(value: AcsTokenLink): Self = StObject.set(x, "epub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpubUndefined: Self = StObject.set(x, "epub", js.undefined)
    
    @scala.inline
    def setExplicitOfflineLicenseManagement(value: Boolean): Self = StObject.set(x, "explicitOfflineLicenseManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitOfflineLicenseManagementUndefined: Self = StObject.set(x, "explicitOfflineLicenseManagement", js.undefined)
    
    @scala.inline
    def setPdf(value: AcsTokenLink): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setPublicDomain(value: Boolean): Self = StObject.set(x, "publicDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDomainUndefined: Self = StObject.set(x, "publicDomain", js.undefined)
    
    @scala.inline
    def setQuoteSharingAllowed(value: Boolean): Self = StObject.set(x, "quoteSharingAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteSharingAllowedUndefined: Self = StObject.set(x, "quoteSharingAllowed", js.undefined)
    
    @scala.inline
    def setTextToSpeechPermission(value: String): Self = StObject.set(x, "textToSpeechPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToSpeechPermissionUndefined: Self = StObject.set(x, "textToSpeechPermission", js.undefined)
    
    @scala.inline
    def setViewOrderUrl(value: String): Self = StObject.set(x, "viewOrderUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOrderUrlUndefined: Self = StObject.set(x, "viewOrderUrl", js.undefined)
    
    @scala.inline
    def setViewability(value: String): Self = StObject.set(x, "viewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityUndefined: Self = StObject.set(x, "viewability", js.undefined)
    
    @scala.inline
    def setWebReaderLink(value: String): Self = StObject.set(x, "webReaderLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebReaderLinkUndefined: Self = StObject.set(x, "webReaderLink", js.undefined)
  }
}
