package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStructureFindStructureFieldStat extends StObject {
  
  var cardinality: integer
  
  var count: integer
  
  var earliest: js.UndefOr[String] = js.undefined
  
  var latest: js.UndefOr[String] = js.undefined
  
  var max_value: js.UndefOr[integer] = js.undefined
  
  var mean_value: js.UndefOr[integer] = js.undefined
  
  var median_value: js.UndefOr[integer] = js.undefined
  
  var min_value: js.UndefOr[integer] = js.undefined
  
  var top_hits: js.Array[TextStructureFindStructureTopHit]
}
object TextStructureFindStructureFieldStat {
  
  inline def apply(cardinality: integer, count: integer, top_hits: js.Array[TextStructureFindStructureTopHit]): TextStructureFindStructureFieldStat = {
    val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], top_hits = top_hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStructureFindStructureFieldStat]
  }
  
  extension [Self <: TextStructureFindStructureFieldStat](x: Self) {
    
    inline def setCardinality(value: integer): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEarliest(value: String): Self = StObject.set(x, "earliest", value.asInstanceOf[js.Any])
    
    inline def setEarliestUndefined: Self = StObject.set(x, "earliest", js.undefined)
    
    inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
    
    inline def setMax_value(value: integer): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
    
    inline def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
    
    inline def setMean_value(value: integer): Self = StObject.set(x, "mean_value", value.asInstanceOf[js.Any])
    
    inline def setMean_valueUndefined: Self = StObject.set(x, "mean_value", js.undefined)
    
    inline def setMedian_value(value: integer): Self = StObject.set(x, "median_value", value.asInstanceOf[js.Any])
    
    inline def setMedian_valueUndefined: Self = StObject.set(x, "median_value", js.undefined)
    
    inline def setMin_value(value: integer): Self = StObject.set(x, "min_value", value.asInstanceOf[js.Any])
    
    inline def setMin_valueUndefined: Self = StObject.set(x, "min_value", js.undefined)
    
    inline def setTop_hits(value: js.Array[TextStructureFindStructureTopHit]): Self = StObject.set(x, "top_hits", value.asInstanceOf[js.Any])
    
    inline def setTop_hitsVarargs(value: TextStructureFindStructureTopHit*): Self = StObject.set(x, "top_hits", js.Array(value*))
  }
}
