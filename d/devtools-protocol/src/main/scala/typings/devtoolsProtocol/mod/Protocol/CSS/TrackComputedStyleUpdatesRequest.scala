package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackComputedStyleUpdatesRequest extends js.Object {
  
  var propertiesToTrack: js.Array[CSSComputedStyleProperty] = js.native
}
object TrackComputedStyleUpdatesRequest {
  
  @scala.inline
  def apply(propertiesToTrack: js.Array[CSSComputedStyleProperty]): TrackComputedStyleUpdatesRequest = {
    val __obj = js.Dynamic.literal(propertiesToTrack = propertiesToTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackComputedStyleUpdatesRequest]
  }
  
  @scala.inline
  implicit class TrackComputedStyleUpdatesRequestOps[Self <: TrackComputedStyleUpdatesRequest] (val x: Self) extends AnyVal {
    
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
    def setPropertiesToTrackVarargs(value: CSSComputedStyleProperty*): Self = this.set("propertiesToTrack", js.Array(value :_*))
    
    @scala.inline
    def setPropertiesToTrack(value: js.Array[CSSComputedStyleProperty]): Self = this.set("propertiesToTrack", value.asInstanceOf[js.Any])
  }
}
