package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typings.devtoolsProtocol.devtoolsProtocolStrings.png
import typings.devtoolsProtocol.devtoolsProtocolStrings.webp
import typings.devtoolsProtocol.mod.Protocol.Network.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEncodedResponseRequest extends js.Object {
  
  /**
    * The encoding to use. (GetEncodedResponseRequestEncoding enum)
    */
  var encoding: webp | jpeg | png = js.native
  
  /**
    * The quality of the encoding (0-1). (defaults to 1)
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * Identifier of the network request to get content for.
    */
  var requestId: RequestId = js.native
  
  /**
    * Whether to only return the size information (defaults to false).
    */
  var sizeOnly: js.UndefOr[Boolean] = js.native
}
object GetEncodedResponseRequest {
  
  @scala.inline
  def apply(encoding: webp | jpeg | png, requestId: RequestId): GetEncodedResponseRequest = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncodedResponseRequest]
  }
  
  @scala.inline
  implicit class GetEncodedResponseRequestOps[Self <: GetEncodedResponseRequest] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: webp | jpeg | png): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSizeOnly(value: Boolean): Self = this.set("sizeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeOnly: Self = this.set("sizeOnly", js.undefined)
  }
}
