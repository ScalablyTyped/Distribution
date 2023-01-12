package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SieveFilterOptions extends StObject {
  
  var connectedness: js.UndefOr[Double] = js.undefined
  
  var dst: RasterBand
  
  var mask: js.UndefOr[RasterBand] = js.undefined
  
  var src: RasterBand
  
  var threshold: Double
}
object SieveFilterOptions {
  
  inline def apply(dst: RasterBand, src: RasterBand, threshold: Double): SieveFilterOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SieveFilterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SieveFilterOptions] (val x: Self) extends AnyVal {
    
    inline def setConnectedness(value: Double): Self = StObject.set(x, "connectedness", value.asInstanceOf[js.Any])
    
    inline def setConnectednessUndefined: Self = StObject.set(x, "connectedness", js.undefined)
    
    inline def setDst(value: RasterBand): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    
    inline def setMask(value: RasterBand): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setSrc(value: RasterBand): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
