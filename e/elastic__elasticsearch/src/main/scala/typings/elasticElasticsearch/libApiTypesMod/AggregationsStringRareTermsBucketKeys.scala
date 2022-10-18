package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsStringRareTermsBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: String
}
object AggregationsStringRareTermsBucketKeys {
  
  inline def apply(doc_count: long, key: String): AggregationsStringRareTermsBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsStringRareTermsBucketKeys]
  }
  
  extension [Self <: AggregationsStringRareTermsBucketKeys](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
