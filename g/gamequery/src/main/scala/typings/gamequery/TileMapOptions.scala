package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileMapOptions extends StObject {
  
  var buffer: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var posx: js.UndefOr[Double] = js.undefined
  
  var posy: js.UndefOr[Double] = js.undefined
  
  var sizex: js.UndefOr[Double] = js.undefined
  
  var sizey: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TileMapOptions {
  
  inline def apply(): TileMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileMapOptions] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPosx(value: Double): Self = StObject.set(x, "posx", value.asInstanceOf[js.Any])
    
    inline def setPosxUndefined: Self = StObject.set(x, "posx", js.undefined)
    
    inline def setPosy(value: Double): Self = StObject.set(x, "posy", value.asInstanceOf[js.Any])
    
    inline def setPosyUndefined: Self = StObject.set(x, "posy", js.undefined)
    
    inline def setSizex(value: Double): Self = StObject.set(x, "sizex", value.asInstanceOf[js.Any])
    
    inline def setSizexUndefined: Self = StObject.set(x, "sizex", js.undefined)
    
    inline def setSizey(value: Double): Self = StObject.set(x, "sizey", value.asInstanceOf[js.Any])
    
    inline def setSizeyUndefined: Self = StObject.set(x, "sizey", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
