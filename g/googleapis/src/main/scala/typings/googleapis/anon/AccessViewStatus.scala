package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaDownloadAccessRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessViewStatus extends js.Object {
  
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
  implicit class AccessViewStatusOps[Self <: AccessViewStatus] (val x: Self) extends AnyVal {
    
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
    def setAccessViewStatus(value: String): Self = this.set("accessViewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessViewStatus: Self = this.set("accessViewStatus", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDownloadAccess(value: SchemaDownloadAccessRestriction): Self = this.set("downloadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadAccess: Self = this.set("downloadAccess", js.undefined)
    
    @scala.inline
    def setDriveImportedContentLink(value: String): Self = this.set("driveImportedContentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveImportedContentLink: Self = this.set("driveImportedContentLink", js.undefined)
    
    @scala.inline
    def setEmbeddable(value: Boolean): Self = this.set("embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddable: Self = this.set("embeddable", js.undefined)
    
    @scala.inline
    def setEpub(value: AcsTokenLink): Self = this.set("epub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpub: Self = this.set("epub", js.undefined)
    
    @scala.inline
    def setExplicitOfflineLicenseManagement(value: Boolean): Self = this.set("explicitOfflineLicenseManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitOfflineLicenseManagement: Self = this.set("explicitOfflineLicenseManagement", js.undefined)
    
    @scala.inline
    def setPdf(value: AcsTokenLink): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPublicDomain(value: Boolean): Self = this.set("publicDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicDomain: Self = this.set("publicDomain", js.undefined)
    
    @scala.inline
    def setQuoteSharingAllowed(value: Boolean): Self = this.set("quoteSharingAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteSharingAllowed: Self = this.set("quoteSharingAllowed", js.undefined)
    
    @scala.inline
    def setTextToSpeechPermission(value: String): Self = this.set("textToSpeechPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextToSpeechPermission: Self = this.set("textToSpeechPermission", js.undefined)
    
    @scala.inline
    def setViewOrderUrl(value: String): Self = this.set("viewOrderUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewOrderUrl: Self = this.set("viewOrderUrl", js.undefined)
    
    @scala.inline
    def setViewability(value: String): Self = this.set("viewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewability: Self = this.set("viewability", js.undefined)
    
    @scala.inline
    def setWebReaderLink(value: String): Self = this.set("webReaderLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebReaderLink: Self = this.set("webReaderLink", js.undefined)
  }
}
