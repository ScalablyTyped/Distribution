package typings.devtoolsProtocol.mod.Protocol.ApplicationCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetManifestForFrameResponse extends js.Object {
  
  /**
    * Manifest URL for document in the given frame.
    */
  var manifestURL: String = js.native
}
object GetManifestForFrameResponse {
  
  @scala.inline
  def apply(manifestURL: String): GetManifestForFrameResponse = {
    val __obj = js.Dynamic.literal(manifestURL = manifestURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManifestForFrameResponse]
  }
  
  @scala.inline
  implicit class GetManifestForFrameResponseOps[Self <: GetManifestForFrameResponse] (val x: Self) extends AnyVal {
    
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
    def setManifestURL(value: String): Self = this.set("manifestURL", value.asInstanceOf[js.Any])
  }
}
