package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectFailureResult extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var configId: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    *
    */
  var configUrl: js.UndefOr[String] = js.native
  
  /**
    * The envelope ID of the envelope status that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * The connection status.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * A human-readable message describing the connection status.
    */
  var statusMessage: js.UndefOr[String] = js.native
}
object ConnectFailureResult {
  
  @scala.inline
  def apply(): ConnectFailureResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailureResult]
  }
  
  @scala.inline
  implicit class ConnectFailureResultMutableBuilder[Self <: ConnectFailureResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    @scala.inline
    def setConfigUrl(value: String): Self = StObject.set(x, "configUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUrlUndefined: Self = StObject.set(x, "configUrl", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
