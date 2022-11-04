package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStringTermsBucketKeys
  extends StObject
     with AggregationsTermsBucketBase {
  
  var key: FieldValue
}
object AggregationsStringTermsBucketKeys {
  
  inline def apply(doc_count: long): AggregationsStringTermsBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = null)
    __obj.asInstanceOf[AggregationsStringTermsBucketKeys]
  }
  
  extension [Self <: AggregationsStringTermsBucketKeys](x: Self) {
    
    inline def setKey(value: FieldValue): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
  }
}
