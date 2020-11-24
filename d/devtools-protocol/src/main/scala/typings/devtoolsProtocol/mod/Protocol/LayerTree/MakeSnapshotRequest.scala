package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeSnapshotRequest extends js.Object {
  
  /**
    * The id of the layer.
    */
  var layerId: LayerId = js.native
}
object MakeSnapshotRequest {
  
  @scala.inline
  def apply(layerId: LayerId): MakeSnapshotRequest = {
    val __obj = js.Dynamic.literal(layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeSnapshotRequest]
  }
  
  @scala.inline
  implicit class MakeSnapshotRequestOps[Self <: MakeSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setLayerId(value: LayerId): Self = this.set("layerId", value.asInstanceOf[js.Any])
  }
}
