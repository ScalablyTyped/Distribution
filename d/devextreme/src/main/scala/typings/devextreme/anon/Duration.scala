package typings.devextreme.anon

import typings.devextreme.devextremeStrings.easeOutCubic
import typings.devextreme.devextremeStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[easeOutCubic | linear] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var maxPointCountSupported: js.UndefOr[Double] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: easeOutCubic | linear): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMaxPointCountSupported(value: Double): Self = StObject.set(x, "maxPointCountSupported", value.asInstanceOf[js.Any])
    
    inline def setMaxPointCountSupportedUndefined: Self = StObject.set(x, "maxPointCountSupported", js.undefined)
  }
}
