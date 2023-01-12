package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterBandPixelsReadOptions extends StObject {
  
  var buffer_height: js.UndefOr[Double] = js.undefined
  
  var buffer_width: js.UndefOr[Double] = js.undefined
  
  var data_type: js.UndefOr[String] = js.undefined
  
  var line_space: js.UndefOr[Double] = js.undefined
  
  var pixel_space: js.UndefOr[Double] = js.undefined
}
object RasterBandPixelsReadOptions {
  
  inline def apply(): RasterBandPixelsReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterBandPixelsReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterBandPixelsReadOptions] (val x: Self) extends AnyVal {
    
    inline def setBuffer_height(value: Double): Self = StObject.set(x, "buffer_height", value.asInstanceOf[js.Any])
    
    inline def setBuffer_heightUndefined: Self = StObject.set(x, "buffer_height", js.undefined)
    
    inline def setBuffer_width(value: Double): Self = StObject.set(x, "buffer_width", value.asInstanceOf[js.Any])
    
    inline def setBuffer_widthUndefined: Self = StObject.set(x, "buffer_width", js.undefined)
    
    inline def setData_type(value: String): Self = StObject.set(x, "data_type", value.asInstanceOf[js.Any])
    
    inline def setData_typeUndefined: Self = StObject.set(x, "data_type", js.undefined)
    
    inline def setLine_space(value: Double): Self = StObject.set(x, "line_space", value.asInstanceOf[js.Any])
    
    inline def setLine_spaceUndefined: Self = StObject.set(x, "line_space", js.undefined)
    
    inline def setPixel_space(value: Double): Self = StObject.set(x, "pixel_space", value.asInstanceOf[js.Any])
    
    inline def setPixel_spaceUndefined: Self = StObject.set(x, "pixel_space", js.undefined)
  }
}
