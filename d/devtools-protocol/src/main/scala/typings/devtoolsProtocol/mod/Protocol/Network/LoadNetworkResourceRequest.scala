package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadNetworkResourceRequest extends js.Object {
  
  /**
    * Frame id to get the resource for.
    */
  var frameId: FrameId = js.native
  
  /**
    * Options for the request.
    */
  var options: LoadNetworkResourceOptions = js.native
  
  /**
    * URL of the resource to get content for.
    */
  var url: String = js.native
}
object LoadNetworkResourceRequest {
  
  @scala.inline
  def apply(frameId: FrameId, options: LoadNetworkResourceOptions, url: String): LoadNetworkResourceRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceRequest]
  }
  
  @scala.inline
  implicit class LoadNetworkResourceRequestOps[Self <: LoadNetworkResourceRequest] (val x: Self) extends AnyVal {
    
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
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: LoadNetworkResourceOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
