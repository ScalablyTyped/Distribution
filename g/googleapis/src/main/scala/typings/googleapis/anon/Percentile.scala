package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Percentile extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var distributions: js.UndefOr[js.Array[Max]] = js.undefined
  
  var percentile: js.UndefOr[Double] = js.undefined
}
object Percentile {
  
  inline def apply(): Percentile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percentile]
  }
  
  extension [Self <: Percentile](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDistributions(value: js.Array[Max]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: Max*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    inline def setPercentile(value: Double): Self = StObject.set(x, "percentile", value.asInstanceOf[js.Any])
    
    inline def setPercentileUndefined: Self = StObject.set(x, "percentile", js.undefined)
  }
}
