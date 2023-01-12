package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fog extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var fog: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var vertexColors: js.UndefOr[Double] = js.undefined
}
object Fog {
  
  inline def apply(): Fog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fog] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
    
    inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVertexColors(value: Double): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
    
    inline def setVertexColorsUndefined: Self = StObject.set(x, "vertexColors", js.undefined)
  }
}
