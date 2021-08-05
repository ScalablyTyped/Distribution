package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaDownloadAccessRestriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessViewStatus extends StObject {
  
  var accessViewStatus: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  var downloadAccess: js.UndefOr[SchemaDownloadAccessRestriction] = js.undefined
  
  var driveImportedContentLink: js.UndefOr[String] = js.undefined
  
  var embeddable: js.UndefOr[Boolean] = js.undefined
  
  var epub: js.UndefOr[AcsTokenLink] = js.undefined
  
  var explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.undefined
  
  var pdf: js.UndefOr[AcsTokenLink] = js.undefined
  
  var publicDomain: js.UndefOr[Boolean] = js.undefined
  
  var quoteSharingAllowed: js.UndefOr[Boolean] = js.undefined
  
  var textToSpeechPermission: js.UndefOr[String] = js.undefined
  
  var viewOrderUrl: js.UndefOr[String] = js.undefined
  
  var viewability: js.UndefOr[String] = js.undefined
  
  var webReaderLink: js.UndefOr[String] = js.undefined
}
object AccessViewStatus {
  
  inline def apply(): AccessViewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessViewStatus]
  }
  
  extension [Self <: AccessViewStatus](x: Self) {
    
    inline def setAccessViewStatus(value: String): Self = StObject.set(x, "accessViewStatus", value.asInstanceOf[js.Any])
    
    inline def setAccessViewStatusUndefined: Self = StObject.set(x, "accessViewStatus", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDownloadAccess(value: SchemaDownloadAccessRestriction): Self = StObject.set(x, "downloadAccess", value.asInstanceOf[js.Any])
    
    inline def setDownloadAccessUndefined: Self = StObject.set(x, "downloadAccess", js.undefined)
    
    inline def setDriveImportedContentLink(value: String): Self = StObject.set(x, "driveImportedContentLink", value.asInstanceOf[js.Any])
    
    inline def setDriveImportedContentLinkUndefined: Self = StObject.set(x, "driveImportedContentLink", js.undefined)
    
    inline def setEmbeddable(value: Boolean): Self = StObject.set(x, "embeddable", value.asInstanceOf[js.Any])
    
    inline def setEmbeddableUndefined: Self = StObject.set(x, "embeddable", js.undefined)
    
    inline def setEpub(value: AcsTokenLink): Self = StObject.set(x, "epub", value.asInstanceOf[js.Any])
    
    inline def setEpubUndefined: Self = StObject.set(x, "epub", js.undefined)
    
    inline def setExplicitOfflineLicenseManagement(value: Boolean): Self = StObject.set(x, "explicitOfflineLicenseManagement", value.asInstanceOf[js.Any])
    
    inline def setExplicitOfflineLicenseManagementUndefined: Self = StObject.set(x, "explicitOfflineLicenseManagement", js.undefined)
    
    inline def setPdf(value: AcsTokenLink): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setPublicDomain(value: Boolean): Self = StObject.set(x, "publicDomain", value.asInstanceOf[js.Any])
    
    inline def setPublicDomainUndefined: Self = StObject.set(x, "publicDomain", js.undefined)
    
    inline def setQuoteSharingAllowed(value: Boolean): Self = StObject.set(x, "quoteSharingAllowed", value.asInstanceOf[js.Any])
    
    inline def setQuoteSharingAllowedUndefined: Self = StObject.set(x, "quoteSharingAllowed", js.undefined)
    
    inline def setTextToSpeechPermission(value: String): Self = StObject.set(x, "textToSpeechPermission", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechPermissionUndefined: Self = StObject.set(x, "textToSpeechPermission", js.undefined)
    
    inline def setViewOrderUrl(value: String): Self = StObject.set(x, "viewOrderUrl", value.asInstanceOf[js.Any])
    
    inline def setViewOrderUrlUndefined: Self = StObject.set(x, "viewOrderUrl", js.undefined)
    
    inline def setViewability(value: String): Self = StObject.set(x, "viewability", value.asInstanceOf[js.Any])
    
    inline def setViewabilityUndefined: Self = StObject.set(x, "viewability", js.undefined)
    
    inline def setWebReaderLink(value: String): Self = StObject.set(x, "webReaderLink", value.asInstanceOf[js.Any])
    
    inline def setWebReaderLinkUndefined: Self = StObject.set(x, "webReaderLink", js.undefined)
  }
}
