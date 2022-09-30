package typings.editly.mod

import typings.editly.editlyStrings.pause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseLayer
  extends StObject
     with BaseLayer
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
  var type_PauseLayer: pause
}
object PauseLayer {
  
  inline def apply(): PauseLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pause")
    __obj.asInstanceOf[PauseLayer]
  }
  
  extension [Self <: PauseLayer](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setType(value: pause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
