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
  
  @scala.inline
  def apply(): TileMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMapOptions]
  }
  
  @scala.inline
  implicit class TileMapOptionsMutableBuilder[Self <: TileMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPosx(value: Double): Self = StObject.set(x, "posx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosxUndefined: Self = StObject.set(x, "posx", js.undefined)
    
    @scala.inline
    def setPosy(value: Double): Self = StObject.set(x, "posy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosyUndefined: Self = StObject.set(x, "posy", js.undefined)
    
    @scala.inline
    def setSizex(value: Double): Self = StObject.set(x, "sizex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizexUndefined: Self = StObject.set(x, "sizex", js.undefined)
    
    @scala.inline
    def setSizey(value: Double): Self = StObject.set(x, "sizey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeyUndefined: Self = StObject.set(x, "sizey", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
