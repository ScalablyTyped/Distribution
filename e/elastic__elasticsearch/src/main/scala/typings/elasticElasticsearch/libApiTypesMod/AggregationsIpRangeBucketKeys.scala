package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsIpRangeBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var from: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object AggregationsIpRangeBucketKeys {
  
  inline def apply(doc_count: long): AggregationsIpRangeBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsIpRangeBucketKeys]
  }
  
  extension [Self <: AggregationsIpRangeBucketKeys](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
