package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelLocation extends StObject {
  
  var index: MlTrainedModelLocationIndex
}
object MlTrainedModelLocation {
  
  inline def apply(index: MlTrainedModelLocationIndex): MlTrainedModelLocation = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelLocation]
  }
  
  extension [Self <: MlTrainedModelLocation](x: Self) {
    
    inline def setIndex(value: MlTrainedModelLocationIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
