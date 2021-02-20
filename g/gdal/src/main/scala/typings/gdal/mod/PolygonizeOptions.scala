package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonizeOptions extends StObject {
  
  var connectedness: js.UndefOr[Double] = js.native
  
  var dst: Layer = js.native
  
  var mask: js.UndefOr[RasterBand] = js.native
  
  var pixValField: Double = js.native
  
  var src: RasterBand = js.native
  
  var useFloats: js.UndefOr[Boolean] = js.native
}
object PolygonizeOptions {
  
  @scala.inline
  def apply(dst: Layer, pixValField: Double, src: RasterBand): PolygonizeOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], pixValField = pixValField.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonizeOptions]
  }
  
  @scala.inline
  implicit class PolygonizeOptionsMutableBuilder[Self <: PolygonizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectedness(value: Double): Self = StObject.set(x, "connectedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectednessUndefined: Self = StObject.set(x, "connectedness", js.undefined)
    
    @scala.inline
    def setDst(value: Layer): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: RasterBand): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setPixValField(value: Double): Self = StObject.set(x, "pixValField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: RasterBand): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFloats(value: Boolean): Self = StObject.set(x, "useFloats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFloatsUndefined: Self = StObject.set(x, "useFloats", js.undefined)
  }
}
