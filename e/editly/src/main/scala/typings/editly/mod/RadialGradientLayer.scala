package typings.editly.mod

import typings.editly.editlyStrings.`radial-gradient`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGradientLayer
  extends StObject
     with BaseLayer
     with BackgroundLayer
     with Layer {
  
  /**
  		 * Array of two colors.
  		 * Defaults to random colors.
  		 */
  var colors: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_RadialGradientLayer: `radial-gradient`
}
object RadialGradientLayer {
  
  inline def apply(): RadialGradientLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[RadialGradientLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadialGradientLayer] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Tuple2[String, String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setType(value: `radial-gradient`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
