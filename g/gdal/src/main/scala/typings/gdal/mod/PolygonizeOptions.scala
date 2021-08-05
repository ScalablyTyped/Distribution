package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonizeOptions extends StObject {
  
  var connectedness: js.UndefOr[Double] = js.undefined
  
  var dst: Layer
  
  var mask: js.UndefOr[RasterBand] = js.undefined
  
  var pixValField: Double
  
  var src: RasterBand
  
  var useFloats: js.UndefOr[Boolean] = js.undefined
}
object PolygonizeOptions {
  
  inline def apply(dst: Layer, pixValField: Double, src: RasterBand): PolygonizeOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], pixValField = pixValField.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonizeOptions]
  }
  
  extension [Self <: PolygonizeOptions](x: Self) {
    
    inline def setConnectedness(value: Double): Self = StObject.set(x, "connectedness", value.asInstanceOf[js.Any])
    
    inline def setConnectednessUndefined: Self = StObject.set(x, "connectedness", js.undefined)
    
    inline def setDst(value: Layer): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    
    inline def setMask(value: RasterBand): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setPixValField(value: Double): Self = StObject.set(x, "pixValField", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: RasterBand): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setUseFloats(value: Boolean): Self = StObject.set(x, "useFloats", value.asInstanceOf[js.Any])
    
    inline def setUseFloatsUndefined: Self = StObject.set(x, "useFloats", js.undefined)
  }
}
