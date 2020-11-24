package typings.devtoolsProtocol.mod.Protocol.ApplicationCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFramesWithManifestsResponse extends js.Object {
  
  /**
    * Array of frame identifiers with manifest urls for each frame containing a document
    * associated with some application cache.
    */
  var frameIds: js.Array[FrameWithManifest] = js.native
}
object GetFramesWithManifestsResponse {
  
  @scala.inline
  def apply(frameIds: js.Array[FrameWithManifest]): GetFramesWithManifestsResponse = {
    val __obj = js.Dynamic.literal(frameIds = frameIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFramesWithManifestsResponse]
  }
  
  @scala.inline
  implicit class GetFramesWithManifestsResponseOps[Self <: GetFramesWithManifestsResponse] (val x: Self) extends AnyVal {
    
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
    def setFrameIdsVarargs(value: FrameWithManifest*): Self = this.set("frameIds", js.Array(value :_*))
    
    @scala.inline
    def setFrameIds(value: js.Array[FrameWithManifest]): Self = this.set("frameIds", value.asInstanceOf[js.Any])
  }
}
