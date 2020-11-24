package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectFailureResult extends js.Object {
  
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
  implicit class ConnectFailureResultOps[Self <: ConnectFailureResult] (val x: Self) extends AnyVal {
    
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
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigId: Self = this.set("configId", js.undefined)
    
    @scala.inline
    def setConfigUrl(value: String): Self = this.set("configUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigUrl: Self = this.set("configUrl", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
  }
}
