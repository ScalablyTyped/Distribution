package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSimilarity extends StObject {
  
  var bm25: js.UndefOr[IndicesSettingsSimilarityBm25] = js.undefined
  
  var dfi: js.UndefOr[IndicesSettingsSimilarityDfi] = js.undefined
  
  var dfr: js.UndefOr[IndicesSettingsSimilarityDfr] = js.undefined
  
  var ib: js.UndefOr[IndicesSettingsSimilarityIb] = js.undefined
  
  var lmd: js.UndefOr[IndicesSettingsSimilarityLmd] = js.undefined
  
  var lmj: js.UndefOr[IndicesSettingsSimilarityLmj] = js.undefined
  
  var scripted_tfidf: js.UndefOr[IndicesSettingsSimilarityScriptedTfidf] = js.undefined
}
object IndicesSettingsSimilarity {
  
  inline def apply(): IndicesSettingsSimilarity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSettingsSimilarity]
  }
  
  extension [Self <: IndicesSettingsSimilarity](x: Self) {
    
    inline def setBm25(value: IndicesSettingsSimilarityBm25): Self = StObject.set(x, "bm25", value.asInstanceOf[js.Any])
    
    inline def setBm25Undefined: Self = StObject.set(x, "bm25", js.undefined)
    
    inline def setDfi(value: IndicesSettingsSimilarityDfi): Self = StObject.set(x, "dfi", value.asInstanceOf[js.Any])
    
    inline def setDfiUndefined: Self = StObject.set(x, "dfi", js.undefined)
    
    inline def setDfr(value: IndicesSettingsSimilarityDfr): Self = StObject.set(x, "dfr", value.asInstanceOf[js.Any])
    
    inline def setDfrUndefined: Self = StObject.set(x, "dfr", js.undefined)
    
    inline def setIb(value: IndicesSettingsSimilarityIb): Self = StObject.set(x, "ib", value.asInstanceOf[js.Any])
    
    inline def setIbUndefined: Self = StObject.set(x, "ib", js.undefined)
    
    inline def setLmd(value: IndicesSettingsSimilarityLmd): Self = StObject.set(x, "lmd", value.asInstanceOf[js.Any])
    
    inline def setLmdUndefined: Self = StObject.set(x, "lmd", js.undefined)
    
    inline def setLmj(value: IndicesSettingsSimilarityLmj): Self = StObject.set(x, "lmj", value.asInstanceOf[js.Any])
    
    inline def setLmjUndefined: Self = StObject.set(x, "lmj", js.undefined)
    
    inline def setScripted_tfidf(value: IndicesSettingsSimilarityScriptedTfidf): Self = StObject.set(x, "scripted_tfidf", value.asInstanceOf[js.Any])
    
    inline def setScripted_tfidfUndefined: Self = StObject.set(x, "scripted_tfidf", js.undefined)
  }
}
