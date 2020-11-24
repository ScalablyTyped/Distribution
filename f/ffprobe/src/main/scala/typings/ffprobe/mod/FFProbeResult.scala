package typings.ffprobe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FFProbeResult extends js.Object {
  
  var streams: js.Array[FFProbeStream] = js.native
}
object FFProbeResult {
  
  @scala.inline
  def apply(streams: js.Array[FFProbeStream]): FFProbeResult = {
    val __obj = js.Dynamic.literal(streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[FFProbeResult]
  }
  
  @scala.inline
  implicit class FFProbeResultOps[Self <: FFProbeResult] (val x: Self) extends AnyVal {
    
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
    def setStreamsVarargs(value: FFProbeStream*): Self = this.set("streams", js.Array(value :_*))
    
    @scala.inline
    def setStreams(value: js.Array[FFProbeStream]): Self = this.set("streams", value.asInstanceOf[js.Any])
  }
}
