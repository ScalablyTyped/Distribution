package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisCustomNormalizer
  extends StObject
     with AnalysisNormalizer {
  
  var char_filter: js.UndefOr[js.Array[String]] = js.undefined
  
  var filter: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: custom
}
object AnalysisCustomNormalizer {
  
  inline def apply(): AnalysisCustomNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[AnalysisCustomNormalizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisCustomNormalizer] (val x: Self) extends AnyVal {
    
    inline def setChar_filter(value: js.Array[String]): Self = StObject.set(x, "char_filter", value.asInstanceOf[js.Any])
    
    inline def setChar_filterUndefined: Self = StObject.set(x, "char_filter", js.undefined)
    
    inline def setChar_filterVarargs(value: String*): Self = StObject.set(x, "char_filter", js.Array(value*))
    
    inline def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
