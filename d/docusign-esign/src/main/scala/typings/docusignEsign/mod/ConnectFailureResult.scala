package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectFailureResult extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    *
    */
  var configUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The envelope ID of the envelope status that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * The connection status.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable message describing the connection status.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
}
object ConnectFailureResult {
  
  inline def apply(): ConnectFailureResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailureResult]
  }
  
  extension [Self <: ConnectFailureResult](x: Self) {
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setConfigUrl(value: String): Self = StObject.set(x, "configUrl", value.asInstanceOf[js.Any])
    
    inline def setConfigUrlUndefined: Self = StObject.set(x, "configUrl", js.undefined)
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
