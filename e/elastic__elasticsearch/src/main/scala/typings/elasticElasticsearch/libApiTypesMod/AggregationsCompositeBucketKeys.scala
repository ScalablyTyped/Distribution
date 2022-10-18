package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCompositeBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: Record[String, Any]
}
object AggregationsCompositeBucketKeys {
  
  inline def apply(doc_count: long, key: Record[String, Any]): AggregationsCompositeBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsCompositeBucketKeys]
  }
  
  extension [Self <: AggregationsCompositeBucketKeys](x: Self) {
    
    inline def setKey(value: Record[String, Any]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
