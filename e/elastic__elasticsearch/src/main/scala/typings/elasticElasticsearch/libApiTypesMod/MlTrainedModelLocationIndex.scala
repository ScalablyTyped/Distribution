package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelLocationIndex extends StObject {
  
  var name: IndexName
}
object MlTrainedModelLocationIndex {
  
  inline def apply(name: IndexName): MlTrainedModelLocationIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelLocationIndex]
  }
  
  extension [Self <: MlTrainedModelLocationIndex](x: Self) {
    
    inline def setName(value: IndexName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
