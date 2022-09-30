package typings.editly.mod

import typings.editly.editlyStrings.in
import typings.editly.editlyStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see [Ken Burns parameters]{@link https://github.com/mifi/editly#ken-burns-parameters}
	 */
trait KenBurns extends StObject {
  
  /**
  		 * Zoom amount for Ken Burns effect.
  		 *
  		 * @default 0.1
  		 */
  var zoomAmount: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Zoom direction for Ken Burns effect.
  		 * Use `null` to disable.
  		 */
  var zoomDirection: js.UndefOr[in | out | Null] = js.undefined
}
object KenBurns {
  
  inline def apply(): KenBurns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KenBurns]
  }
  
  extension [Self <: KenBurns](x: Self) {
    
    inline def setZoomAmount(value: Double): Self = StObject.set(x, "zoomAmount", value.asInstanceOf[js.Any])
    
    inline def setZoomAmountUndefined: Self = StObject.set(x, "zoomAmount", js.undefined)
    
    inline def setZoomDirection(value: in | out): Self = StObject.set(x, "zoomDirection", value.asInstanceOf[js.Any])
    
    inline def setZoomDirectionNull: Self = StObject.set(x, "zoomDirection", null)
    
    inline def setZoomDirectionUndefined: Self = StObject.set(x, "zoomDirection", js.undefined)
  }
}
