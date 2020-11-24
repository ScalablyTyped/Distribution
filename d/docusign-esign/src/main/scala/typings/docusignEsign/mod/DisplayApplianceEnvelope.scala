package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayApplianceEnvelope extends js.Object {
  
  var addDemoStamp: js.UndefOr[Boolean] = js.native
  
  var allowMultipleAttachments: js.UndefOr[Boolean] = js.native
  
  var burnDefaultTabData: js.UndefOr[Boolean] = js.native
  
  var convertPdfFields: js.UndefOr[
    /*Boolean that specifies whether to enable PDF form fields to
    get converted to DocuSign secure fields when the document is added or
    uploaded to an envelope.*/ Boolean
  ] = js.native
  
  var envelopeId: js.UndefOr[
    /*The envelope's GUID. \n\nExample: `93be49ab-afa0-4adf-933c-f752070d71ec` */ String
  ] = js.native
  
  var envelopeType: js.UndefOr[String] = js.native
  
  var includeSigsBeforeComplete: js.UndefOr[Boolean] = js.native
  
  var isConcatMode: js.UndefOr[Boolean] = js.native
  
  var isEnvelopeIDStampingEnabled: js.UndefOr[Boolean] = js.native
  
  var pdfFormConversionFontScale100: js.UndefOr[Boolean] = js.native
  
  var shouldFlatten: js.UndefOr[Boolean] = js.native
  
  var showEnvelopeChanges: js.UndefOr[Boolean] = js.native
  
  var signOnline: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[/*The status of the item. */ String] = js.native
  
  var userId: js.UndefOr[
    /*The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    `userId` can represent another user whom the Administrator is accessing. */ String
  ] = js.native
}
object DisplayApplianceEnvelope {
  
  @scala.inline
  def apply(): DisplayApplianceEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceEnvelope]
  }
  
  @scala.inline
  implicit class DisplayApplianceEnvelopeOps[Self <: DisplayApplianceEnvelope] (val x: Self) extends AnyVal {
    
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
    def setAddDemoStamp(value: Boolean): Self = this.set("addDemoStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddDemoStamp: Self = this.set("addDemoStamp", js.undefined)
    
    @scala.inline
    def setAllowMultipleAttachments(value: Boolean): Self = this.set("allowMultipleAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleAttachments: Self = this.set("allowMultipleAttachments", js.undefined)
    
    @scala.inline
    def setBurnDefaultTabData(value: Boolean): Self = this.set("burnDefaultTabData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBurnDefaultTabData: Self = this.set("burnDefaultTabData", js.undefined)
    
    @scala.inline
    def setConvertPdfFields(
      value: /*Boolean that specifies whether to enable PDF form fields to
      get converted to DocuSign secure fields when the document is added or
      uploaded to an envelope.*/ Boolean
    ): Self = this.set("convertPdfFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertPdfFields: Self = this.set("convertPdfFields", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: /*The envelope's GUID. \n\nExample: `93be49ab-afa0-4adf-933c-f752070d71ec` */ String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setEnvelopeType(value: String): Self = this.set("envelopeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeType: Self = this.set("envelopeType", js.undefined)
    
    @scala.inline
    def setIncludeSigsBeforeComplete(value: Boolean): Self = this.set("includeSigsBeforeComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSigsBeforeComplete: Self = this.set("includeSigsBeforeComplete", js.undefined)
    
    @scala.inline
    def setIsConcatMode(value: Boolean): Self = this.set("isConcatMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsConcatMode: Self = this.set("isConcatMode", js.undefined)
    
    @scala.inline
    def setIsEnvelopeIDStampingEnabled(value: Boolean): Self = this.set("isEnvelopeIDStampingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnvelopeIDStampingEnabled: Self = this.set("isEnvelopeIDStampingEnabled", js.undefined)
    
    @scala.inline
    def setPdfFormConversionFontScale100(value: Boolean): Self = this.set("pdfFormConversionFontScale100", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfFormConversionFontScale100: Self = this.set("pdfFormConversionFontScale100", js.undefined)
    
    @scala.inline
    def setShouldFlatten(value: Boolean): Self = this.set("shouldFlatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFlatten: Self = this.set("shouldFlatten", js.undefined)
    
    @scala.inline
    def setShowEnvelopeChanges(value: Boolean): Self = this.set("showEnvelopeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEnvelopeChanges: Self = this.set("showEnvelopeChanges", js.undefined)
    
    @scala.inline
    def setSignOnline(value: Boolean): Self = this.set("signOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignOnline: Self = this.set("signOnline", js.undefined)
    
    @scala.inline
    def setStatus(value: /*The status of the item. */ String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUserId(
      value: /*The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
      `userId` can represent another user whom the Administrator is accessing. */ String
    ): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
