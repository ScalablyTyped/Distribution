package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateModelSnapshotResponse extends StObject {
  
  var acknowledged: Boolean
  
  var model: MlModelSnapshot
}
object MlUpdateModelSnapshotResponse {
  
  inline def apply(acknowledged: Boolean, model: MlModelSnapshot): MlUpdateModelSnapshotResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateModelSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlUpdateModelSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setModel(value: MlModelSnapshot): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
