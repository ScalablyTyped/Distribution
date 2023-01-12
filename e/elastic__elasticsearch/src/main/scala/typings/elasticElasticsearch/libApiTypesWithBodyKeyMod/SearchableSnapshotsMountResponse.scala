package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsMountResponse extends StObject {
  
  var snapshot: SearchableSnapshotsMountMountedSnapshot
}
object SearchableSnapshotsMountResponse {
  
  inline def apply(snapshot: SearchableSnapshotsMountMountedSnapshot): SearchableSnapshotsMountResponse = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsMountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchableSnapshotsMountResponse] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: SearchableSnapshotsMountMountedSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
