package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStringTermsBucketKeys
  extends StObject
     with AggregationsTermsBucketBase {
  
  var key: String
}
object AggregationsStringTermsBucketKeys {
  
  inline def apply(doc_count: long, key: String): AggregationsStringTermsBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsStringTermsBucketKeys]
  }
  
  extension [Self <: AggregationsStringTermsBucketKeys](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
