package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPreviewDataFrameAnalyticsResponse extends StObject {
  
  var feature_values: js.Array[Record[Field, String]]
}
object MlPreviewDataFrameAnalyticsResponse {
  
  inline def apply(feature_values: js.Array[Record[Field, String]]): MlPreviewDataFrameAnalyticsResponse = {
    val __obj = js.Dynamic.literal(feature_values = feature_values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPreviewDataFrameAnalyticsResponse]
  }
  
  extension [Self <: MlPreviewDataFrameAnalyticsResponse](x: Self) {
    
    inline def setFeature_values(value: js.Array[Record[Field, String]]): Self = StObject.set(x, "feature_values", value.asInstanceOf[js.Any])
    
    inline def setFeature_valuesVarargs(value: (Record[Field, String])*): Self = StObject.set(x, "feature_values", js.Array(value*))
  }
}
