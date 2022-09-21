package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayApplianceInfo extends StObject {
  
  var documentData: js.UndefOr[js.Array[DisplayApplianceDocument]] = js.undefined
  
  var documentPages: js.UndefOr[js.Array[DisplayApplianceDocumentPage]] = js.undefined
  
  var envelopeData: js.UndefOr[DisplayApplianceEnvelope] = js.undefined
  
  var pageData: js.UndefOr[js.Array[DisplayAppliancePage]] = js.undefined
  
  var recipientData: js.UndefOr[js.Array[DisplayApplianceRecipient]] = js.undefined
}
object DisplayApplianceInfo {
  
  inline def apply(): DisplayApplianceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceInfo]
  }
  
  extension [Self <: DisplayApplianceInfo](x: Self) {
    
    inline def setDocumentData(value: js.Array[DisplayApplianceDocument]): Self = StObject.set(x, "documentData", value.asInstanceOf[js.Any])
    
    inline def setDocumentDataUndefined: Self = StObject.set(x, "documentData", js.undefined)
    
    inline def setDocumentDataVarargs(value: DisplayApplianceDocument*): Self = StObject.set(x, "documentData", js.Array(value*))
    
    inline def setDocumentPages(value: js.Array[DisplayApplianceDocumentPage]): Self = StObject.set(x, "documentPages", value.asInstanceOf[js.Any])
    
    inline def setDocumentPagesUndefined: Self = StObject.set(x, "documentPages", js.undefined)
    
    inline def setDocumentPagesVarargs(value: DisplayApplianceDocumentPage*): Self = StObject.set(x, "documentPages", js.Array(value*))
    
    inline def setEnvelopeData(value: DisplayApplianceEnvelope): Self = StObject.set(x, "envelopeData", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeDataUndefined: Self = StObject.set(x, "envelopeData", js.undefined)
    
    inline def setPageData(value: js.Array[DisplayAppliancePage]): Self = StObject.set(x, "pageData", value.asInstanceOf[js.Any])
    
    inline def setPageDataUndefined: Self = StObject.set(x, "pageData", js.undefined)
    
    inline def setPageDataVarargs(value: DisplayAppliancePage*): Self = StObject.set(x, "pageData", js.Array(value*))
    
    inline def setRecipientData(value: js.Array[DisplayApplianceRecipient]): Self = StObject.set(x, "recipientData", value.asInstanceOf[js.Any])
    
    inline def setRecipientDataUndefined: Self = StObject.set(x, "recipientData", js.undefined)
    
    inline def setRecipientDataVarargs(value: DisplayApplianceRecipient*): Self = StObject.set(x, "recipientData", js.Array(value*))
  }
}
