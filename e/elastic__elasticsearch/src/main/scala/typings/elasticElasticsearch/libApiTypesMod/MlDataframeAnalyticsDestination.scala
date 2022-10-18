package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsDestination extends StObject {
  
  var index: IndexName
  
  var results_field: js.UndefOr[Field] = js.undefined
}
object MlDataframeAnalyticsDestination {
  
  inline def apply(index: IndexName): MlDataframeAnalyticsDestination = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsDestination]
  }
  
  extension [Self <: MlDataframeAnalyticsDestination](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setResults_field(value: Field): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
  }
}
