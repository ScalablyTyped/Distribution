package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlExplainDataFrameAnalyticsResponse extends StObject {
  
  var field_selection: js.Array[MlDataframeAnalyticsFieldSelection]
  
  var memory_estimation: MlDataframeAnalyticsMemoryEstimation
}
object MlExplainDataFrameAnalyticsResponse {
  
  inline def apply(
    field_selection: js.Array[MlDataframeAnalyticsFieldSelection],
    memory_estimation: MlDataframeAnalyticsMemoryEstimation
  ): MlExplainDataFrameAnalyticsResponse = {
    val __obj = js.Dynamic.literal(field_selection = field_selection.asInstanceOf[js.Any], memory_estimation = memory_estimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlExplainDataFrameAnalyticsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlExplainDataFrameAnalyticsResponse] (val x: Self) extends AnyVal {
    
    inline def setField_selection(value: js.Array[MlDataframeAnalyticsFieldSelection]): Self = StObject.set(x, "field_selection", value.asInstanceOf[js.Any])
    
    inline def setField_selectionVarargs(value: MlDataframeAnalyticsFieldSelection*): Self = StObject.set(x, "field_selection", js.Array(value*))
    
    inline def setMemory_estimation(value: MlDataframeAnalyticsMemoryEstimation): Self = StObject.set(x, "memory_estimation", value.asInstanceOf[js.Any])
  }
}
