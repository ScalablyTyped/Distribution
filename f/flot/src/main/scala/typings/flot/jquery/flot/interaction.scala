package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait interaction extends StObject {
  
  var redrawOverlayInterval: js.UndefOr[Double] = js.undefined
}
object interaction {
  
  inline def apply(): interaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[interaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: interaction] (val x: Self) extends AnyVal {
    
    inline def setRedrawOverlayInterval(value: Double): Self = StObject.set(x, "redrawOverlayInterval", value.asInstanceOf[js.Any])
    
    inline def setRedrawOverlayIntervalUndefined: Self = StObject.set(x, "redrawOverlayInterval", js.undefined)
  }
}
