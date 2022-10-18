package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermsEnumResponse extends StObject {
  
  var _shards: ShardStatistics
  
  var complete: Boolean
  
  var terms: js.Array[String]
}
object TermsEnumResponse {
  
  inline def apply(_shards: ShardStatistics, complete: Boolean, terms: js.Array[String]): TermsEnumResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermsEnumResponse]
  }
  
  extension [Self <: TermsEnumResponse](x: Self) {
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: js.Array[String]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: String*): Self = StObject.set(x, "terms", js.Array(value*))
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
