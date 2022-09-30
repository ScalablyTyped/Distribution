package typings.editly.mod

import typings.editly.editlyStrings.`rainbow-colors`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RainbowColorsLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_RainbowColorsLayer: `rainbow-colors`
}
object RainbowColorsLayer {
  
  inline def apply(): RainbowColorsLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rainbow-colors")
    __obj.asInstanceOf[RainbowColorsLayer]
  }
  
  extension [Self <: RainbowColorsLayer](x: Self) {
    
    inline def setType(value: `rainbow-colors`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
