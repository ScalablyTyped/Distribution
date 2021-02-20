package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SieveFilterOptions extends StObject {
  
  var connectedness: js.UndefOr[Double] = js.native
  
  var dst: RasterBand = js.native
  
  var mask: js.UndefOr[RasterBand] = js.native
  
  var src: RasterBand = js.native
  
  var threshold: Double = js.native
}
object SieveFilterOptions {
  
  @scala.inline
  def apply(dst: RasterBand, src: RasterBand, threshold: Double): SieveFilterOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SieveFilterOptions]
  }
  
  @scala.inline
  implicit class SieveFilterOptionsMutableBuilder[Self <: SieveFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectedness(value: Double): Self = StObject.set(x, "connectedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectednessUndefined: Self = StObject.set(x, "connectedness", js.undefined)
    
    @scala.inline
    def setDst(value: RasterBand): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: RasterBand): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setSrc(value: RasterBand): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
