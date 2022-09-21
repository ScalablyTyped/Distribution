package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerFormFormDataEnvelope extends StObject {
  
  /**
    * The envelope's GUID.
    *
    * Example: `93be49ab-afa0-4adf-933c-f752070d71ec`
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[js.Array[PowerFormFormDataRecipient]] = js.undefined
}
object PowerFormFormDataEnvelope {
  
  inline def apply(): PowerFormFormDataEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormFormDataEnvelope]
  }
  
  extension [Self <: PowerFormFormDataEnvelope](x: Self) {
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setRecipients(value: js.Array[PowerFormFormDataRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setRecipientsVarargs(value: PowerFormFormDataRecipient*): Self = StObject.set(x, "recipients", js.Array(value*))
  }
}
