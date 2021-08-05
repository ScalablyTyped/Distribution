package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerFormData extends StObject {
  
  /**
    * The envelope ID of the envelope status that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of powerform recipients.
    */
  var recipients: js.UndefOr[js.Array[PowerFormFormDataRecipient]] = js.undefined
}
object PowerFormData {
  
  inline def apply(): PowerFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormData]
  }
  
  extension [Self <: PowerFormData](x: Self) {
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setRecipients(value: js.Array[PowerFormFormDataRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setRecipientsVarargs(value: PowerFormFormDataRecipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
  }
}
