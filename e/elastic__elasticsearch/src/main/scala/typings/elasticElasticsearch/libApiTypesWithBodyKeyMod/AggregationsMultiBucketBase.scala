package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMultiBucketBase extends StObject {
  
  var doc_count: long
}
object AggregationsMultiBucketBase {
  
  inline def apply(doc_count: long): AggregationsMultiBucketBase = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMultiBucketBase]
  }
  
  extension [Self <: AggregationsMultiBucketBase](x: Self) {
    
    inline def setDoc_count(value: long): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
  }
}
