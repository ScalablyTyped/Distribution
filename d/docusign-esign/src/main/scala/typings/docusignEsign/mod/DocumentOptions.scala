package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentOptions extends js.Object {
  
  var certificate: js.UndefOr[String] = js.native
  
  var documentsByUserid: js.UndefOr[String] = js.native
  
  var encrypt: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var recipientId: js.UndefOr[String] = js.native
  
  var sharedUserId: js.UndefOr[String] = js.native
  
  var showChanges: js.UndefOr[String] = js.native
  
  var watermark: js.UndefOr[String] = js.native
}
object DocumentOptions {
  
  @scala.inline
  def apply(): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOptions]
  }
  
  @scala.inline
  implicit class DocumentOptionsOps[Self <: DocumentOptions] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setDocumentsByUserid(value: String): Self = this.set("documentsByUserid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentsByUserid: Self = this.set("documentsByUserid", js.undefined)
    
    @scala.inline
    def setEncrypt(value: String): Self = this.set("encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypt: Self = this.set("encrypt", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = this.set("recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("recipientId", js.undefined)
    
    @scala.inline
    def setSharedUserId(value: String): Self = this.set("sharedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedUserId: Self = this.set("sharedUserId", js.undefined)
    
    @scala.inline
    def setShowChanges(value: String): Self = this.set("showChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowChanges: Self = this.set("showChanges", js.undefined)
    
    @scala.inline
    def setWatermark(value: String): Self = this.set("watermark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatermark: Self = this.set("watermark", js.undefined)
  }
}
