package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlRevertModelSnapshotResponse extends StObject {
  
  var model: MlModelSnapshot
}
object MlRevertModelSnapshotResponse {
  
  inline def apply(model: MlModelSnapshot): MlRevertModelSnapshotResponse = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRevertModelSnapshotResponse]
  }
  
  extension [Self <: MlRevertModelSnapshotResponse](x: Self) {
    
    inline def setModel(value: MlModelSnapshot): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
