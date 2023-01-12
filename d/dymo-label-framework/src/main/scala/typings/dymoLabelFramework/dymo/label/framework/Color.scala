package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object with properties 'a' or 'alpha' to specify color's alpha channel,
  * r/red, g/green, b/blue for red, green, blue channels.
  * The valid range for a/r/g/b fields is [0..255].
  */
trait Color extends StObject {
  
  /** alpha channel [0..255] default: 255 */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /** blue channel [0..255] default: 0 */
  var blue: js.UndefOr[Double] = js.undefined
  
  /** green channel [0..255] default: 0 */
  var green: js.UndefOr[Double] = js.undefined
  
  /** red channel [0..255] default: 0 */
  var red: js.UndefOr[Double] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
