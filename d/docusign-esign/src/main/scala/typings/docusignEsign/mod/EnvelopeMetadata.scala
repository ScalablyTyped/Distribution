package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeMetadata extends StObject {
  
  /**
    * Specifies if the Advanced Correct feature is enabled for the envelope. This feature enables you to correct the details of in process envelopes that
    * you sent or are shared with you. It offers more functionality than the Correct feature.
    */
  var allowAdvancedCorrect: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the Correct feature is enabled for the envelope. This feature enables you to correct the details of in process envelopes that you sent or
    * are shared with you, including the recipient, envelope, and document information.
    */
  var allowCorrect: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if DocuSign eNotary service is enabled for the envelope.
    */
  var enableSignWithNotary: js.UndefOr[String] = js.undefined
}
object EnvelopeMetadata {
  
  inline def apply(): EnvelopeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeMetadata]
  }
  
  extension [Self <: EnvelopeMetadata](x: Self) {
    
    inline def setAllowAdvancedCorrect(value: String): Self = StObject.set(x, "allowAdvancedCorrect", value.asInstanceOf[js.Any])
    
    inline def setAllowAdvancedCorrectUndefined: Self = StObject.set(x, "allowAdvancedCorrect", js.undefined)
    
    inline def setAllowCorrect(value: String): Self = StObject.set(x, "allowCorrect", value.asInstanceOf[js.Any])
    
    inline def setAllowCorrectUndefined: Self = StObject.set(x, "allowCorrect", js.undefined)
    
    inline def setEnableSignWithNotary(value: String): Self = StObject.set(x, "enableSignWithNotary", value.asInstanceOf[js.Any])
    
    inline def setEnableSignWithNotaryUndefined: Self = StObject.set(x, "enableSignWithNotary", js.undefined)
  }
}
