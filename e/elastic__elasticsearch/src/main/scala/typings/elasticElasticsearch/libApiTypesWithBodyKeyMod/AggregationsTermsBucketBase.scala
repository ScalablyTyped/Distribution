package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTermsBucketBase
  extends StObject
     with AggregationsMultiBucketBase {
  
  var doc_count_error: js.UndefOr[long] = js.undefined
}
object AggregationsTermsBucketBase {
  
  inline def apply(doc_count: long): AggregationsTermsBucketBase = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTermsBucketBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsTermsBucketBase] (val x: Self) extends AnyVal {
    
    inline def setDoc_count_error(value: long): Self = StObject.set(x, "doc_count_error", value.asInstanceOf[js.Any])
    
    inline def setDoc_count_errorUndefined: Self = StObject.set(x, "doc_count_error", js.undefined)
  }
}
