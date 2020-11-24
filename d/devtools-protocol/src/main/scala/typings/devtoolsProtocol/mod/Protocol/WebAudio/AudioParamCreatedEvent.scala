package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioParamCreatedEvent extends js.Object {
  
  var param: AudioParam = js.native
}
object AudioParamCreatedEvent {
  
  @scala.inline
  def apply(param: AudioParam): AudioParamCreatedEvent = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamCreatedEvent]
  }
  
  @scala.inline
  implicit class AudioParamCreatedEventOps[Self <: AudioParamCreatedEvent] (val x: Self) extends AnyVal {
    
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
    def setParam(value: AudioParam): Self = this.set("param", value.asInstanceOf[js.Any])
  }
}
