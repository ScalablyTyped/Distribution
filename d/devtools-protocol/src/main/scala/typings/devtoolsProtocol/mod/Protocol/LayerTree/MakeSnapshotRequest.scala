package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeSnapshotRequest extends StObject {
  
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
  implicit class MakeSnapshotRequestMutableBuilder[Self <: MakeSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerId(value: LayerId): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
