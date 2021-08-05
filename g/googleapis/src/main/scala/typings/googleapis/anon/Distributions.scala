package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distributions extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var distributions: js.UndefOr[js.Array[Max]] = js.undefined
  
  var median: js.UndefOr[Double] = js.undefined
}
object Distributions {
  
  inline def apply(): Distributions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distributions]
  }
  
  extension [Self <: Distributions](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDistributions(value: js.Array[Max]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: Max*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    inline def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
  }
}
