package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSignificantTermsBucketBase
  extends StObject
     with AggregationsMultiBucketBase {
  
  var bg_count: long
  
  var score: double
}
object AggregationsSignificantTermsBucketBase {
  
  inline def apply(bg_count: long, doc_count: long, score: double): AggregationsSignificantTermsBucketBase = {
    val __obj = js.Dynamic.literal(bg_count = bg_count.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSignificantTermsBucketBase]
  }
  
  extension [Self <: AggregationsSignificantTermsBucketBase](x: Self) {
    
    inline def setBg_count(value: long): Self = StObject.set(x, "bg_count", value.asInstanceOf[js.Any])
    
    inline def setScore(value: double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
