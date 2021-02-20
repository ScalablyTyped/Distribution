package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillNoDataOptions extends StObject {
  
  var mask: js.UndefOr[RasterBand] = js.native
  
  var searchDist: Double = js.native
  
  var smoothingIterations: js.UndefOr[Double] = js.native
  
  var src: RasterBand = js.native
}
object FillNoDataOptions {
  
  @scala.inline
  def apply(searchDist: Double, src: RasterBand): FillNoDataOptions = {
    val __obj = js.Dynamic.literal(searchDist = searchDist.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillNoDataOptions]
  }
  
  @scala.inline
  implicit class FillNoDataOptionsMutableBuilder[Self <: FillNoDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMask(value: RasterBand): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setSearchDist(value: Double): Self = StObject.set(x, "searchDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothingIterations(value: Double): Self = StObject.set(x, "smoothingIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothingIterationsUndefined: Self = StObject.set(x, "smoothingIterations", js.undefined)
    
    @scala.inline
    def setSrc(value: RasterBand): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
