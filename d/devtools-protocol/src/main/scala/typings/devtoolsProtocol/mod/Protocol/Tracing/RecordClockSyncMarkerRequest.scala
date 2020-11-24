package typings.devtoolsProtocol.mod.Protocol.Tracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordClockSyncMarkerRequest extends js.Object {
  
  /**
    * The ID of this clock sync marker
    */
  var syncId: String = js.native
}
object RecordClockSyncMarkerRequest {
  
  @scala.inline
  def apply(syncId: String): RecordClockSyncMarkerRequest = {
    val __obj = js.Dynamic.literal(syncId = syncId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordClockSyncMarkerRequest]
  }
  
  @scala.inline
  implicit class RecordClockSyncMarkerRequestOps[Self <: RecordClockSyncMarkerRequest] (val x: Self) extends AnyVal {
    
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
    def setSyncId(value: String): Self = this.set("syncId", value.asInstanceOf[js.Any])
  }
}
