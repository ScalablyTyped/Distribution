package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseSnapshotRequest extends StObject {
  
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId
}
object ReleaseSnapshotRequest {
  
  @scala.inline
  def apply(snapshotId: SnapshotId): ReleaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSnapshotRequest]
  }
  
  @scala.inline
  implicit class ReleaseSnapshotRequestMutableBuilder[Self <: ReleaseSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
  }
}
