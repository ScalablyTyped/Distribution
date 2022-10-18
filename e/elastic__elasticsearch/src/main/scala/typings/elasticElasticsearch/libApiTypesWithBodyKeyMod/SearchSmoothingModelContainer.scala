package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSmoothingModelContainer extends StObject {
  
  var laplace: js.UndefOr[SearchLaplaceSmoothingModel] = js.undefined
  
  var linear_interpolation: js.UndefOr[SearchLinearInterpolationSmoothingModel] = js.undefined
  
  var stupid_backoff: js.UndefOr[SearchStupidBackoffSmoothingModel] = js.undefined
}
object SearchSmoothingModelContainer {
  
  inline def apply(): SearchSmoothingModelContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSmoothingModelContainer]
  }
  
  extension [Self <: SearchSmoothingModelContainer](x: Self) {
    
    inline def setLaplace(value: SearchLaplaceSmoothingModel): Self = StObject.set(x, "laplace", value.asInstanceOf[js.Any])
    
    inline def setLaplaceUndefined: Self = StObject.set(x, "laplace", js.undefined)
    
    inline def setLinear_interpolation(value: SearchLinearInterpolationSmoothingModel): Self = StObject.set(x, "linear_interpolation", value.asInstanceOf[js.Any])
    
    inline def setLinear_interpolationUndefined: Self = StObject.set(x, "linear_interpolation", js.undefined)
    
    inline def setStupid_backoff(value: SearchStupidBackoffSmoothingModel): Self = StObject.set(x, "stupid_backoff", value.asInstanceOf[js.Any])
    
    inline def setStupid_backoffUndefined: Self = StObject.set(x, "stupid_backoff", js.undefined)
  }
}
