package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCommandLogRequest extends StObject {
  
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId = js.native
}
object SnapshotCommandLogRequest {
  
  @scala.inline
  def apply(snapshotId: SnapshotId): SnapshotCommandLogRequest = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCommandLogRequest]
  }
  
  @scala.inline
  implicit class SnapshotCommandLogRequestMutableBuilder[Self <: SnapshotCommandLogRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
  }
}
