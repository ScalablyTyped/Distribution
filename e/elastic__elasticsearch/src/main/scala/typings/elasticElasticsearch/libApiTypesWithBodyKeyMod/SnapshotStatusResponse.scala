package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotStatusResponse extends StObject {
  
  var snapshots: js.Array[SnapshotStatus]
}
object SnapshotStatusResponse {
  
  inline def apply(snapshots: js.Array[SnapshotStatus]): SnapshotStatusResponse = {
    val __obj = js.Dynamic.literal(snapshots = snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotStatusResponse]
  }
  
  extension [Self <: SnapshotStatusResponse](x: Self) {
    
    inline def setSnapshots(value: js.Array[SnapshotStatus]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsVarargs(value: SnapshotStatus*): Self = StObject.set(x, "snapshots", js.Array(value*))
  }
}
