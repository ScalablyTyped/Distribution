package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotGetSnapshotResponseItem extends StObject {
  
  var error: js.UndefOr[ErrorCause] = js.undefined
  
  var repository: Name
  
  var snapshots: js.UndefOr[js.Array[SnapshotSnapshotInfo]] = js.undefined
}
object SnapshotGetSnapshotResponseItem {
  
  inline def apply(repository: Name): SnapshotGetSnapshotResponseItem = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotGetSnapshotResponseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotGetSnapshotResponseItem] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRepository(value: Name): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSnapshots(value: js.Array[SnapshotSnapshotInfo]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: SnapshotSnapshotInfo*): Self = StObject.set(x, "snapshots", js.Array(value*))
  }
}
