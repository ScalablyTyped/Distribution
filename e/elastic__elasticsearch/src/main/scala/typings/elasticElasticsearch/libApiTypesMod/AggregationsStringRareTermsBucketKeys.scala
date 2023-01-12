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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsStringRareTermsBucketKeys] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
