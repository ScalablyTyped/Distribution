package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCompositeBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: AggregationsCompositeAggregateKey
}
object AggregationsCompositeBucketKeys {
  
  inline def apply(doc_count: long, key: AggregationsCompositeAggregateKey): AggregationsCompositeBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsCompositeBucketKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsCompositeBucketKeys] (val x: Self) extends AnyVal {
    
    inline def setKey(value: AggregationsCompositeAggregateKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
