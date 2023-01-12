package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsStatsDataCounts extends StObject {
  
  var skipped_docs_count: integer
  
  var test_docs_count: integer
  
  var training_docs_count: integer
}
object MlDataframeAnalyticsStatsDataCounts {
  
  inline def apply(skipped_docs_count: integer, test_docs_count: integer, training_docs_count: integer): MlDataframeAnalyticsStatsDataCounts = {
    val __obj = js.Dynamic.literal(skipped_docs_count = skipped_docs_count.asInstanceOf[js.Any], test_docs_count = test_docs_count.asInstanceOf[js.Any], training_docs_count = training_docs_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsStatsDataCounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeAnalyticsStatsDataCounts] (val x: Self) extends AnyVal {
    
    inline def setSkipped_docs_count(value: integer): Self = StObject.set(x, "skipped_docs_count", value.asInstanceOf[js.Any])
    
    inline def setTest_docs_count(value: integer): Self = StObject.set(x, "test_docs_count", value.asInstanceOf[js.Any])
    
    inline def setTraining_docs_count(value: integer): Self = StObject.set(x, "training_docs_count", value.asInstanceOf[js.Any])
  }
}
