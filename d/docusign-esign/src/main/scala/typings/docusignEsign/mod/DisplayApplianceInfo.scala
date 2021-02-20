package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayApplianceInfo extends StObject {
  
  var documentData: js.UndefOr[js.Array[DisplayApplianceDocument]] = js.native
  
  var documentPages: js.UndefOr[js.Array[DisplayApplianceDocumentPage]] = js.native
  
  var envelopeData: js.UndefOr[DisplayApplianceEnvelope] = js.native
  
  var pageData: js.UndefOr[js.Array[DisplayAppliancePage]] = js.native
  
  var recipientData: js.UndefOr[js.Array[DisplayApplianceRecipient]] = js.native
}
object DisplayApplianceInfo {
  
  @scala.inline
  def apply(): DisplayApplianceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceInfo]
  }
  
  @scala.inline
  implicit class DisplayApplianceInfoMutableBuilder[Self <: DisplayApplianceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentData(value: js.Array[DisplayApplianceDocument]): Self = StObject.set(x, "documentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDataUndefined: Self = StObject.set(x, "documentData", js.undefined)
    
    @scala.inline
    def setDocumentDataVarargs(value: DisplayApplianceDocument*): Self = StObject.set(x, "documentData", js.Array(value :_*))
    
    @scala.inline
    def setDocumentPages(value: js.Array[DisplayApplianceDocumentPage]): Self = StObject.set(x, "documentPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentPagesUndefined: Self = StObject.set(x, "documentPages", js.undefined)
    
    @scala.inline
    def setDocumentPagesVarargs(value: DisplayApplianceDocumentPage*): Self = StObject.set(x, "documentPages", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeData(value: DisplayApplianceEnvelope): Self = StObject.set(x, "envelopeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeDataUndefined: Self = StObject.set(x, "envelopeData", js.undefined)
    
    @scala.inline
    def setPageData(value: js.Array[DisplayAppliancePage]): Self = StObject.set(x, "pageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDataUndefined: Self = StObject.set(x, "pageData", js.undefined)
    
    @scala.inline
    def setPageDataVarargs(value: DisplayAppliancePage*): Self = StObject.set(x, "pageData", js.Array(value :_*))
    
    @scala.inline
    def setRecipientData(value: js.Array[DisplayApplianceRecipient]): Self = StObject.set(x, "recipientData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientDataUndefined: Self = StObject.set(x, "recipientData", js.undefined)
    
    @scala.inline
    def setRecipientDataVarargs(value: DisplayApplianceRecipient*): Self = StObject.set(x, "recipientData", js.Array(value :_*))
  }
}
