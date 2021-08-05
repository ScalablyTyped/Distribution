package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillNoDataOptions extends StObject {
  
  var mask: js.UndefOr[RasterBand] = js.undefined
  
  var searchDist: Double
  
  var smoothingIterations: js.UndefOr[Double] = js.undefined
  
  var src: RasterBand
}
object FillNoDataOptions {
  
  inline def apply(searchDist: Double, src: RasterBand): FillNoDataOptions = {
    val __obj = js.Dynamic.literal(searchDist = searchDist.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillNoDataOptions]
  }
  
  extension [Self <: FillNoDataOptions](x: Self) {
    
    inline def setMask(value: RasterBand): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setSearchDist(value: Double): Self = StObject.set(x, "searchDist", value.asInstanceOf[js.Any])
    
    inline def setSmoothingIterations(value: Double): Self = StObject.set(x, "smoothingIterations", value.asInstanceOf[js.Any])
    
    inline def setSmoothingIterationsUndefined: Self = StObject.set(x, "smoothingIterations", js.undefined)
    
    inline def setSrc(value: RasterBand): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
