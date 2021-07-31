package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOptions extends StObject {
  
  var certificate: js.UndefOr[String] = js.undefined
  
  var documentsByUserid: js.UndefOr[String] = js.undefined
  
  var encrypt: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var recipientId: js.UndefOr[String] = js.undefined
  
  var sharedUserId: js.UndefOr[String] = js.undefined
  
  var showChanges: js.UndefOr[String] = js.undefined
  
  var watermark: js.UndefOr[String] = js.undefined
}
object DocumentOptions {
  
  @scala.inline
  def apply(): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOptions]
  }
  
  @scala.inline
  implicit class DocumentOptionsMutableBuilder[Self <: DocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setDocumentsByUserid(value: String): Self = StObject.set(x, "documentsByUserid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsByUseridUndefined: Self = StObject.set(x, "documentsByUserid", js.undefined)
    
    @scala.inline
    def setEncrypt(value: String): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    @scala.inline
    def setSharedUserId(value: String): Self = StObject.set(x, "sharedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUserIdUndefined: Self = StObject.set(x, "sharedUserId", js.undefined)
    
    @scala.inline
    def setShowChanges(value: String): Self = StObject.set(x, "showChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowChangesUndefined: Self = StObject.set(x, "showChanges", js.undefined)
    
    @scala.inline
    def setWatermark(value: String): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
  }
}
