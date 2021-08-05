package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeSnapshotRequest extends StObject {
  
  /**
    * The id of the layer.
    */
  var layerId: LayerId
}
object MakeSnapshotRequest {
  
  inline def apply(layerId: LayerId): MakeSnapshotRequest = {
    val __obj = js.Dynamic.literal(layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeSnapshotRequest]
  }
  
  extension [Self <: MakeSnapshotRequest](x: Self) {
    
    inline def setLayerId(value: LayerId): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
