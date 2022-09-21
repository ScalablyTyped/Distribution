package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blur extends StObject {
  
  /**
    * Specifies the shadows&apos; blur distance. A larger value increases the blur distance.
    */
  var blur: js.UndefOr[Double] = js.undefined
  
  /**
    * Colors the labels&apos; shadows.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Moves the shadows horizontally from their initial positions.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Moves the shadows vertically from their initial positions.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shadows&apos; transparency.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}
object Blur {
  
  inline def apply(): Blur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blur]
  }
  
  extension [Self <: Blur](x: Self) {
    
    inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
