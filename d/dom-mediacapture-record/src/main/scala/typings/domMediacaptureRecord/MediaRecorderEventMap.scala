package typings.domMediacaptureRecord

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRecorderEventMap extends js.Object {
  
  var dataavailable: BlobEvent = js.native
  
  var error: MediaRecorderErrorEvent = js.native
  
  var pause: Event = js.native
  
  var resume: Event = js.native
  
  var start: Event = js.native
  
  var stop: Event = js.native
}
object MediaRecorderEventMap {
  
  @scala.inline
  def apply(
    dataavailable: BlobEvent,
    error: MediaRecorderErrorEvent,
    pause: Event,
    resume: Event,
    start: Event,
    stop: Event
  ): MediaRecorderEventMap = {
    val __obj = js.Dynamic.literal(dataavailable = dataavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderEventMap]
  }
  
  @scala.inline
  implicit class MediaRecorderEventMapOps[Self <: MediaRecorderEventMap] (val x: Self) extends AnyVal {
    
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
    def setDataavailable(value: BlobEvent): Self = this.set("dataavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: MediaRecorderErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: Event): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: Event): Self = this.set("resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Event): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Event): Self = this.set("stop", value.asInstanceOf[js.Any])
  }
}
