package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContourGenerateOptions extends StObject {
  
  var dst: Layer
  
  var elevField: js.UndefOr[Double] = js.undefined
  
  var fixedLevels: js.UndefOr[js.Array[Double]] = js.undefined
  
  var idField: js.UndefOr[Double] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var nodata: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var src: RasterBand
}
object ContourGenerateOptions {
  
  inline def apply(dst: Layer, src: RasterBand): ContourGenerateOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourGenerateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContourGenerateOptions] (val x: Self) extends AnyVal {
    
    inline def setDst(value: Layer): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    
    inline def setElevField(value: Double): Self = StObject.set(x, "elevField", value.asInstanceOf[js.Any])
    
    inline def setElevFieldUndefined: Self = StObject.set(x, "elevField", js.undefined)
    
    inline def setFixedLevels(value: js.Array[Double]): Self = StObject.set(x, "fixedLevels", value.asInstanceOf[js.Any])
    
    inline def setFixedLevelsUndefined: Self = StObject.set(x, "fixedLevels", js.undefined)
    
    inline def setFixedLevelsVarargs(value: Double*): Self = StObject.set(x, "fixedLevels", js.Array(value*))
    
    inline def setIdField(value: Double): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
    
    inline def setIdFieldUndefined: Self = StObject.set(x, "idField", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setNodata(value: Double): Self = StObject.set(x, "nodata", value.asInstanceOf[js.Any])
    
    inline def setNodataUndefined: Self = StObject.set(x, "nodata", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSrc(value: RasterBand): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
