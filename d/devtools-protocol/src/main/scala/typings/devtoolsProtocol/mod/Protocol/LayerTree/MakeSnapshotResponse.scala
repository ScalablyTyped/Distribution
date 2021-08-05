package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeSnapshotResponse extends StObject {
  
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId
}
object MakeSnapshotResponse {
  
  inline def apply(snapshotId: SnapshotId): MakeSnapshotResponse = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeSnapshotResponse]
  }
  
  extension [Self <: MakeSnapshotResponse](x: Self) {
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
  }
}
