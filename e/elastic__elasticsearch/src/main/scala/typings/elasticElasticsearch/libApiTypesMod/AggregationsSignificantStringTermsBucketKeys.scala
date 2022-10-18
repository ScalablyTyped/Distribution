package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsSignificantStringTermsBucketKeys
  extends StObject
     with AggregationsSignificantTermsBucketBase {
  
  var key: String
}
object AggregationsSignificantStringTermsBucketKeys {
  
  inline def apply(bg_count: long, doc_count: long, key: String, score: double): AggregationsSignificantStringTermsBucketKeys = {
    val __obj = js.Dynamic.literal(bg_count = bg_count.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsSignificantStringTermsBucketKeys]
  }
  
  extension [Self <: AggregationsSignificantStringTermsBucketKeys](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
