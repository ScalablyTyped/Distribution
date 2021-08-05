package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSendRequest extends StObject {
  
  /**
    * The GUID of the envelope or template that you want to send in bulk.
    */
  var envelopeOrTemplateId: js.UndefOr[String] = js.undefined
}
object BulkSendRequest {
  
  inline def apply(): BulkSendRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendRequest]
  }
  
  extension [Self <: BulkSendRequest](x: Self) {
    
    inline def setEnvelopeOrTemplateId(value: String): Self = StObject.set(x, "envelopeOrTemplateId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeOrTemplateIdUndefined: Self = StObject.set(x, "envelopeOrTemplateId", js.undefined)
  }
}
