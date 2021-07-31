package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait interaction extends StObject {
  
  var redrawOverlayInterval: js.UndefOr[Double] = js.undefined
}
object interaction {
  
  @scala.inline
  def apply(): interaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[interaction]
  }
  
  @scala.inline
  implicit class interactionMutableBuilder[Self <: interaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedrawOverlayInterval(value: Double): Self = StObject.set(x, "redrawOverlayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedrawOverlayIntervalUndefined: Self = StObject.set(x, "redrawOverlayInterval", js.undefined)
  }
}
