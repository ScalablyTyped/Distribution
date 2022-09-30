package typings.editly.mod

import typings.editly.editlyStrings.`fill-color`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillColorLayer
  extends StObject
     with BaseLayer
     with BackgroundLayer
     with Layer {
  
  /**
  		 * Color to fill background.
  		 * Defaults to random color.
  		 */
  var color: js.UndefOr[String] = js.undefined
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_FillColorLayer: `fill-color`
}
object FillColorLayer {
  
  inline def apply(): FillColorLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fill-color")
    __obj.asInstanceOf[FillColorLayer]
  }
  
  extension [Self <: FillColorLayer](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setType(value: `fill-color`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
