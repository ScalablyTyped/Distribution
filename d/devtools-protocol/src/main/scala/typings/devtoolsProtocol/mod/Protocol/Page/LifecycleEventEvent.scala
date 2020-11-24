package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import typings.devtoolsProtocol.mod.Protocol.Network.MonotonicTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleEventEvent extends js.Object {
  
  /**
    * Id of the frame.
    */
  var frameId: FrameId = js.native
  
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId = js.native
  
  var name: String = js.native
  
  var timestamp: MonotonicTime = js.native
}
object LifecycleEventEvent {
  
  @scala.inline
  def apply(frameId: FrameId, loaderId: LoaderId, name: String, timestamp: MonotonicTime): LifecycleEventEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleEventEvent]
  }
  
  @scala.inline
  implicit class LifecycleEventEventOps[Self <: LifecycleEventEvent] (val x: Self) extends AnyVal {
    
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
    def setLoaderId(value: LoaderId): Self = this.set("loaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
