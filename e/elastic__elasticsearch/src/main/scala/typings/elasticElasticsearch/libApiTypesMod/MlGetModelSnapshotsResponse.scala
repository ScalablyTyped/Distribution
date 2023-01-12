package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetModelSnapshotsResponse extends StObject {
  
  var count: long
  
  var model_snapshots: js.Array[MlModelSnapshot]
}
object MlGetModelSnapshotsResponse {
  
  inline def apply(count: long, model_snapshots: js.Array[MlModelSnapshot]): MlGetModelSnapshotsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], model_snapshots = model_snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetModelSnapshotsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetModelSnapshotsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshots(value: js.Array[MlModelSnapshot]): Self = StObject.set(x, "model_snapshots", value.asInstanceOf[js.Any])
    
    inline def setModel_snapshotsVarargs(value: MlModelSnapshot*): Self = StObject.set(x, "model_snapshots", js.Array(value*))
  }
}
