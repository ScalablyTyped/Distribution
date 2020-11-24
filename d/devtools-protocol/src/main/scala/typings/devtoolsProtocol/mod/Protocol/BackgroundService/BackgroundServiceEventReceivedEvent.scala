package typings.devtoolsProtocol.mod.Protocol.BackgroundService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundServiceEventReceivedEvent extends js.Object {
  
  var backgroundServiceEvent: BackgroundServiceEvent = js.native
}
object BackgroundServiceEventReceivedEvent {
  
  @scala.inline
  def apply(backgroundServiceEvent: BackgroundServiceEvent): BackgroundServiceEventReceivedEvent = {
    val __obj = js.Dynamic.literal(backgroundServiceEvent = backgroundServiceEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundServiceEventReceivedEvent]
  }
  
  @scala.inline
  implicit class BackgroundServiceEventReceivedEventOps[Self <: BackgroundServiceEventReceivedEvent] (val x: Self) extends AnyVal {
    
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
    def setBackgroundServiceEvent(value: BackgroundServiceEvent): Self = this.set("backgroundServiceEvent", value.asInstanceOf[js.Any])
  }
}
